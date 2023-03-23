package sem04;

import java.util.Objects;

public class SimplBox {
    private Object myObject;

    public SimplBox(Object myObject) {
        this.myObject = myObject;
    }


    public Object getMyObject() {
        return myObject;
    }

    public void setMyObject(Object myObject) {
        this.myObject = myObject;
    }
}
