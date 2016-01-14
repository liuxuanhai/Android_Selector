package com.sunxipeng.test;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    /**
     * 快捷键大小写转换，ctrl+shift+u;
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        DatePicker datePicker = new DatePicker(this);

        datePicker.show();

    }
}
