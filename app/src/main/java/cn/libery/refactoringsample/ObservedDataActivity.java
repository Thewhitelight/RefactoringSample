package cn.libery.refactoringsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.Observable;
import java.util.Observer;

public class ObservedDataActivity extends AppCompatActivity implements Observer {

    private EditText startEdit;
    private EditText endEdit;
    private EditText lengthEdit;
    private Interval data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observed_data);
        startEdit = (EditText) findViewById(R.id.start);
        endEdit = (EditText) findViewById(R.id.end);
        lengthEdit = (EditText) findViewById(R.id.length);
        data = new Interval();
        data.addObserver(this);
        update(data, null);
    }

    @Override
    public void update(Observable o, Object arg) {
        data.calculateLength();
    }

    public String getStart() {
        return data.getStart();
    }

    public void setStart(String arg) {
        arg = TextUtils.isEmpty(arg) ? "0" : arg;
        data.setStart(arg);
    }

    public String getEnd() {
        return data.getEnd();
    }

    public void setEnd(String arg) {
        arg = TextUtils.isEmpty(arg) ? "0" : arg;
        data.setEnd(arg);
    }

    public String getLength() {
        return data.getLength();
    }

    public void setLength(String arg) {
        arg = TextUtils.isEmpty(arg) ? "0" : arg;
        data.setLength(arg);
    }

}
