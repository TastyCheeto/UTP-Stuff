package com.example.progressbaractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        final EditText numberInput = (EditText) findViewById(R.id.number_input);
        Button submit = (Button) findViewById(R.id.submit_button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setProgress(Integer.parseInt(numberInput.getText().toString()));
            }
        });

        //Datepicker
        final TextView showdate=(TextView)findViewById(R.id.tvdate);
        final DatePicker picker = (DatePicker) findViewById(R.id.datePiker1);
        Button btndate = (Button) findViewById(R.id.showdate);

        btndate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                showdate.setText("Selected Date: "+ picker.getDayOfMonth()+"/"+ (picker.getMonth() + 1)+"/"+picker.getYear());
            }
        });

        //timepicker
        final TextView showtime=(TextView)findViewById(R.id.textview_time);
        final TimePicker tpicker = (TimePicker) findViewById(R.id.timePiker1);
        Button btntime = (Button) findViewById(R.id.btn_showtime);

        btntime.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                showtime.setText("Selected Time: "+ tpicker.getHour()+":"+ tpicker.getMinute());
            }
        });
    }
}