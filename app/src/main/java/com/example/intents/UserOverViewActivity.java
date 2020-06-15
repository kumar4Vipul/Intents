package com.example.intents;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class UserOverViewActivity extends AppCompatActivity {


    EditText type_mail=findViewById(R.id.type_mail);
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_overview);
    }

    public void onDone_button(View view) {
        //Intent to carry the data
        Intent data =new Intent();//
        //Access edit text filed
        EditText editText=findViewById(R.id.Edit_Text);

        String name=editText.getText().toString();

        data.putExtra("nameKey",name);
        this.setResult(RESULT_OK,data);
        finish();
        Log.d("OnDone_Button working","Yes");
    }





    public void SendMail(View view){
        Intent i=new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT,"THIS IS SUBJECT");
        String message=type_mail.getText().toString();
        i.putExtra(Intent.EXTRA_TEXT,message);

        if(i.resolveActivity(getPackageManager())!=null){
            startActivity(i);
        }

    }

    public void OpenBrowser(View view){
        Intent i=new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.google.com"));
        if(i.resolveActivity(getPackageManager())!=null){
            startActivity(i);
        }
    }
}
