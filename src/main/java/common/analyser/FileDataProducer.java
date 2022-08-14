package common.analyser;

/**
 * FileDataProducer
 *
 * @author Lee
 * @date 2022/7/17
 */
public class FileDataProducer implements DataProducer {
    @Override
    public String getType() {
        return "file";
    }
}
