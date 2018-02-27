package com.androidtutors.buttonclickandroidexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView helloTextView;
    private Button clickButton;

    //TODO 5 : Add Button variable with name revertButton

    //TODO 7 : Add a string constant revertString

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloTextView = findViewById(R.id.textview_hello);
        clickButton = findViewById(R.id.button_change);

        //TODO 8 : Set revertString to helloTextView's text

        //TODO 6 : Use findViewById to link revertButton to Button button_revert

        //TODO 9 : Add setOnClickListener on revertButton and set textview_hello to revertString


    }

    //TODO 2 : Create a method changeTextOnClick with no return value
    //TODO 3 : Change the text of textview_hello to "Learning Kotlin" inside the method
    public void changeTextOnClick(View v){
        helloTextView.setText("Learning Kotlin");
    }

}
