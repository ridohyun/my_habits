package com.mssu.cis385.monthcalendar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 *TextView indicating date
 *
 */
public class MonthItemView extends LinearLayout {

    TextView text01;
    TextView tv_OX;
    TextView tv_memo;

    private MonthItem item;

    // Constructor with context
    public MonthItemView(Context context) {
        super(context);

        init(context);
    }
    // Constructor with context and attribute
    public MonthItemView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    // Initialize
    private void init(Context context) {
        setBackgroundColor(Color.WHITE);

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.month_view, this, true);

        text01 = (TextView)findViewById(R.id.text01);
        tv_OX= (TextView)findViewById(R.id.tv_OX);
        tv_memo = (TextView)findViewById(R.id.tv_memo);
    }

    public MonthItem getItem() {
        return item;
    }

    public void setItem(MonthItem item, int day, boolean check, String memo) {
        this.item = item;

        int days = item.getDay();
        if (days != 0) {
            text01.setText(String.valueOf(days));
            if (days == day) {
                if(check == true){
                    tv_OX.setText("O");
                }
                tv_memo.setText(memo);
            }
        } else {
            text01.setText("");
            tv_OX.setText("");
            tv_memo.setText("");
        }

    }

    public void setTextColor (int color) {
        text01.setTextColor(color);
//        text02.setTextColor(color);
    }


}
