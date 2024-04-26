package com.reysl.learnAndroidStudio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText numberOne, numberTwo;
    Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOne = findViewById(R.id.number_field_1);
        numberTwo = findViewById(R.id.number_field_2);
        result = findViewById(R.id.result);
        calculateButton = findViewById(R.id.calculate_button);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(numberOne.getText().toString());
                float num2 = Float.parseFloat(numberTwo.getText().toString());
                float res = num1 + num2;
                result.setText(String.valueOf(res));
            }
        });
    }
}