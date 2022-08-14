package common.analyser;

/**
 * 数据转换工厂,根据传入的生产者的类型,返回对应的生产方
 */
public interface ConverterFactory {

    /**
     * 根据数据源返对应的转化器
     * @param dataProducer
     * @return
     */
    Conveter getConveter(DataProducer dataProducer);
}
