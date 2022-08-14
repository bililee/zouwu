package common.analyser;

/**
 * DefaultConvertFactory
 *
 * @author Lee
 * @date 2022/7/17
 */
public class DefaultConvertFactory implements ConverterFactory{


    @Override
    public Conveter getConveter(DataProducer dataProducer) {
        if (dataProducer.getType() == "file") {
            return new FileConverter();
        }
        return null;
    }
}
