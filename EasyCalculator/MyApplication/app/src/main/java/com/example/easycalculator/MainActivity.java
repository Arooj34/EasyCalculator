package com.example.easycalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

     private EditText editText;
     private TextView resultText;
    private double num1, num2;
    private boolean isAddition, isSubtraction, isMultiplication, isDivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText2);
        resultText = findViewById(R.id.resultText);
        Button clearButton = findViewById(R.id.clear_text);


        Button addButton = findViewById(R.id.add);
        Button subtractButton = findViewById(R.id.sub);
        Button multiplyButton = findViewById(R.id.mul);
        Button divideButton = findViewById(R.id.div);
        Button equalButton = findViewById(R.id.submit);

        Button num1Button = findViewById(R.id.num1);
        Button num2Button = findViewById(R.id.num2);
        Button num3Button = findViewById(R.id.num3);
        Button num4Button = findViewById(R.id.num4);
        Button num5Button = findViewById(R.id.num5);
        Button num6Button = findViewById(R.id.num6);
        Button num7Button = findViewById(R.id.num7);
        Button num8Button = findViewById(R.id.num8);
        Button num9Button = findViewById(R.id.num9);
        Button zeroButton = findViewById(R.id.zero);
        Button dotButton = findViewById(R.id.dot);

        addButton.setOnClickListener(v -> {
            if (editText.getText().length() > 0) {
                num1 = Double.parseDouble(editText.getText().toString());
                isAddition = true;

                // Clear the EditText for the next number
                editText.setText("");
            }
        });

        subtractButton.setOnClickListener(v -> {
            if (editText.getText().length() > 0) {
                num1 = Double.parseDouble(editText.getText().toString());
                isSubtraction = true;

                // Clear the EditText for the next number
                editText.setText("");
            }
        });

        multiplyButton.setOnClickListener(v -> {
            if (editText.getText().length() > 0) {
                num1 = Double.parseDouble(editText.getText().toString());
                isMultiplication = true;

                // Clear the EditText for the next number
                editText.setText("");
            }
        });

        divideButton.setOnClickListener(v -> {
            if (editText.getText().length() > 0) {
                num1 = Double.parseDouble(editText.getText().toString());
                isDivision = true;

                // Clear the EditText for the next number
                editText.setText("");
            }
        });

        clearButton.setOnClickListener(v -> {
            editText.setText("");
            resultText.setText("0");
            // Reset all flags
            isAddition = false;
            isSubtraction = false;
            isMultiplication = false;
            isDivision = false;
        });

        equalButton.setOnClickListener(v -> {
            if (editText.getText().length() > 0) {
                num2 = Double.parseDouble(editText.getText().toString());
                if (isAddition) {
                    resultText.setText(String.valueOf(num1 + num2));
                } else if (isSubtraction) {
                    resultText.setText(String.valueOf(num1 - num2));
                } else if (isMultiplication) {
                    resultText.setText(String.valueOf(num1 * num2));
                } else if (isDivision) {
                    if (num2 != 0) {
                        resultText.setText(String.valueOf(num1 / num2));
                    } else {
                        resultText.setText(getString(R.string.error_message));
                    }
                }
                // Reset all flags
                isAddition = false;
                isSubtraction = false;
                isMultiplication = false;
                isDivision = false;
            }
        });

        num1Button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "1");
            }
        });

        num2Button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "2");
            }
        });

        num3Button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "3");
            }
        });

        num4Button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "4");
            }
        });

        num5Button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "5");
            }
        });

        num6Button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "6");
            }
        });

        num7Button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "7");
            }
        });

        num8Button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "8");
            }
        });

        num9Button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "9");
            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString() + "0");
            }
        });

        dotButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (!editText.getText().toString().contains(".")) {
                    editText.setText(editText.getText().toString() + ".");
                }
            }
        });
    }
}
