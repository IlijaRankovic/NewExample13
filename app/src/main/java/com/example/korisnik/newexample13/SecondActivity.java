package com.example.korisnik.newexample13;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Korisnik on 10.5.2017..
 */

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onCreate", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onStart(){
        super.onStart();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onStrat", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onResume(){
        super.onResume();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivty.onResume", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivty.onRestart", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onPause(){
        super.onPause();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivty.onPause", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onStop(){
        super.onStop();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivty.onStop", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivty.onDestroy", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void btnStartActivityClicked(View view){
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        startActivity(intent);
    }

    public void btnOpenCameraClicked(View view){
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(i);
    }
}
