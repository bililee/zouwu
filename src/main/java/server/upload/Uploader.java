package server.upload;

import common.message.IMessage;
import common.route.Router;

/**
 * Uploader
 * 上传工具
 * @author Lee
 * @date 2022/7/17
 */
public interface Uploader {

    /**
     * 将msg 通过route 上传到对应的位置
     * @param msg
     * @param route
     * @return
     */
    public Boolean send(IMessage msg, Router route);

}
