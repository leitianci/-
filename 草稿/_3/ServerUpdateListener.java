package 草稿._3;

public class ServerUpdateListener implements ServerUpdateListenerInterface {

    // 自定义事件被触发时，根据事件执行以下操作
    protected void doReloadExecutors(ServerUpdateEvent e) {
        System.out.println(e);
    }

    @Override
    public void handleEvent(ServerUpdateEvent serverUpdateEvent) {
        doReloadExecutors(serverUpdateEvent);
    }
}
