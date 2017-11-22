package com.example.rezasoltani.activity1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static final String MYAPP = "MYAPP";  //properties should be placed before logic code ///

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // get the response from the second activity

        // is this method called by the second activity that we know!
        if (requestCode == 0)
        {
            //is everything ok???
            if (resultCode == RESULT_OK){

                //read the data
                String message = data.getStringExtra("MESSAGE");

                //show the data as a toast
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

            }
        }
    }



    @Override
    protected void onStart() {
        super.onStart();

        Log.d(MYAPP, "My activity just started - onStart!!");


    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(MYAPP, "My activity just stopped - onStop!!");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(MYAPP, "My activity just stopped - onDestroy!!");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(MYAPP, "My activity just stopped - onPause!!");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(MYAPP, "My activity just started - onResume!!");
    }




    // method 2 to connect a button to a method
    public void multi(View view)
    {
        EditText etxNumber1 = (EditText) findViewById(R.id.etxNumber1);
        String number1 = etxNumber1.getText().toString();

        Toast.makeText(this, "The multi button is clicked!!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         // third approach
       // Button btnSub = (Button) findViewById(R.id.btnSub);
       // btnSub.setOnClickListener(this);

        // The code for button 1 which only displays a Toast!
        Button btnChangeText = (Button) findViewById(R.id.btnChangeText);

        // method 1 to connect a button to a method
        btnChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "The button is clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        // The code for button 2 which does division
        Button btnDivide = (Button) findViewById(R.id.btnDivide);


        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Here we are suppose divide the two given numbers!

                // commenting out the Toast because we don't need it for now
                // Toast.makeText(getApplicationContext(), "The button 2 is clicked!", Toast.LENGTH_SHORT).show();

                // Read # from first edittext

                EditText etxNumber1 = (EditText) findViewById(R.id.etxNumber1);
                String number1 = etxNumber1.getText().toString();


                // Read second # from second edittext
                EditText etxNumber2 = (EditText) findViewById(R.id.etxNumber2);
                String number2 = etxNumber2.getText().toString();


                // Do that math
                Calc calc = new Calc();
                Double result = calc.div(number1, number2);


                // Display the result
               // Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_SHORT).show();

                // open second activity and show the result - THERE !
                //intent class
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class );
                intent.putExtra("RESULT", result);
                startActivityForResult(intent, 0);

            }
        });

        Button btnMultiply = (Button) findViewById(R.id.btnMultiply);


        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Here we are suppose divide the two given numbers!

                // commenting out the Toast because we don't need it for now
                // Toast.makeText(getApplicationContext(), "The button 2 is clicked!", Toast.LENGTH_SHORT).show();

                // Read # from first edittext

                EditText etxNumber1 = (EditText) findViewById(R.id.etxNumber1);
                String number1 = etxNumber1.getText().toString();


                // Read second # from second edittext
                EditText etxNumber2 = (EditText) findViewById(R.id.etxNumber2);
                String number2 = etxNumber2.getText().toString();


                // Do that math
                Calc calc = new Calc();
                Double result = calc.mul(number1, number2);


                // Display the result
                // Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_SHORT).show();

                // open second activity and show the result - THERE !
                //intent class
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class );
                intent.putExtra("RESULT", result);
                startActivityForResult(intent, 0);

            }
        });

        Button btnAdd = (Button) findViewById(R.id.btnAdd);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Here we are suppose divide the two given numbers!

                // commenting out the Toast because we don't need it for now
                // Toast.makeText(getApplicationContext(), "The button 2 is clicked!", Toast.LENGTH_SHORT).show();

                // Read # from first edittext

                EditText etxNumber1 = (EditText) findViewById(R.id.etxNumber1);
                String number1 = etxNumber1.getText().toString();


                // Read second # from second edittext
                EditText etxNumber2 = (EditText) findViewById(R.id.etxNumber2);
                String number2 = etxNumber2.getText().toString();


                // Do that math
                Calc calc = new Calc();
                Double result = calc.sum(number1, number2);


                // Display the result
                // Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_SHORT).show();

                // open second activity and show the result - THERE !
                //intent class
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class );
                intent.putExtra("RESULT", result);
                startActivityForResult(intent, 0);

            }
        });

        Button btnSub = (Button) findViewById(R.id.btnSub);


        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Here we are suppose subtract

                // commenting out the Toast because we don't need it for now
                // Toast.makeText(getApplicationContext(), "The button 2 is clicked!", Toast.LENGTH_SHORT).show();

                // Read # from first edittext

                EditText etxNumber1 = (EditText) findViewById(R.id.etxNumber1);
                String number1 = etxNumber1.getText().toString();


                // Read second # from second edittext
                EditText etxNumber2 = (EditText) findViewById(R.id.etxNumber2);
                String number2 = etxNumber2.getText().toString();


                // Do that math
                Calc calc = new Calc();
                Double result = calc.sub(number1, number2);


                // Display the result
                // Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_SHORT).show();

                // open second activity and show the result - THERE !
                //intent class
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class );
                intent.putExtra("RESULT", result);
                startActivityForResult(intent, 0);

            }
        });
        Log.d(MYAPP, "My activity just started - onCreate!!");


    }


    // method 3 to connect a button to a method
    @Override
    public void onClick(View v) {

    }
}
