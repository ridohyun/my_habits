package com.example.habitcheck;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ItemViewList extends AppCompatActivity {

    // Define views
    GridView gridView;
    EditText et_habit_name;
    EditText et_day_of_start;
    EditText et_memo;
    Button save_memo;
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    CheckBox checkBox6;
    CheckBox checkBox7;
    CheckBox checkBox8;
    CheckBox checkBox9;
    CheckBox checkBox10;
    CheckBox checkBox11;
    CheckBox checkBox12;
    CheckBox checkBox13;
    CheckBox checkBox14;
    CheckBox checkBox15;
    CheckBox checkBox16;
    CheckBox checkBox17;
    CheckBox checkBox18;
    CheckBox checkBox19;
    CheckBox checkBox20;
    CheckBox checkBox21;
    CheckBox checkBox22;
    CheckBox checkBox23;
    CheckBox checkBox24;
    CheckBox checkBox25;
    CheckBox checkBox26;
    CheckBox checkBox27;
    CheckBox checkBox28;
    CheckBox checkBox29;
    CheckBox checkBox30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_view_list);

        //Get views
        et_habit_name = (EditText)findViewById(R.id.et_habit_name);
        et_day_of_start = (EditText)findViewById(R.id.et_day_of_start);
        et_memo = (EditText)findViewById(R.id.et_memo);
        save_memo = (Button)findViewById(R.id.save_memo);
        checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox)findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox)findViewById(R.id.checkBox6);
        checkBox7 = (CheckBox)findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox)findViewById(R.id.checkBox8);
        checkBox9 = (CheckBox)findViewById(R.id.checkBox9);
        checkBox10 = (CheckBox)findViewById(R.id.checkBox10);
        checkBox11 = (CheckBox)findViewById(R.id.checkBox11);
        checkBox12 = (CheckBox)findViewById(R.id.checkBox12);
        checkBox13 = (CheckBox)findViewById(R.id.checkBox13);
        checkBox14 = (CheckBox)findViewById(R.id.checkBox14);
        checkBox15 = (CheckBox)findViewById(R.id.checkBox15);
        checkBox16 = (CheckBox)findViewById(R.id.checkBox16);
        checkBox17 = (CheckBox)findViewById(R.id.checkBox17);
        checkBox18 = (CheckBox)findViewById(R.id.checkBox18);
        checkBox19 = (CheckBox)findViewById(R.id.checkBox19);
        checkBox20 = (CheckBox)findViewById(R.id.checkBox20);
        checkBox21 = (CheckBox)findViewById(R.id.checkBox21);
        checkBox22 = (CheckBox)findViewById(R.id.checkBox22);
        checkBox23 = (CheckBox)findViewById(R.id.checkBox23);
        checkBox24 = (CheckBox)findViewById(R.id.checkBox24);
        checkBox25 = (CheckBox)findViewById(R.id.checkBox25);
        checkBox26 = (CheckBox)findViewById(R.id.checkBox26);
        checkBox27 = (CheckBox)findViewById(R.id.checkBox27);
        checkBox28 = (CheckBox)findViewById(R.id.checkBox28);
        checkBox29 = (CheckBox)findViewById(R.id.checkBox29);
        checkBox30 = (CheckBox)findViewById(R.id.checkBox30);

        //Get elements from sharedPreferences
        SharedPreferences pref=getSharedPreferences("pref",Activity.MODE_PRIVATE);

        // Get habit name, day_of_start, memo
        String habit_name = pref.getString("habit_name", "");
        String day_of_start = pref.getString("day_of_start", "");
        String memo = pref.getString("memo", "");
        Boolean chk1=pref.getBoolean("chk1", false);
        Boolean chk2=pref.getBoolean("chk2", false);
        Boolean chk3=pref.getBoolean("chk3", false);
        Boolean chk4=pref.getBoolean("chk4", false);
        Boolean chk5=pref.getBoolean("chk5", false);
        Boolean chk6=pref.getBoolean("chk6", false);
        Boolean chk7=pref.getBoolean("chk7", false);
        Boolean chk8=pref.getBoolean("chk8", false);
        Boolean chk9=pref.getBoolean("chk9", false);
        Boolean chk10=pref.getBoolean("chk10", false);
        Boolean chk11=pref.getBoolean("chk11", false);
        Boolean chk12=pref.getBoolean("chk12", false);
        Boolean chk13=pref.getBoolean("chk13", false);
        Boolean chk14=pref.getBoolean("chk14", false);
        Boolean chk15=pref.getBoolean("chk15", false);
        Boolean chk16=pref.getBoolean("chk16", false);
        Boolean chk17=pref.getBoolean("chk17", false);
        Boolean chk18=pref.getBoolean("chk18", false);
        Boolean chk19=pref.getBoolean("chk19", false);
        Boolean chk20=pref.getBoolean("chk20", false);
        Boolean chk21=pref.getBoolean("chk21", false);
        Boolean chk22=pref.getBoolean("chk22", false);
        Boolean chk23=pref.getBoolean("chk23", false);
        Boolean chk24=pref.getBoolean("chk24", false);
        Boolean chk25=pref.getBoolean("chk25", false);
        Boolean chk26=pref.getBoolean("chk26", false);
        Boolean chk27=pref.getBoolean("chk27", false);
        Boolean chk28=pref.getBoolean("chk28", false);
        Boolean chk29=pref.getBoolean("chk29", false);
        Boolean chk30=pref.getBoolean("chk30", false);

        // Set habit name, day_of_start, memo
        et_habit_name.setText(habit_name);
        et_day_of_start.setText(day_of_start);
        et_memo.setText(memo);
        checkBox1.setChecked(chk1);
        checkBox2.setChecked(chk2);
        checkBox3.setChecked(chk3);
        checkBox4.setChecked(chk4);
        checkBox5.setChecked(chk5);
        checkBox6.setChecked(chk6);
        checkBox7.setChecked(chk7);
        checkBox8.setChecked(chk8);
        checkBox9.setChecked(chk9);
        checkBox10.setChecked(chk10);
        checkBox11.setChecked(chk11);
        checkBox12.setChecked(chk12);
        checkBox13.setChecked(chk13);
        checkBox14.setChecked(chk14);
        checkBox15.setChecked(chk15);
        checkBox16.setChecked(chk16);
        checkBox17.setChecked(chk17);
        checkBox18.setChecked(chk18);
        checkBox19.setChecked(chk19);
        checkBox20.setChecked(chk20);
        checkBox21.setChecked(chk21);
        checkBox22.setChecked(chk22);
        checkBox23.setChecked(chk23);
        checkBox24.setChecked(chk24);
        checkBox25.setChecked(chk25);
        checkBox26.setChecked(chk26);
        checkBox27.setChecked(chk27);
        checkBox28.setChecked(chk28);
        checkBox29.setChecked(chk29);
        checkBox30.setChecked(chk30);


        save_memo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();

                // Store elements in sharedPreferences
                editor.putString("habit_name", et_habit_name.getText().toString());
                editor.putString("day_of_start", et_day_of_start.getText().toString());
                editor.putString("memo", et_memo.getText().toString());

                editor.putBoolean("chk1", checkBox1.isChecked());
                editor.putBoolean("chk2", checkBox2.isChecked());
                editor.putBoolean("chk3", checkBox3.isChecked());
                editor.putBoolean("chk4", checkBox4.isChecked());
                editor.putBoolean("chk5", checkBox5.isChecked());
                editor.putBoolean("chk6", checkBox6.isChecked());
                editor.putBoolean("chk7", checkBox7.isChecked());
                editor.putBoolean("chk8", checkBox8.isChecked());
                editor.putBoolean("chk9", checkBox9.isChecked());
                editor.putBoolean("chk10", checkBox10.isChecked());
                editor.putBoolean("chk11", checkBox11.isChecked());
                editor.putBoolean("chk12", checkBox12.isChecked());
                editor.putBoolean("chk13", checkBox13.isChecked());
                editor.putBoolean("chk14", checkBox14.isChecked());
                editor.putBoolean("chk15", checkBox15.isChecked());
                editor.putBoolean("chk16", checkBox16.isChecked());
                editor.putBoolean("chk17", checkBox17.isChecked());
                editor.putBoolean("chk18", checkBox18.isChecked());
                editor.putBoolean("chk19", checkBox19.isChecked());
                editor.putBoolean("chk20", checkBox20.isChecked());
                editor.putBoolean("chk21", checkBox21.isChecked());
                editor.putBoolean("chk22", checkBox22.isChecked());
                editor.putBoolean("chk23", checkBox23.isChecked());
                editor.putBoolean("chk24", checkBox24.isChecked());
                editor.putBoolean("chk25", checkBox25.isChecked());
                editor.putBoolean("chk26", checkBox26.isChecked());
                editor.putBoolean("chk27", checkBox27.isChecked());
                editor.putBoolean("chk28", checkBox28.isChecked());
                editor.putBoolean("chk29", checkBox29.isChecked());
                editor.putBoolean("chk30", checkBox30.isChecked());

                editor.commit();
            }
        });
    }
}
