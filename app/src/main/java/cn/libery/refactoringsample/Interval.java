package cn.libery.refactoringsample;

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

    public void calculateLength() {
        try {
            int start = Integer.valueOf(getStart());
            int end = Integer.valueOf(getEnd());
            int length = end - start;
            setLength(String.valueOf(length));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
