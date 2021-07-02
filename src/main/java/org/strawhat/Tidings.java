package org.strawhat;

/**
 * 消息，音信
 * @author strawhat
 */
public interface Tidings {
    /**
     * 状态码
     * @return
     */
    int getStatus();

    /**
     * 错误消息
     * @return
     */
    String getError();

    /**
     * 消息
     * @return
     */
    String getMessage();
}
