package com.ex.pakostnik.applicationformycat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Su.I.M. on 02.04.16.
 */
public class mainClass extends Activity {
    private EditText editText;
    private TextView textView;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        textView = (TextView)findViewById(R.id.textView);
        editText = (EditText)findViewById(R.id.editText);
    }

    public void enter(View view) {
        if (editText.length() > 0) {
            textView.setText("мой кот " + editText.getText());
        }else {
            textView.setText("мой котейка");
        }
    }

    public void onClick(View view) {
        count++;
        if (count == 5){
            textView.setText("хватит!");
        } else if (count == 7) {
            textView.setText("да ты меня затеребонькал уже!");
        } else if (count == 10){
            textView.setText("ну все! хана тебе!");
            count = 0;
        }
    }
}
