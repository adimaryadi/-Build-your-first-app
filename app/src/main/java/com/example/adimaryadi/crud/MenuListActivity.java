package com.example.adimaryadi.crud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MenuListActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.adimaryadi.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_list);
    }

    public void sendMessage(View view) {
        Intent intent     = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.message);
        String message    =  editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
