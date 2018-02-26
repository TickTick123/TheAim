package com.example.zqf.theaim.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.zqf.theaim.MainActivity;
import com.example.zqf.theaim.R;

import static com.example.zqf.theaim.Fragment.MonthDateView.getMonthDays;

/**
 * Created by Administrator on 2018/2/24.
 */


public class CalendarFragment extends Fragment{
    GestureDetector detector;

    final int distance = 50;
    public CalendarFragment() {

    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calendar, container, false);

    }

}



