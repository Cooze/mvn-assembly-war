package org.cooze.mvn.assembly.war.model.book.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author xianzhe_song
 * @version 1.0.0
 * @desc
 * @date 2017/6/3
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookDto {
    private String noCode;
    private String title;
    private String bookName;
    private String author;
    private String desc;

    public BookDto() {
    }


    public String getNoCode() {
        return noCode;
    }

    public void setNoCode(String noCode) {
        this.noCode = noCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
