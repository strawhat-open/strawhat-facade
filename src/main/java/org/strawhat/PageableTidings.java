package org.strawhat;

import java.util.List;

/**
 * 可分页的响应消息
 * @author strawhat
 * @param <T>
 */
public class PageableTidings<T> extends ListTidings<T> {


    private static final long serialVersionUID = 6217401423899757189L;

    /**
     * 当前第几页（从1开始）
     */
    private Integer pageNo;

    /**
     * 每页的大小
     */
    private Integer pageSize;

    /**
     * 总条数
     */
    private Long total;


    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public static PageableTidings success(){
        PageableTidings result = new PageableTidings();
        result.setStatus(DEFAULT_SUCCESS_STATUS);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        return result;
    }

    public static <T> PageableTidings<T> success(List<T> data){
        PageableTidings result = new PageableTidings();
        result.setStatus(DEFAULT_SUCCESS_STATUS);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        result.setData(data);
        return result;
    }

    public static <T> PageableTidings<T> success(List<T> data, Integer pageNo, Integer pageSize){
        PageableTidings result = new PageableTidings();
        result.setStatus(DEFAULT_SUCCESS_STATUS);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        result.setData(data);
        result.setPageSize(pageSize);
        result.setPageNo(pageNo);
        return result;
    }

    public static PageableTidings success(String message){
        PageableTidings result = new PageableTidings();
        result.setStatus(DEFAULT_SUCCESS_STATUS);
        result.setMessage(message);
        return result;
    }

    public static <T> PageableTidings<T> success(String message, List<T> data){
        PageableTidings result = new PageableTidings();
        result.setStatus(DEFAULT_SUCCESS_STATUS);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static <T> PageableTidings<T> success(String message, List<T> data, Integer pageNo, Integer pageSize){
        PageableTidings result = new PageableTidings();
        result.setStatus(DEFAULT_SUCCESS_STATUS);
        result.setMessage(message);
        result.setData(data);
        result.setPageSize(pageSize);
        result.setPageNo(pageNo);
        return result;
    }

    public static PageableTidings error(){
        PageableTidings result = new PageableTidings();
        result.setStatus(DEFAULT_ERROR_STATUS);
        result.setMessage(DEFAULT_ERROR_MESSAGE);
        return result;
    }

    public static PageableTidings error(int status, String errorMessage){
        PageableTidings result = new PageableTidings();
        result.setStatus(status);
        result.setMessage(errorMessage);
        return result;
    }
}
