package common.message.packer;

import common.message.IMessage;

import java.io.InputStream;
import java.util.List;

/**
 * IPacker 打包/拆包器
 *
 * @author Lee
 * @date 2022/8/14
 */
public interface IPacker {

    /**
     * 拆包，将输入流拆成多个messgae
     * @param inputStream
     * @return
     */
    public List<IMessage>  dividePkgs(InputStream inputStream);

    /**
     * 合包，将包合并成一个，这里是通过IMessage 中的唯一id来找到原来已经存到buffer中的包
     * @param iMessage
     */
    public void mergePkgs(IMessage iMessage);


    /**
     * 合包，合并成一个对应的，这里直接存的是所有的包
     * @param msgList 信息包
     * @return 返回一个inputstream
     */
    public InputStream mergeAllPkgs(List<IMessage> msgList);
}
