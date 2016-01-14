package com.sunxipeng.test;


import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;

import antistatic.spinnerwheel.AbstractWheel;
import antistatic.spinnerwheel.OnWheelChangedListener;
import antistatic.spinnerwheel.OnWheelScrollListener;
import antistatic.spinnerwheel.WheelVerticalView;
import antistatic.spinnerwheel.adapters.ArrayWheelAdapter;

/**
 * Created by Administrator on 2016/1/14.
 */
public class DatePicker extends Dialog {


    private WheelVerticalView wheelVerticalView;

    private ArrayWheelAdapter wheelViewAdapter;

    public DatePicker(Context context) {

        super(context, R.style.CustomDialog);

        View view = LayoutInflater.from(context).inflate(R.layout.widget_cascade_wheel_picker,null);

        setContentView(view);

        wheelVerticalView = (WheelVerticalView) view.findViewById(R.id.wheel_picker);

        WindowManager.LayoutParams params = getWindow().getAttributes();

        params.width = WindowManager.LayoutParams.MATCH_PARENT;

        params.gravity = Gravity.BOTTOM;

        setCanceledOnTouchOutside(true);

        init(context);


    }

    private void init(Context context) {

        String array[] = new String[50];


        for(int i=0; i<array.length; i++){

            array[i] = String.valueOf(2011+i);

        }

        wheelViewAdapter = new ArrayWheelAdapter(context,array);

        wheelVerticalView.setVisibleItems(3);

        wheelViewAdapter.setItemResource(R.layout.wheel_picker_item);

        wheelViewAdapter.setItemTextResource(R.id.wheel_picker_item_content);

        wheelVerticalView.setViewAdapter(wheelViewAdapter);

        //wheelVerticalView.setCyclic(true);

        wheelVerticalView.setCurrentItem(2);


        /**
         * 用于实现城市的二级联动实现的效果
         */
        wheelVerticalView.addChangingListener(new OnWheelChangedListener() {
            @Override
            public void onChanged(AbstractWheel wheel, int oldValue, int newValue) {

            }
        });

        wheelVerticalView.addScrollingListener(new OnWheelScrollListener() {
            @Override
            public void onScrollingStarted(AbstractWheel wheel) {

            }

            @Override
            public void onScrollingFinished(AbstractWheel wheel) {

            }
        });


    }
}
