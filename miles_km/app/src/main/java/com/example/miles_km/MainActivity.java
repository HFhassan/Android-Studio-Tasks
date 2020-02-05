package com.example.miles_km;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMilestoKm = (Button)findViewById(R.id.buttonConvMilestoKm);
        buttonConvMilestoKm.setOnClickListener(new View.OnClickListener()
                                               {
                                                   public  void  onClick (View v)
                                                   {
                                                       EditText editTextMiles = (EditText) findViewById(R.id.editTextMiles);

                                                       EditText editTextkm = (EditText) findViewById(R.id.editTextkm);
                                                       double vmiles =Double.valueOf(editTextMiles.getText().toString());
                                                       double vkm = vmiles/0.62137;
                                                       DecimalFormat formatval = new DecimalFormat("##.##");
                                                       /* formatval.format(vkm); */
                                                       editTextkm.setText(formatval.format(vkm));

                                                   }
                                               }
        );
        Button buttonConvKmtoMiles = (Button)findViewById(R.id.buttonConvKmtoMiles);
        buttonConvKmtoMiles.setOnClickListener(new View.OnClickListener()
                                               {
                                                   public  void  onClick (View v)
                                                   {
                                                       EditText editTextMiles = (EditText) findViewById(R.id.editTextMiles);

                                                       EditText editTextkm = (EditText) findViewById(R.id.editTextkm);
                                                       double vkm =Double.valueOf(editTextkm.getText().toString());
                                                       double vmiles = vkm * 0.62137;
                                                       DecimalFormat formatval = new DecimalFormat("##.##");
                                                       /* formatval.format(vkm); */
                                                       editTextMiles.setText(formatval.format(vmiles));

                                                   }
                                               }
        );
    }
}
