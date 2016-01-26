package appbsru.supergolf.healthrecord;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MeetDoctorSetup extends AppCompatActivity {

    //Explicit
    private TextView showTimeTextView;
    private Button setupTimeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet_doctor_setup);

        //Bind Widget
        bindWidget();

        //buttonController
        buttonController();

    }   // Main Method

    private void buttonController() {

        setupTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }   // event
        });

    }   // buttonController

    private void bindWidget() {

        showTimeTextView = (TextView) findViewById(R.id.textView23);
        setupTimeButton = (Button) findViewById(R.id.button3);

    }   // bindWidget


}    // Main Class
