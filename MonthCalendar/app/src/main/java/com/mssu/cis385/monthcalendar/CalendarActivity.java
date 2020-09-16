package com.mssu.cis385.monthcalendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class CalendarActivity extends AppCompatActivity {

    // CalendarView for month
    GridView monthView;

     // CalendarAdapter for month
    MonthAdapter monthViewAdapter;

    // TextView indicating month
    TextView monthText;

    // Current year
    int curYear;

    // Current month
    int curMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_activity);

        // Get intent from HabitCheckActivity
        Intent fromHabitCheck = getIntent();
        int day = fromHabitCheck.getIntExtra("day", 0);
        boolean check = fromHabitCheck.getBooleanExtra("check", false);
        String memo = fromHabitCheck.getStringExtra("memo");

        monthView = (GridView) findViewById(R.id.monthView);
        monthViewAdapter = new MonthAdapter(this);
        if(check == true || memo != null) {
            monthViewAdapter.addCheckMemo (day, check, memo);
            monthViewAdapter.notifyDataSetChanged();
        }
        monthView.setAdapter(monthViewAdapter);

        // Listener
        monthView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // The date what you selected
                MonthItem curItem = (MonthItem) monthViewAdapter.getItem(position);
                int day = curItem.getDay();

//                Log.d("CalendarActivity", "Selected : " + day);

                //Go to HabitCheckActivity
                Intent intent = new Intent(getApplicationContext(), HabitCheckActivity.class);
                intent.putExtra("day", day);
                startActivity(intent);
            }
        });


        monthText = (TextView) findViewById(R.id.monthText);
        setMonthText();

        // Event going to previous month
        Button monthPrevious = (Button) findViewById(R.id.monthPrevious);
        monthPrevious.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                monthViewAdapter.setPreviousMonth();
                monthViewAdapter.notifyDataSetChanged();

                setMonthText();
            }
        });

        // Event going to next month
        Button monthNext = (Button) findViewById(R.id.monthNext);
        monthNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                monthViewAdapter.setNextMonth();
                monthViewAdapter.notifyDataSetChanged();

                setMonthText();
            }
        });
    }

    //Show year and month
    private void setMonthText() {
        curYear = monthViewAdapter.getCurYear();
        curMonth = monthViewAdapter.getCurMonth();

        monthText.setText(curYear + "/" + (curMonth + 1));
    }
}