package com.example.intentparameters.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Activity2 extends Activity {

    String testo = "buelazzo";
    int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        final TextView stringa = (TextView)findViewById(R.id.textView);
        final TextView valore = (TextView)findViewById(R.id.textView2);

        Intent intent = getIntent();
        testo = intent.getStringExtra(getPackageName() + "testo");
        numero = intent.getIntExtra(getPackageName() + "numero", 1);

        stringa.setText(testo);
        valore.setText(Integer.toString(numero));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
