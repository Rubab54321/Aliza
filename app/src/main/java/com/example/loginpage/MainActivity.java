 package com.example.loginpage;

import static com.example.loginpage.Veiw.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity extends AppCompatActivity {

     Button btntext;
     Button type;


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         EdgeToEdge.enable(this);
         setContentView(R.layout.activity_main);
         btntext = findViewById(R.id.loginButton);
         btntext.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                 startActivities(intent);
             }

             private void startActivities(Intent intent) {
             }
         });
     }

     private void startActinities(Intent intent) {
         type = findViewById(R.id.SignupText);
         type.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                 startActinities(intent);
             }
         });
     }
 }
