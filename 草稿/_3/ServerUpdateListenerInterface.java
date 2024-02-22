package 草稿._3;

import java.util.EventListener;

public interface ServerUpdateListenerInterface extends EventListener {
    void handleEvent(ServerUpdateEvent serverUpdateEvent);
}
