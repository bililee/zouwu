package server.event;

import java.awt.event.ActionListener;
import java.util.EventListener;

/**
 * CustomEventListener
 * 事件监听器
 * @author Lee
 * @date 2022/8/14
 */
public interface CustomEventListener extends EventListener {

    public void attachEvent(EventTypeEnum eventTypeEnum, AppEventListener appEventListener);

    public <T extends Object> void dispatchEvent(Event<T> event);
}
