package com.example.cours1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bouton = findViewById(R.id.buttonRed);


        bouton.setOnClickListener(new View.OnClickListener(){
            //@Override
            public void onClick(View v){
                TextView tv =findViewById(R.id.Cours);
                tv.setTextColor(Color.RED);

            }
        });

        Button boutonBlue = findViewById(R.id.buttonBlue);

        // Passer l'objet Listenet qui est la classe courante (activité ) car elle implément LIstener
        boutonBlue.setOnClickListener(this);
    }

    public void onClick(View v){
        TextView tv =findViewById(R.id.Cours);
        tv.setTextColor(Color.BLUE);
    }

    public void buttonClickMethod(View source){
        TextView tv = findViewById(R.id.Cours);

        Button hasClick = (Button)source;
        switch (source.getId()){
            case R.id.buttonBlack:
                tv.setTextColor(Color.BLACK);
            break;
            case  R.id.buttonGreen:
                tv.setTextColor(Color.GREEN);
            break;
            default:
                Log.d("ButtonClickPMethod", " has been called without catching Id Button clicked");
                Toast.makeText(this, "Vous n'auriez pas dû", Toast.LENGTH_LONG).show();
            break;
        }

    }



}
