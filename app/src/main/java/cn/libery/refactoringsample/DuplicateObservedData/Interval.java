package cn.libery.refactoringsample.DuplicateObservedData;

import java.util.Observable;

/**
 * Created by ibery on 2017/3/15.
 */

public class Interval extends Observable {

    private String start = "0";
    private String end = "0";
    private String length = "0";

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
        setChanged();
        notifyObservers();
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
        setChanged();
        notifyObservers();
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
        setChanged();
        notifyObservers();
    }

    public void calculateLength() throws Exception {
        int length = Integer.valueOf(getEnd()) - Integer.valueOf(getStart());
        setLength(String.valueOf(length));
    }

}
