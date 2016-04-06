package com.sample.sv.devsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button qrbttn,nfcbttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qrbttn = (Button)findViewById(R.id.qrbttn);
        nfcbttn = (Button)findViewById(R.id.nfcbttn);
        qrbttn.setOnClickListener(this);
        nfcbttn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.gallerybttn:
                Intent galleryIntenet = new Intent(MainActivity.this,ImportGallleryActivity.class);
                startActivity(galleryIntenet);
                break;
            case R.id.nfcbttn:
                Intent nfcIntenet = new Intent(MainActivity.this,NFCtagActivity.class);
                startActivity(nfcIntenet);
                break;
            case R.id.qrbttn:
                Intent qrIntenet = new Intent(MainActivity.this,QRcodeActivity.class);
                startActivity(qrIntenet);
                break;
            case R.id.blebttn:
                Intent beaconIntenet = new Intent(MainActivity.this,BeaconsActivity.class);
                startActivity(beaconIntenet);
                break;
        }
    }
}
