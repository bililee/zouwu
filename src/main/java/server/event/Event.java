package server.event;

import lombok.Data;

/**
 * Event
 *
 * @author Lee
 * @date 2022/8/14
 */
@Data
public class Event<T> {
    private T data;

    private EventTypeEnum type;

    public Event(EventTypeEnum type, T data) {
        this.type = type;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public EventTypeEnum getType() {
        return type;
    }

    public void setType(EventTypeEnum type) {
        this.type = type;
    }
}
