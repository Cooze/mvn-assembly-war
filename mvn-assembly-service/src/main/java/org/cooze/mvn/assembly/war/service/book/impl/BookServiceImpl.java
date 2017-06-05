package org.cooze.mvn.assembly.war.service.book.impl;

import org.cooze.mvn.assembly.war.common.template.ResultPage;
import org.cooze.mvn.assembly.war.common.utils.JsonUtil;
import org.cooze.mvn.assembly.war.model.book.domain.Book;
import org.cooze.mvn.assembly.war.model.book.dto.BookDto;
import org.cooze.mvn.assembly.war.service.book.inter.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * @author xianzhe_song
 * @version 1.0.0
 * @desc
 * @date 2017/6/3
 */
@Service
public class BookServiceImpl implements BookService {

    @Override
    public Book getBook(String noCode) throws Exception {
        Book book = new Book();
        book.setNoCode(noCode);
        book.setBookName("西游记");
        book.setTitle("大闹天空");
        book.setAuthor("吴承恩");
        book.setId(1);
        book.setDesc("《西游记之大闹天宫》是由星皓电影有限公司出品的动作奇幻片，" +
                "由香港导演郑保瑞执导，甄子丹、周润发、郭富城领衔主演。" +
                "影片于2014年1月31日在中国大陆上映。该片根据中国古典神魔小说《西游记》前八回改编，" +
                "讲述了决心修炼成仙的孙悟空在牛魔王的煽动下大闹天庭，迫使三界展开神魔大战的故事");

        return book;
    }

    @Override
    public ResultPage<List<Book>> getBookPage(BookDto bookDto, Integer page, Integer size) throws Exception {
        ResultPage<List<Book>> resultPage = new ResultPage<>();

        String jsonStr = JsonUtil.nonNullMapper().toJson(bookDto);
        if ("null".equals(jsonStr) || "{}".equals(jsonStr)) {
            resultPage.setPage(page);
            resultPage.setSize(size);
            resultPage.setTotalNum(0);
            resultPage.setTotalPage(0);
            return resultPage;
        }
        List<Book> books = new ArrayList<>();
        Book book1 = new Book();
        book1.setNoCode("10001");
        book1.setBookName("西游记");
        book1.setTitle("大闹天空");
        book1.setAuthor("吴承恩");
        book1.setId(1);
        book1.setDesc("《西游记之大闹天宫》是由星皓电影有限公司出品的动作奇幻片，" +
                "由香港导演郑保瑞执导，甄子丹、周润发、郭富城领衔主演。" +
                "影片于2014年1月31日在中国大陆上映。该片根据中国古典神魔小说《西游记》前八回改编，" +
                "讲述了决心修炼成仙的孙悟空在牛魔王的煽动下大闹天庭，迫使三界展开神魔大战的故事");

        Book book2 = new Book();
        book2.setNoCode("10002");
        book2.setBookName("西游记2");
        book2.setTitle("大闹天空2");
        book2.setAuthor("吴承恩2");
        book2.setId(2);
        book2.setDesc("《西游记之大闹天宫》是由星皓电影有限公司出品的动作奇幻片，" +
                "由香港导演郑保瑞执导，甄子丹、周润发、郭富城领衔主演。" +
                "影片于2014年1月31日在中国大陆上映。该片根据中国古典神魔小说《西游记》前八回改编，" +
                "讲述了决心修炼成仙的孙悟空在牛魔王的煽动下大闹天庭，迫使三界展开神魔大战的故事");
        books.add(book1);
        books.add(book2);
        resultPage.setResult(books);
        resultPage.setPage(page);
        resultPage.setSize(size);
        resultPage.setTotalNum(2);
        int totalPage = 2 / size;
        resultPage.setTotalPage(totalPage == 0 ? 1 : totalPage);
        return resultPage;
    }

}
