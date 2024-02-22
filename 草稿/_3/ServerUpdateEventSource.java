package 草稿._3;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件源
 * <p/>
 * Date 2018年9月6日 下午4:24:06
 * <p/>
 *
 */
public class ServerUpdateEventSource {

    private static List<ServerUpdateListenerInterface> listeners = new ArrayList<ServerUpdateListenerInterface>();

    public ServerUpdateEventSource() {
    }

    // 添加一个监听
    public void addServerUpdateEventListener(ServerUpdateListenerInterface e) {
        listeners.add(e);
    }

    // 删除一个监听
    public void deleteServerUpdateEventListener(ServerUpdateListenerInterface e) {
        listeners.remove(e);
    }

    // 激活监听事件
    public void fireServerUpdateEvent(ServerUpdateEvent event) {
        for (ServerUpdateListenerInterface listener : listeners) {
            listener.handleEvent(event);
            System.out.println("激活监听事件");
        }
    }
}
