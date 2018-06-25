package com.example.jon.electronicsengineeringtoolkit;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import java.text.DecimalFormat;


public class ColorActivity extends Activity{

   protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_color);
      setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
      Spinner band1 = findViewById(R.id.spinner1);
      Spinner band2 = findViewById(R.id.spinner2);
      Spinner multiplier = findViewById(R.id.spinner3);
      Spinner tolerance = findViewById(R.id.spinner4);

      TextView bandTxt1 = findViewById(R.id.bText1);

   }

}
