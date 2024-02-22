package 草稿._3;

import java.util.EventObject;

public class ServerUpdateEvent extends EventObject {

    private static final long serialVersionUID = 1L;

    private Object obj;

    public ServerUpdateEvent(Object source) {
        super(source);
    }

    public Object getObj() {
        return obj;
    }

}
