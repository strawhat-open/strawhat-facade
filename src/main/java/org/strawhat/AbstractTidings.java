package org.strawhat;

import java.io.Serializable;

/**
 * abstract Tidings
 * @author strawhat
 */
public abstract class AbstractTidings implements Tidings, Serializable {

    private static final long serialVersionUID = 443901135648298785L;
    /**
     * 默认的成功状态码
     */
    public static final int DEFAULT_SUCCESS_STATUS = TidingsStatus.OK.value();
    /**
     * 默认的成功消息
     */
    public static final String DEFAULT_SUCCESS_MESSAGE = TidingsStatus.OK.getReasonPhrase();
    /**
     * 默认的错误消息
     */
    public static final int DEFAULT_ERROR_STATUS = TidingsStatus.INTERNAL_SERVER_ERROR.value();
    /**
     * 默认的错误消息
     */
    public static final String DEFAULT_ERROR_MESSAGE = TidingsStatus.INTERNAL_SERVER_ERROR.getReasonPhrase();
    /**
     * 状态
     */
    private int status;
    /**
     * 错误原因
     */
    private String error;
    /**
     * 消息 自定义
     */
    private String message;


    public AbstractTidings(){
        this.status = DEFAULT_SUCCESS_STATUS;
        this.message = DEFAULT_SUCCESS_MESSAGE;
    }


    @Override
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess(){
        return getStatus() == DEFAULT_SUCCESS_STATUS;
    }
}
