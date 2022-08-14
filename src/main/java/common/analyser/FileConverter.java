package common.analyser;



import common.message.BasicMsg;
import common.message.IMessage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件内容解析器
 */
public class FileConverter implements Conveter {

    @Override
    public List<IMessage> exchange(Object data) {
        // 将 data的数据转化成为 多个包
        List<IMessage> msgPkgList = new ArrayList<>();
        String path = "data.txt";
        InputStream fileInputStream = null;
        try {
            int serialNumber = 0;
            BasicMsg msg = new BasicMsg();
            byte[] cn = new byte[20];
            fileInputStream = FileConverter.class.getClassLoader().getResourceAsStream(path);
            int len = -1;
            while ((len = fileInputStream.read(cn)) != -1) {
                System.out.println(new String(cn));
                serialNumber ++;
                msg.setMsg(cn);
                msg.setOrderNumber(Long.valueOf(serialNumber));
                msgPkgList.add(msg);
            }
            fileInputStream.close();
        } catch (IOException e) {
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException exp) {
                    exp.printStackTrace();
                }
            }
        }
        return msgPkgList;
    }
}
