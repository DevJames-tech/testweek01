package com.example.week1day4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nameText;
    EditText LNameText;
    EditText addressText;
    EditText stateText;
    EditText cityText;
    EditText zipText;
    TextView seeThis;
    Person gethim;
    Address overThere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = findViewById(R.id.FirstNameField);
        LNameText = findViewById(R.id.LastNameField);
        addressText = findViewById(R.id.StreetNameField);
        stateText = findViewById(R.id.stateField);
        cityText = findViewById(R.id.cityField);
        zipText = findViewById(R.id.zipField);
        seeThis = findViewById(R.id.displayAll);
        gethim = new Person();
        overThere = new Address();
    }

    public void submitOnClick(View view) {
        //
        String fName = nameText.getText().toString();
        String lName = LNameText.getText().toString();
        String address = addressText.getText().toString();
        String state = stateText.getText().toString();
        String zip= zipText.getText().toString();
        String city = cityText.getText().toString();

        switch (view.getId()) {
            case R.id.submitButton:

                if (!fName.isEmpty()){

                    gethim.setName(fName);
                }
                if(!lName.isEmpty()) {

                    gethim.setLastName(lName);
                }
                if(!address.isEmpty()) {

                    gethim.setStreetAddress(address);
                }
                if (!state.isEmpty()) {

                    gethim.setState(state);
                }
                if (!zip.isEmpty()) {
                gethim.setZip(zip);
            }
                if (!city.isEmpty()) {
                    gethim.setCity(city);
                }

                    break;


        }

        seeThis.setText(gethim.toString());

    }
}
