package com.example.drivingtrends;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 
 * @author ldimitroff
 * 
 */
public class MainActivity extends FragmentActivity {

    private TextView fuelBtn, scoreBtn, milesPerGalonBtn, distanceBtn;
    private ImageView backBtn;

    protected static FuelFragment fuelFragmentInstance;

    /**
     * Fuel Btn Click listener on the header bar
     */
    private OnClickListener fuelBtnClickListener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            fuelBtn.setBackgroundResource(R.drawable.header_btn_selected_bg);
            scoreBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            milesPerGalonBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            distanceBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            if (fuelFragmentInstance == null) {
                fuelFragmentInstance = new FuelFragment();
            }
            changeFragment(fuelFragmentInstance);
        }
    };

    /**
     * Score Btn Click Listener on the header bar
     */
    private OnClickListener scoreBtnClickClistener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            fuelBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            scoreBtn.setBackgroundResource(R.drawable.header_btn_selected_bg);
            milesPerGalonBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            distanceBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            Toast.makeText(MainActivity.this, R.string.not_implemented_yet, Toast.LENGTH_SHORT).show();
        }
    };

    /**
     * MPG Btn Click Listener on the header bar
     */
    private OnClickListener mpgBtnClickClistener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            fuelBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            scoreBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            milesPerGalonBtn.setBackgroundResource(R.drawable.header_btn_selected_bg);
            distanceBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            Toast.makeText(MainActivity.this, R.string.not_implemented_yet, Toast.LENGTH_SHORT).show();
        }
    };

    /**
     * Distance Btn Click Listener on the header bar
     */
    private OnClickListener distanceBtnClickClistener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            fuelBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            scoreBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            milesPerGalonBtn.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_bg));
            distanceBtn.setBackgroundResource(R.drawable.header_btn_selected_bg);
            Toast.makeText(MainActivity.this, R.string.not_implemented_yet, Toast.LENGTH_SHORT).show();
        }
    };

    /**
     * Back Button click listener
     */
    private OnClickListener backBtnClickListener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, R.string.not_implemented_yet, Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fuelBtn = (TextView) findViewById(R.id.fuel_action_bar);
        fuelBtn.setOnClickListener(fuelBtnClickListener);

        scoreBtn = (TextView) findViewById(R.id.score_action_bar);
        scoreBtn.setOnClickListener(scoreBtnClickClistener);

        milesPerGalonBtn = (TextView) findViewById(R.id.mpg_action_bar);
        milesPerGalonBtn.setOnClickListener(mpgBtnClickClistener);

        distanceBtn = (TextView) findViewById(R.id.distance_action_bar);
        distanceBtn.setOnClickListener(distanceBtnClickClistener);

        backBtn = (ImageView) findViewById(R.id.header_back_btn);
        backBtn.setOnClickListener(backBtnClickListener);

    }

    /**
     * Method to implement changing fragments dynamically
     * 
     * @param fragment
     */
    protected void changeFragment(Fragment f) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.driving_content, f);
        ft.addToBackStack(null);
        ft.commit();
    }

}
