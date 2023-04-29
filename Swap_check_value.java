package com.example.swapper_checker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Swap_check_value extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button swap_button = (Button) findViewById(R.id.Button_swap);
        Button check_button = (Button) findViewById(R.id.Button_check);
        EditText first_text = (EditText) findViewById((R.id.Input_1));
        EditText second_text = (EditText) findViewById(R.id.Input_2);

        swap_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swapContents();
            }

            private void swapContents() {
               String Input_1 = String.valueOf(first_text.getText());
               String Input_2 = String.valueOf(second_text.getText());
               first_text.setText(Input_2);
               second_text.setText(Input_1);
            }

        });

        check_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Swap_check_value.this, Check_value.class);
                   String Input_1 = first_text.getText().toString();
                   String Input_2 = second_text.getText().toString();

                if (Input_1.equalsIgnoreCase(Input_2)) {
                    intent.putExtra("Same Value", "Same Value");
                    startActivity(intent);


                } else {
                    intent.putExtra("Same Value", "Not the Same Value");
                    startActivity(intent);
                }
            }
        });

    }
}