package server.upload;

import common.message.IMessage;
import common.route.Router;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * LocalUploader
 *
 * @author Lee
 * @date 2022/7/17
 */
public class LocalUploader implements Uploader{

    public static ConcurrentLinkedDeque<IMessage> localMsgList;

    @Override
    public Boolean send(IMessage msg, Router route) {
        try {
            localMsgList.add(msg);
            return true;
        } catch (Exception exp) {
            return false;
        }
    }
}
