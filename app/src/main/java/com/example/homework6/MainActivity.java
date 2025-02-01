package com.example.homework6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView iv;
    Random rnd;

    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn.findViewById(R.id.btn);
        iv.findViewById(R.id.iv);
        rnd= new Random ();
        num = 0;
    }

    public void Albert(View view) {
        num = rnd.nextInt(3)+1;
        btn.setText(String.valueOf(num));
        if(num==1)
        {
            iv.setImageResource(R.drawable.number1);
        }
        else if(num==2)
        {
            iv.setImageResource(R.drawable.number2);
        }
        else
        {
            iv.setImageResource(R.drawable.number3);
        }
    }
}