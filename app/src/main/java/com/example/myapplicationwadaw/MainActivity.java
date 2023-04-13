package com.example.myapplicationwadaw;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static final int REQUEST_INFO = 1;
        TextView tVResult, tVResultLabel;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnReq = findViewById(R.id.btnRequest);
        Button btnEnd = findViewById(R.id.btnEnd);
        tVResult = findViewById(R.id.tVResult);
        tVResultLabel = findViewById(R.id.tVResultLabel);
        EditText editTextID = findViewById(R.id.editTextTextID);
        btnReq.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                str = editTextID.getText().toString();
                Intent intent = new Intent(getApplicationContext(), InformationActivity.class);
                intent.putExtra("id", str);
                startActivityForResult(intent, REQUEST_INFO);
            }
        });
        btnEnd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((requestCode ==REQUEST_INFO) && (resultCode==RESULT_OK)){
            str = "아이디;" + str;
            str = str + "\n이름:" + data.getStringExtra("name");
            str = str + "\n나이:" + data.getStringExtra("age");
            str = str + "\n성별:" + data.getStringExtra("sex");
            str = str + "\n자격증:" + data.getStringExtra("license");

            tVResultLabel.setText("전송\n정보\n출력");
            tVResult.setText((str));


        }



    }
}
//information 깃허브 계정 내걸로 변경
//2번째 깃허브 터미널 사용 계정 변경 테스트