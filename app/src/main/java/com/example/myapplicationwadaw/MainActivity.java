package com.example.myapplicationwadaw;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        TextView tVResult, tVResultLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnReq = findViewById(R.id.btnRequest);
        Button btnEnd = findViewById(R.id.btnEnd);
        tVResult = findViewById(R.id.tVResult);
        tVResultLabel = findViewById(R.id.tVResultLabel);
        EditText editTextID = findViewById(R.id.editTextTextID);




    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);



    }
}