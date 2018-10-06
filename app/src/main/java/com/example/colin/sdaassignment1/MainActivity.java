package com.example.colin.sdaassignment1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = getResources().getString(R.string.mess_toast);
        int duration  = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);

        toast.show(); //shows the toast message
    }
}


