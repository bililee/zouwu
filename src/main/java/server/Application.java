package server;

import common.analyser.Conveter;
import common.analyser.DefaultConvertFactory;
import common.analyser.FileDataProducer;
import common.message.IMessage;
import server.event.DefaultCustomEventListener;
import server.event.Event;
import server.event.EventTypeEnum;

import java.util.List;

/**
 * Application
 *
 * @author Lee
 * @date 2022/7/17
 */
public class Application {

    public static void main(String[] args) {
        DefaultCustomEventListener defaultCustomEventListener = new DefaultCustomEventListener();
        Event<String> event = new Event<>(EventTypeEnum.TEST_SAY, "hey");
        defaultCustomEventListener.dispatchEvent(event);
//        // 取到消息体
//        DefaultConvertFactory defaultConvertFactory = new DefaultConvertFactory();
//        Conveter conveter = defaultConvertFactory.getConveter(new FileDataProducer());
//        List<IMessage> exchange = conveter.exchange(null);
//        exchange.forEach(msg -> {
//
//        });

    }
}
