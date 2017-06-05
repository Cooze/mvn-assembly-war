package org.cooze.mvn.assembly.war.common.template;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * @author cozoe
 * @version 1.0.0
 * @desc
 * @date 2017/6/3
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReturnData<T> extends PageBase implements Serializable {
    private String msg = "success";
    private Integer code = 10000;

    private T result;

    public ReturnData() {
    }

    public ReturnData(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
