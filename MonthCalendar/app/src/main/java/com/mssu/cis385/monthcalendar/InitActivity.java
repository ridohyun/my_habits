package com.mssu.cis385.monthcalendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class InitActivity extends AppCompatActivity {
        Button startbtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.init);

        startbtn = findViewById(R.id.startbtn);


        startbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HabitListActivity.class);
                startActivity(intent);
            }
        });
    }
}
