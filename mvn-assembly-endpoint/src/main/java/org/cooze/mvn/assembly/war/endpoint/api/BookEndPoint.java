package org.cooze.mvn.assembly.war.endpoint.api;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.cooze.mvn.assembly.war.common.Constant.MIME_CONSTANT;
import org.cooze.mvn.assembly.war.common.template.ResultPage;
import org.cooze.mvn.assembly.war.common.template.ReturnData;
import org.cooze.mvn.assembly.war.common.utils.BeanUtil;
import org.cooze.mvn.assembly.war.model.book.domain.Book;
import org.cooze.mvn.assembly.war.model.book.dto.BookDto;
import org.cooze.mvn.assembly.war.service.book.inter.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cooze
 * @version 1.0.0
 * @desc
 * @date 2017/6/3
 */
@Api(value = "图书API", description = "提供关于图书的CURD API操作")
@RestController
public class BookEndPoint {

    private static final Logger LOG = LoggerFactory.getLogger(BookEndPoint.class);

    @Autowired
    private BookService bookService;


    @ApiOperation(value = "查书籍详情", notes = "根据书籍编号获取书籍详情")
    @GetMapping(value = "/books/{noCode}", produces = MIME_CONSTANT.JSON_UTF8)
    public ReturnData<BookDto> getBook(@ApiParam(name = "noCode", required = true, value = "书籍编号")
                                       @PathVariable(name = "noCode") String noCode) {
        try {
            ReturnData<BookDto> returnData = new ReturnData<>();
            Book book = bookService.getBook(noCode);
            returnData.setResult(BeanUtil.map(book,BookDto.class));
            return returnData;
        }catch (Exception e){
            LOG.error("get book detail error,error info :{}",e);
            return new ReturnData<>("request error.",10001);
        }

    }

    @ApiOperation(value = "分页查书籍", notes = "分页查书籍")
    @GetMapping(value = "/books", produces = MIME_CONSTANT.JSON_UTF8)
    public ReturnData<List<BookDto>> getBookPage(@ApiParam(name = "title", value = "标题")
                                                 @RequestParam(name = "title", required = false) String title,
                                                 @ApiParam(name = "bookName", value = "名称")
                                                 @RequestParam(name = "bookName", required = false) String bookName,
                                                 @ApiParam(name = "author", value = "作者")
                                                 @RequestParam(name = "author", required = false) String author,
                                                 @ApiParam(name = "desc", value = "描述")
                                                 @RequestParam(name = "desc", required = false) String desc,
                                                 @ApiParam(name = "page", value = "当前页", defaultValue = "1")
                                                 @RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
                                                 @ApiParam(name = "size", value = "每页显示条数", defaultValue = "20")
                                                 @RequestParam(name = "size", required = false, defaultValue = "20") Integer size) {
        try{
            ReturnData<List<BookDto>> returnData = new ReturnData<>();

            BookDto requestParam = new BookDto();
            requestParam.setAuthor(author);
            requestParam.setBookName(bookName);
            requestParam.setDesc(desc);
            requestParam.setTitle(title);


            ResultPage<List<Book>> resultPage = this.bookService.getBookPage(requestParam,page,size);

            returnData.setTotalNum(resultPage.getTotalNum());
            returnData.setTotalPage(resultPage.getTotalPage());
            returnData.setSize(resultPage.getSize());
            returnData.setPage(resultPage.getPage());
            List<Book> books =  resultPage.getResult();
            if(books==null||books.isEmpty()){
                return returnData;
            }
            List<BookDto> resultBooks=  BeanUtil.mapList(books,Book.class,BookDto.class);
            returnData.setResult(resultBooks);
            return returnData;
        }catch (Exception e){
            LOG.error("get book List error,error info:{}",e);
            return new ReturnData<>("get book List error",10001);
        }
    }
}
