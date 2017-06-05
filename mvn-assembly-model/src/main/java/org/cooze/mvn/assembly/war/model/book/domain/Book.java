package org.cooze.mvn.assembly.war.model.book.domain;

/**
 * @author cooze
 * @version 1.0.0
 * @desc
 * @date 2017/6/3
 */
public class Book {
    private Integer id;
    private String noCode;
    private String title;
    private String bookName;
    private String author;
    private String desc;

    public Book() {
    }

    public Integer getId() {
        return id;
    }

    public String getNoCode() {
        return noCode;
    }

    public void setNoCode(String noCode) {
        this.noCode = noCode;
    }

    public void setId(Integer id) {
        this.id = id;
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
