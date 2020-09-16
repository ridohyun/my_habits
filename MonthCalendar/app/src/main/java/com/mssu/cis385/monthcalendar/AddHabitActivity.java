package com.mssu.cis385.monthcalendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class AddHabitActivity extends Activity implements OnClickListener {

    private Button addTodoBtn;
    private EditText subjectEditText;
    private DBManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("Add Habit");

        setContentView(R.layout.activity_add_record);

        subjectEditText = (EditText) findViewById(R.id.subject_edittext);

        addTodoBtn = (Button) findViewById(R.id.add_record);

        // Make a database
        dbManager = new DBManager(this);
        dbManager.openDB();

        //Button click listener
        addTodoBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add_record:

                // Get habit from EditText
                final String name = subjectEditText.getText().toString();

                // Add habit in DB
                dbManager.insert(name);

                // Change activity to HabitListActivity
                Intent main = new Intent(AddHabitActivity.this, HabitListActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(main);
                break;
        }
    }

}