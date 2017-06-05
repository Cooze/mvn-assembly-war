package org.cooze.mvn.assembly.war.common.template;

import java.io.Serializable;

/**
 * @author cooze
 * @version 1.0.0
 * @desc
 * @date 2017/6/3
 */
public class ResultPage<T> extends PageBase implements Serializable {
    T result;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
