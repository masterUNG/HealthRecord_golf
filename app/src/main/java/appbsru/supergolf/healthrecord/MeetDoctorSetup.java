package appbsru.supergolf.healthrecord;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;

public class MeetDoctorSetup extends AppCompatActivity {

    //Explicit
    private Spinner daySpinner, monthSpinner, yearSpinner;
    private String meetDateString, meetMonthString, meetYearString,
            doctorString, remarkString;
    private EditText doctorEditText, remarkEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet_doctor_setup);

        //Bind Widget
        bindWidget();

        //Show Current Time
        showCurrentTime();

        //Create Spinner
        createSpinner();

    }   // Main Method

    public void clickSaveData(View view) {

        doctorString = doctorEditText.getText().toString().trim();
        remarkString = remarkEditText.getText().toString().trim();



    }   // clickSaveData

    private void createSpinner() {

        //Setup For Date
        final String[] dateStrings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
                "24", "25", "26", "27", "28", "29", "30", "31",};
        ArrayAdapter<String> dateAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, dateStrings);
        daySpinner.setAdapter(dateAdapter);

        daySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                meetDateString = dateStrings[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                meetDateString = dateStrings[0];
            }
        });

        //Setup For Month
        final String[] monthStrings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12"};
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, monthStrings);
        monthSpinner.setAdapter(monthAdapter);

        monthSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                meetMonthString = monthStrings[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                meetMonthString = monthStrings[0];
            }
        });

        //For Year
        final String[] yearStrings = {"2016", "2017", "2018", "2019", "2020"};
        ArrayAdapter<String> yearAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, yearStrings);
        yearSpinner.setAdapter(yearAdapter);

        yearSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                meetYearString = yearStrings[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                meetYearString = yearStrings[0];
            }
        });

    }   // createSpinner


    private void showCurrentTime() {

        Calendar currentCalendar = Calendar.getInstance();


    }   // showCurrentTime


    private void bindWidget() {

        daySpinner = (Spinner) findViewById(R.id.spinner2);
        monthSpinner = (Spinner) findViewById(R.id.spinner3);
        yearSpinner = (Spinner) findViewById(R.id.spinner4);
        doctorEditText = (EditText) findViewById(R.id.editText7);
        remarkEditText = (EditText) findViewById(R.id.editText8);


    }   // bindWidget


}    // Main Class
