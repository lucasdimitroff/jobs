package com.example.drivingtrends;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Fuel Fragment
 * 
 * @author ldimitroff
 * 
 */
public class FuelFragment extends Fragment {

    private TextView monthBtn, weekBtn, yearBtn;

    /**
     * Month Btn click listener
     */
    private OnClickListener monthBtnClickListener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            monthBtn.setBackgroundResource(R.drawable.header_btn_selected_bg);
            yearBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            weekBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            Toast.makeText(getActivity().getApplicationContext(), R.string.not_implemented_yet, Toast.LENGTH_SHORT)
                    .show();
        }
    };

    /**
     * Week Btn click listener
     */
    private OnClickListener weekBtnClickListener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            monthBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            weekBtn.setBackgroundResource(R.drawable.header_btn_selected_bg);
            yearBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            Toast.makeText(getActivity().getApplicationContext(), R.string.not_implemented_yet, Toast.LENGTH_SHORT)
                    .show();
        }
    };

    /**
     * Year Btn click listener
     */
    private OnClickListener yearBtnClickListener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            monthBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            weekBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            yearBtn.setBackgroundResource(R.drawable.header_btn_selected_bg);
            Toast.makeText(getActivity().getApplicationContext(), R.string.not_implemented_yet, Toast.LENGTH_SHORT)
                    .show();
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fuel_fragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        monthBtn = (TextView) getView().findViewById(R.id.fuel_month_action_btn);
        monthBtn.setOnClickListener(monthBtnClickListener);
        weekBtn = (TextView) getView().findViewById(R.id.fuel_week_action_btn);
        weekBtn.setOnClickListener(weekBtnClickListener);
        yearBtn = (TextView) getView().findViewById(R.id.fuel_year_action_btn);
        yearBtn.setOnClickListener(yearBtnClickListener);
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
