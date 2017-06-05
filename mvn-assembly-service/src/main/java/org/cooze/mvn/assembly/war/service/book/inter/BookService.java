package org.cooze.mvn.assembly.war.service.book.inter;

import java.util.List;
import org.cooze.mvn.assembly.war.common.template.ResultPage;
import org.cooze.mvn.assembly.war.model.book.domain.Book;
import org.cooze.mvn.assembly.war.model.book.dto.BookDto;

/**
 * @author xianzhe_song
 * @version 1.0.0
 * @desc
 * @date 2017/6/3
 */
public interface BookService {

    Book getBook(String noCode)  throws Exception;

    ResultPage<List<Book>> getBookPage(BookDto bookDto, Integer page, Integer size) throws Exception;
}
