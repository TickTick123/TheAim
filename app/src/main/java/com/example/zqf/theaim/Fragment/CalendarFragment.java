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
    private MonthDateView monthDateView;
    public CalendarFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calendar,null);
       
        // Inflate the layout for this fragment
        return view;

    }

}



