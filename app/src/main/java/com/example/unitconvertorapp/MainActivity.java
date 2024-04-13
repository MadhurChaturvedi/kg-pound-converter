package com.example.unitconvertorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
   private Button button;
   private TextView textView;
   private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextText);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "hi Click listener work!", Toast.LENGTH_SHORT).show();
//               String s = editText.getText().toString();
//               int kg =  Integer.parseInt(s);
//               double pronds  = 2.205 * kg;
//               textView.setText("the value in Pounds is "+pronds);
//            }
//        });
    }
    public void calculate(View view){
        String s = editText.getText().toString();
               int kg =  Integer.parseInt(s);
               double pronds  = 2.205 * kg;
               textView.setText("the value in Pounds is "+pronds);
    }
}
//1:42:44



