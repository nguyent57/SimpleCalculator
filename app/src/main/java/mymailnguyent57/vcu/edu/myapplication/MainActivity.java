package mymailnguyent57.vcu.edu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // to reference the button Addbtn(name as activity_main file)
        // assign the value - cache the button
        // use method findViewById - to find something within this layout
        // search through rss for stuff such as string, a control by a certain id, use R
        // R.id will search the rss by an id
        // then choose which id want to search for.
        Button Addbtn = (Button) findViewById(R.id.Addbtn);
        final Button MultBtn = (Button) findViewById(R.id.MultBtn);
        final Button DivBtn = (Button) findViewById(R.id.DivBtn);
        final Button SubtractBtn = (Button) findViewById(R.id.SubtractBtn);


        /*
            Assign an onClickListener - anytime the button is click, do this!
         */
        Addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            // Will create an onClick event
            public void onClick(View view) {
                //
                EditText FirstNumberET = (EditText) findViewById(R.id.FirstNumberET);
                EditText SecondNumberET = (EditText) findViewById(R.id.SecondNumberET);
                TextView ResultAddTV = (TextView) findViewById(R.id.ResultAddTV);

                int num1 = Integer.parseInt(FirstNumberET.getText().toString());
                int num2 = Integer.parseInt(SecondNumberET.getText().toString());
                int result = num1 + num2;
                ResultAddTV.setText(result + "");


            }
        });

        SubtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            // Will create an onClick event
            public void onClick(View view) {
                //
                EditText FirstNumberET = (EditText) findViewById(R.id.FirstNumberET);
                EditText SecondNumberET = (EditText) findViewById(R.id.SecondNumberET);
                TextView ResultSubtTV = (TextView) findViewById(R.id.ResultSubtTV);

                int num1 = Integer.parseInt(FirstNumberET.getText().toString());
                int num2 = Integer.parseInt(SecondNumberET.getText().toString());
                int result = num1 - num2;
                ResultSubtTV.setText(result + "");

            }
        });
        MultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            // Will create an onClick event
            public void onClick(View view) {
                //
                EditText FirstNumberET = (EditText) findViewById(R.id.FirstNumberET);
                EditText SecondNumberET = (EditText) findViewById(R.id.SecondNumberET);
                TextView ResultMultTV = (TextView) findViewById(R.id.ResultMultTV);

                int num1 = Integer.parseInt(FirstNumberET.getText().toString());
                int num2 = Integer.parseInt(SecondNumberET.getText().toString());
                int result = num1 * num2;
                ResultMultTV.setText(result + "");
            }
        });
        DivBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            // Will create an onClick event
            public void onClick(View view) {
                //
                EditText FirstNumberET = (EditText) findViewById(R.id.FirstNumberET);
                EditText SecondNumberET = (EditText) findViewById(R.id.SecondNumberET);
                TextView ResultDivTV = (TextView) findViewById(R.id.ResultDivTV);

                int num1 = Integer.parseInt(FirstNumberET.getText().toString());
                int num2 = Integer.parseInt(SecondNumberET.getText().toString());
                int result = num1 / num2;
                ResultDivTV.setText(result + "");

            }
        });
    }
}
