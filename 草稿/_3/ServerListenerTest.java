package 草稿._3;

public class ServerListenerTest {

    public static void main(String[] args) {
        //定义事件源管理实践
        ServerUpdateEventSource eventSource = new ServerUpdateEventSource();
        ServerUpdateListener listener = new ServerUpdateListener();

        // 注册监听，往事件源添加监听
        eventSource.addServerUpdateEventListener(listener);

        // 模拟事件触发
        ServerUpdateEvent event = new ServerUpdateEvent("HelloWorld");
        // 用事件源激活事件，最终执行的是监听实现类里的@Override方法
        eventSource.fireServerUpdateEvent(event);
    }
}
