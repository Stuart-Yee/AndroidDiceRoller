package com.stuartyee.simplediceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn1die);
        button2 = findViewById(R.id.btn2dice);
        button3 = findViewById(R.id.btn3dice);
        button4 = findViewById(R.id.btn4dice);
        button5 = findViewById(R.id.btn5dice);
        button6 = findViewById(R.id.btn6dice);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "You rolled a " + dieRoller(1);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "You rolled a " + dieRoller(2);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "You rolled a " + dieRoller(3);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "You rolled a " + dieRoller(4);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "You rolled a " + dieRoller(5);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "You rolled a " + dieRoller(6);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });


    }

    public static String dieRoller(int num) {
        Random rand = new Random();
        Integer sum = 0;
        for (int i=0; i < num; i++) {
            sum += rand.nextInt(6) + 1;
        }
        return sum.toString();
    }
}