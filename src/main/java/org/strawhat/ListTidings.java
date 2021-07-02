package org.strawhat;

import java.util.Iterator;
import java.util.List;

/**
 * 列表类型响应对象，
 * @author strawhat
 */
public class ListTidings<T> extends AbstractTidings implements Iterable<T>{


    private static final long serialVersionUID = -7310866859566773779L;


    private List<T> data;


    public void setData(List<T> data){
        this.data = data;
    }

    public List<T> getData() {
        return data;
    }

    public Integer getSize() {
        if (data == null) {
            return 0;
        }

        return data.size();
    }

    public static ListTidings success(){
        ListTidings result = new ListTidings();
        result.setStatus(DEFAULT_SUCCESS_STATUS);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        return result;
    }

    public static <T> ListTidings<T> success(List<T> data){
        ListTidings result = new ListTidings();
        result.setStatus(DEFAULT_SUCCESS_STATUS);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        result.setData(data);
        return result;
    }

    public static <T> ListTidings<T> success(String message, List<T> data){
        ListTidings result = new ListTidings();
        result.setStatus(DEFAULT_SUCCESS_STATUS);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static ListTidings error(){
        ListTidings result = new ListTidings();
        result.setStatus(DEFAULT_ERROR_STATUS);
        result.setMessage(DEFAULT_ERROR_MESSAGE);
        return result;
    }

    public static ListTidings error(int status, String errorMessage){
        ListTidings result = new ListTidings();
        result.setStatus(status);
        result.setMessage(errorMessage);
        return result;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int cursor = 0;

            @Override
            public boolean hasNext() {
                if (cursor != getSize()) {
                    return true;
                }
                return false;
            }

            @Override
            public T next() {
                T item = getData().get(cursor);
                cursor++;
                return item;
            }
        };
    }
}
