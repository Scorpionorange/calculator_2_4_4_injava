package com.example.calculator_2_4_4_injava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btC = null, btDel = null, btEqual = null,
            bt7 = null, bt8 = null, bt9 = null, btPlus = null,
            bt4 = null, bt5 = null, bt6 = null, btMinus=null,
            bt1 = null, bt2 = null, bt3 = null, btMultiple = null,
            btPlusOrMinus = null, bt0 = null, btPoint = null, btdiv = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
    }
}
