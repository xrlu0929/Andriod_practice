package com.myappcompany.rob.exampleproject;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity; // class for AppCompat
import android.os.Bundle;
import android.util.Log; // for Log.i()
import android.view.View; // the class for View type
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void login(View view) {
        /**
         * here the view refers to the button linked to clickFunction
         */
        Log.i("info", "Button Pressed");
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        EditText password = findViewById(R.id.password);
        Log.i("name", nameEditText.getText().toString());
        Log.i("password", password.getText().toString());

        Toast.makeText(this, "Hi, " + nameEditText.getText().toString() , Toast.LENGTH_SHORT).show();
    }

    public void changePic(View view){
        ImageView myImgView = findViewById(R.id.picture1);
        if(myImgView.getDrawable().getConstantState() == myImgView.getResources().getDrawable(R.drawable.qinzi).getConstantState()){
            myImgView.setImageResource(R.drawable.schoolnail);
        } else {
            myImgView.setImageResource(R.drawable.qinzi);
        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
