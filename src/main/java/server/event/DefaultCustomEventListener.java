package server.event;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
/**
 * DefaultCustomEventListener
 *
 * @author Lee
 * @date 2022/8/14
 */
public class DefaultCustomEventListener implements CustomEventListener{

    private ConcurrentHashMap<EventTypeEnum, List<AppEventListener>> eventMap = new ConcurrentHashMap<>();




    public DefaultCustomEventListener() {
        System.out.println("init");
        this.attachEvent(EventTypeEnum.TEST_SAY, this::say);
    }

    @Override
    public void attachEvent(EventTypeEnum eventTypeEnum, AppEventListener appEventListener) {
        eventMap.computeIfAbsent(eventTypeEnum, k -> new ArrayList<>()).add(appEventListener);
    }

    @Override
    public <T> void dispatchEvent(Event<T> event) {
        eventMap.get(event.getType()).forEach(item -> {
            item.accept(event);
        });
    }

    public void say (Event<?> event) {
        System.out.println(123);
        System.out.println(event.getData().toString());
    }


}
