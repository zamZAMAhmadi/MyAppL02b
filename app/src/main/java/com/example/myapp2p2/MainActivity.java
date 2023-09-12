package com.example.myapp2p2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] colors;
    Button changeCol;
    Button submitfirst;
    TextView greetingMessage;
    TextView fname;
    EditText inputText;
    int countforcol = -1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        colors = getResources().getStringArray(R.array.colors_Array);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeCol = findViewById(R.id.colorsbutton);
        submitfirst = findViewById(R.id.submitname);
        inputText = (EditText) findViewById(R.id.name);
        fname = findViewById(R.id.enternamemessage);
        greetingMessage = findViewById(R.id.greeting_textview);

        submitfirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fname.setText("Hello " + inputText.getText() + "!");
            }
        });

        changeCol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countforcol++;
                fname.setText(inputText.getText() + ", you are looking " + colors[countforcol] + " today.");
                greetingMessage.setText(colors[countforcol]);
                if (countforcol == colors.length - 1) {
                    countforcol = -1;
                }
            }
        });
//
    }
}
