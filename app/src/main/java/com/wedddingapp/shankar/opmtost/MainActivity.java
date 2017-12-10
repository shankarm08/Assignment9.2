package com.wedddingapp.shankar.opmtost;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.datalist, menu);
        return super.onCreateOptionsMenu(menu);



    }


    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.computer:
                Toast msg = Toast.makeText(MainActivity.this, "you clicked computer", Toast.LENGTH_LONG);
                msg.show();
                break;
            case R.id.gamepad:
                Toast msg1 = Toast.makeText(MainActivity.this, "you clicked gamepad", Toast.LENGTH_LONG);
                msg1.show();
                break;

            case R.id.video:
                Toast msg2 = Toast.makeText(MainActivity.this, "you clicked video", Toast.LENGTH_LONG);
                msg2.show();
                break;

            case R.id.camera:
                Toast msg3 = Toast.makeText(MainActivity.this, "you clicked camera", Toast.LENGTH_LONG);
                msg3.show();
                break;

            case R.id.email:
                Toast msg4 = Toast.makeText(MainActivity.this, "you clicked email", Toast.LENGTH_LONG);
                msg4.show();
                break;


        }
        return true;
    }
}








