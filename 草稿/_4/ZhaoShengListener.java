package 草稿._4;

public class ZhaoShengListener implements ZhaoShengListenerInterface {
    @Override
    public void recruit(ZhaoShengEvent e) {
        System.out.println("触发招生事件");
    }
}
