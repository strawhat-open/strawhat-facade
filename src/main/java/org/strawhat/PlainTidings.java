package org.strawhat;

/**
 * 简单的响应对象，
 * @author strawhat
 */
public class PlainTidings<T> extends AbstractTidings {

    private static final long serialVersionUID = -5255442201419731987L;


    private T data;


    public void setData(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public static PlainTidings success(){
        PlainTidings result = new PlainTidings();
        result.setStatus(DEFAULT_SUCCESS_STATUS);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        return result;
    }

    public static <T> PlainTidings<T> success(T data){
        PlainTidings result = new PlainTidings();
        result.setStatus(DEFAULT_SUCCESS_STATUS);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        result.setData(data);
        return result;
    }

    public static <T> PlainTidings<T> success(String message, T data){
        PlainTidings result = new PlainTidings();
        result.setStatus(DEFAULT_SUCCESS_STATUS);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static PlainTidings error(){
        PlainTidings result = new PlainTidings();
        result.setStatus(DEFAULT_ERROR_STATUS);
        result.setMessage(DEFAULT_ERROR_MESSAGE);
        return result;
    }

    public static PlainTidings error(int status, String errorMessage){
        PlainTidings result = new PlainTidings();
        result.setStatus(status);
        result.setMessage(errorMessage);
        return result;
    }
}
