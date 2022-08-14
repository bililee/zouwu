package common.analyser;


import common.message.IMessage;
import java.util.List;
/**
 * 数据转化器
 */
public interface Conveter<T> {


    /**
     *
     * @param data
     * @return
     */
    List<IMessage> exchange(T data);

}
