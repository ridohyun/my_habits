package com.mssu.cis385.monthcalendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class HabitCheckActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.habit_check);

        final CheckBox checkBox = findViewById(R.id.checkBox);
        final EditText input_memo = findViewById(R.id.input_memo);
        Button habit_memo_add = findViewById(R.id.habit_memo_add);
        Button habit_memo_del = findViewById(R.id.habit_memo_del);

        Intent fromCalendar = getIntent();
        final int day = fromCalendar.getIntExtra("day", 0);

        habit_memo_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String memo = input_memo.getText().toString();
                Intent intent = new Intent(getApplicationContext(), CalendarActivity.class);
                intent.putExtra("day", day);

                if(checkBox.isChecked()) {
                    boolean check = true;
                    intent.putExtra("check", check);
                }
                intent.putExtra("memo", memo);
                startActivity(intent);
            }
        });

        habit_memo_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
