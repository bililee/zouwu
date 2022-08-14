
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 测试下推送下相关的信息
 */
public class TestSendMsg {

    @Test
    public  void test() {
        File file = new File("D:\\data.txt");
        try {
            byte[] cn = new byte[20];
            FileInputStream fileInputStream = new FileInputStream(file);
            int len = -1;
            while ((len = fileInputStream.read(cn)) != -1) {
                System.out.println(new String(cn));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
