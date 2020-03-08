package com.timkontrakan.datetimepicker;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //Use the current date as the default date in the picker
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        //create a new INstance of DatePickerDialog and return it.
        return new DatePickerDialog(getActivity(), this, year,month, day);
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        //Set the activity to the main Activity
        MainActivity activity = (MainActivity) getActivity();

        //Invoke Main Activity's processDatePicker Results
        activity.processDatePickerResult(year, month, day);
    }
}
