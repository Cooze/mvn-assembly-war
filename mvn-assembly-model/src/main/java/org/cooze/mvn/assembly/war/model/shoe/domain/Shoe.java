package org.cooze.mvn.assembly.war.model.shoe.domain;

/**
 * @author cooze
 * @version 1.0.0
 * @desc
 * @date 2017/6/3
 */
public class Shoe {

    private Integer id;
    private String noCode;
    private Integer size;
    private String brand;
    private String type;
    private String desc;

    public Shoe() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoCode() {
        return noCode;
    }

    public void setNoCode(String noCode) {
        this.noCode = noCode;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
