package com.example.temp_conv;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText text;
    private EditText output;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.inputValue);
        output = (EditText) findViewById(R.id.inputValue2);

    }

    // this method is called at button click because we assigned the name to the
    // "OnClick" property of the button
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                RadioButton kilosButton = (RadioButton) findViewById(R.id.radio0);
                RadioButton poundsButton = (RadioButton) findViewById(R.id.radio1);
                if (text.getText().length() == 0) {
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG).show();
                    return;
                }

                float inputValue = Float.parseFloat(text.getText().toString());
                if (kilosButton.isChecked()) {
                    output.setText(String
                            .valueOf(ConverterUtil.convertkilosTopound(inputValue)));
//                    kilosButton.setChecked(false);
//                    poundsButton.setChecked(true);
                } else {
                    output.setText(String
                            .valueOf(ConverterUtil.convertPoundToCKilos(inputValue)));
//                    poundsButton.setChecked(false);
//                    kilosButton.setChecked(true);
                }
                break;
        }
    }

}