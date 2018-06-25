package com.example.jon.electronicsengineeringtoolkit;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Main extends Activity {

    public Button ohm;
    public Button color;
    public Button formula;

    public void init() {
        ohm = findViewById(R.id.btnOhms);
        color = findViewById(R.id.btnColor);
        formula = findViewById(R.id.btnFormula);

        ohm.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Main.this, OhmActivity.class));
            }
        });

        color.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Main.this, ColorActivity.class));
            }
        });

        formula.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new  Intent(Main.this, FormulaActivity.class));
            }
        });

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        init();




    }
}
