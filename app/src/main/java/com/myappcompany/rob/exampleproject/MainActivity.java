package com.myappcompany.rob.exampleproject;

import android.support.v7.app.AppCompatActivity; // class for AppCompat
import android.os.Bundle;
import android.util.Log; // for Log.i()
import android.view.View; // the class for View type
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        /**
         * here the view refers to the button linked to clickFunction
         */
        Log.i("info", "Button Pressed");
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        Log.i("name", nameEditText.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
