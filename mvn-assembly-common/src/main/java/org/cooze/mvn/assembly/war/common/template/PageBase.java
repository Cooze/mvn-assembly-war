package org.cooze.mvn.assembly.war.common.template;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * @author cooze
 * @version 1.0.0
 * @desc
 * @date 2017/6/3
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageBase implements Serializable{
    private Integer page;
    private Integer size;
    private Integer totalNum;
    private Integer totalPage;

    public PageBase() {
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
}
