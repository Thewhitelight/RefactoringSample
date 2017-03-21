package cn.libery.refactoringsample.DuplicateObservedData;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Observable;
import java.util.Observer;

import cn.libery.refactoringsample.R;

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
        startEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                setStart(startEdit.getText().toString());
                calculateLength();

            }
        });
        endEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                setEnd(endEdit.getText().toString());
                calculateLength();
            }
        });

    }

    @Override
    public void update(Observable o, Object arg) {
        lengthEdit.setText(getLength());
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

    public void calculateLength() {
        try {
            data.calculateLength();
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

}
