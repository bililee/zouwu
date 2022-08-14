package server.event;


import java.util.function.Consumer;

/**
 * AppEventListener
 *
 * @author Lee
 * @date 2022/8/14
 */
public interface AppEventListener extends Consumer<Event<?>> {
}
