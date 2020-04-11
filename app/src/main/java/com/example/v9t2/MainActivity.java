package com.example.v9t2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;

import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {

    private Spinner spin;
    private Spinner spin2;
    private Spinner spin3;
    private Spinner spin4;
    private Spinner spin5;

    SmartpostDestinations s = SmartpostDestinations.getInstance();

    Context context = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        spin = findViewById(R.id.spinner);
        spin2 = findViewById(R.id.spinner2);
        spin3 = findViewById(R.id.spinner3);
        spin4 = findViewById(R.id.spinner4);
        spin5 = findViewById(R.id.spinner5);

        spin.setOnItemSelectedListener(this);
        spin2.setOnItemSelectedListener(this);
        spin3.setOnItemSelectedListener(this);
        spin4.setOnItemSelectedListener(this);
        spin5.setOnItemSelectedListener(this);

        List <String> spobjectList;

        final List<String> weekdays = new ArrayList<>();
        weekdays.add(0, "Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        final List<String> times = new ArrayList<>();
        times.add(0, "05");
        times.add("06");
        times.add("07");
        times.add("08");
        times.add("09");
        times.add("10");
        times.add("11");
        times.add("12");
        times.add("13");
        times.add("14");
        times.add("15");
        times.add("16");
        times.add("17");
        times.add("18");
        times.add("19");
        times.add("20");
        times.add("21");
        times.add("22");
        times.add("23");
        times.add("24");

        final List<String> locations = new ArrayList<>();
        locations.add(0, "Finland");
        locations.add("Estonia");
        locations.add("All");

        s.XMLdestinations();
        spobjectList = s.spList();

        ArrayAdapter<String> place = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, spobjectList);
        place.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spin.setAdapter(place);

        ArrayAdapter<String> day = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, weekdays);
        day.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spin2.setAdapter(day);

        ArrayAdapter<String> time = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, times);
        time.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spin3.setAdapter(time);

        spin4.setAdapter(time);

        ArrayAdapter<String> location = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, locations);
        location.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spin5.setAdapter(location);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {


        switch (v.getId()) {
            case R.id.spinner:
                break;
        }
        switch (v.getId()) {
            case R.id.spinner2:
                break;
        }
        switch (v.getId()) {
            case R.id.spinner3:
                break;
        }
        switch (v.getId()) {
            case R.id.spinner4:
                break;
        }
        switch (v.getId()) {
            case R.id.spinner5:
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

