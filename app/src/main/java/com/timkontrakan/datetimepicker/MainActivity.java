package com.timkontrakan.datetimepicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDatePickerDialog(View view) {
        DialogFragment dialogFragment = new DatePickerFragment();
        dialogFragment.show(getSupportFragmentManager(),
                getString(R.string.date_picker));
    }

    public void showTimePickerDialog(View view) {
        DialogFragment dialogFragment = new TimePickerFragment();
        dialogFragment.show(getSupportFragmentManager(),
                getString(R.string.time_picker));
    }

    public void processDatePickerResult(int year, int month, int day){

        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);

        String dateMessage = (month_string + "/" + day_string + "/" + year_string);
        Toast.makeText(this, getString(R.string.dateToast) + dateMessage, Toast.LENGTH_SHORT).show();
    }

    public void processTimePickerResult(int houtOfDay, int minute){

        String hour_string = Integer.toString(houtOfDay);
        String minute_string = Integer.toString(minute);

        String timeMessage = (hour_string + ":" + minute_string);
        Toast.makeText(this, getString(R.string.timeToast) + timeMessage, Toast.LENGTH_SHORT).show();
    }
}
