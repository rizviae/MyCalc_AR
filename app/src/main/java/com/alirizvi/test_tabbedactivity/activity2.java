package com.alirizvi.test_tabbedactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity2 extends Activity {

    int buttonlist[] = {R.id.sin, R.id.cos, R.id.tan, R.id.ln, R.id.log, R.id.pi, R.id.sqr, R.id.percentage, R.id.squareroot,
            R.id.factorial, R.id.numDec, R.id.clear, R.id.basic, R.id.numCalc};

    private EditText calcbar;
    private float NumBefore;
    private String Scr;
    private String Operation;

    private ButtonClickListener myButtonClick;

    public void mResult() {
        float numAf = Float.parseFloat(Scr.getText().toString());
        float result;

        Scr = (EditText) findViewById(R.id.calcbar);
        clearIt = (Button) findViewById(R.id.clear);
        doit = (Button) findViewById(R.id.numCalc);
        sin = (Button) findViewById(R.id.sin);
        cos = (Button) findViewById(R.id.cos);
        tan = (Button) findViewById(R.id.tan);
        ln = (Button) findViewById(R.id.ln);
        log = (Button) findViewById(R.id.log);
        square = (Button) findViewById(R.id.sqr);
        squareroot = (Button) findViewById(R.id.squareroot);
        percent = (Button) findViewById(R.id.percentage);
        factorial = (Button) findViewById(R.id.factorial);

        //results button
        results = (EditText) findViewById(R.id.calcbar);

    public void mycalcoperator(String str) {
        NumBefore = float.parseFloat(Scr.getText().toString()));
        Operation = str;
        Scr.setText(“0”);

        public void getKeyboard (String str){
            String StrCurrent = Scr.getText().toString();
            if (ScrCurrent.equals(“0”))
                Scr.Current =“”;
            SetCurrent += str;
            Scr.setText(ScrCurrent);
        }
        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_activity1);


            if (Operation.equals(“ sin”)){

                results = Math.sin(NumAf);
            }

            if (Operation.equals(“ cos”)){
                results = Math.cos(NumBefore);
            }

            if (Operation.equals(“ tan”)){
                results = Maath.tan(NumAf);
            }

            if (Operation.equals(“ square”)) {
                results = Math.sqr(NumAf);
            }

            if (Operation.equals(“ squareroot”)) {

              results = Math.sqrt(NumAf);

            }


            if (Operation.equals(“ log”)) {
                results = Math.log(NumAf);
            }

            if (Operation.equals(“ ln”)) {
                results = Math.log1p(NumAf);
            }

            if (Operation.equals(“ perc”)) {
                results = (int)(NumBefore/100)*NumAf;
            }

            if (Operation.equals(“ pi”)) {
                results = Math.PI(NumAf);
            }


            if (Operation.equals(“ fact”)){

                // factorial

                for (int i = 2; i <= NumAf; i++) {
                    results = NumAf * i;
                }



            }
                results = NumBefore / NumAf;
            }

            Scr.setText(String.valueOf(results));
        }





}
