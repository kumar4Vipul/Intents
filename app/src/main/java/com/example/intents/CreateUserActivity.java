package com.example.intents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;

public class CreateUserActivity extends AppCompatActivity {
    public static final int REQUEST_CODE=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_test);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        Button change_activity_button=findViewById(R.id.Change_activity_Create);
//
//        change_activity_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(getApplicationContext(),UserOverViewActivity.class);
//                startActivityForResult(i,REQUEST_CODE);
//            }
//        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_CODE&&resultCode==RESULT_OK){
            String name1 =data.getStringExtra("nameKey");
            TextView tvWelcome=findViewById(R.id.Text_view);
            tvWelcome.setText("Welcome "+name1+" this the test fro your Explicit Intent");
        }
    }



}
