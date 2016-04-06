package com.sample.sv.devsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anjup on 4/5/16.
 */
public class NFCtagActivity extends AppCompatActivity {

    private Spinner galleryspinner;
    private Spinner selectgalleryspinner,tourspinner,exhibitspinner,tagspinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nfc_main);

        getSupportActionBar().setTitle("NFC Tags");

        galleryspinner = (Spinner) findViewById(R.id.galleryspinner);
        List<String> list = new ArrayList<String>();
        list.add("From Gallery");
        list.add("From URL");

        selectgalleryspinner = (Spinner) findViewById(R.id.selectgalleryspinner);
        List<String> glist = new ArrayList<String>();
        glist.add("Select Gallery");
        glist.add("My Galllery");
        glist.add("Test Galllery");

        tourspinner = (Spinner) findViewById(R.id.tourspinner);
        List<String> tourlist = new ArrayList<String>();
        tourlist.add("Select Tour");
        tourlist.add("My Tour");
        tourlist.add("Test Tour");

        exhibitspinner = (Spinner) findViewById(R.id.exhibitspinner);
        List<String> exhibitlist = new ArrayList<String>();
        exhibitlist.add("Select Exhibit");
        exhibitlist.add("My Exhibit");
        exhibitlist.add("Test Exhibit");

        tagspinner = (Spinner) findViewById(R.id.tagspinner);
        List<String> taglist = new ArrayList<String>();
        taglist.add("Select Tag");
        taglist.add("My Tag");
        taglist.add("Test Tag");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item,list);

        ArrayAdapter<String> galleryaAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item,glist);

        ArrayAdapter<String> touraAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item,tourlist);


        ArrayAdapter<String> exhibitAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item,exhibitlist);

        ArrayAdapter<String> tagAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item,taglist);

        galleryaAdapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        touraAdapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);


        exhibitAdapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        tagAdapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);


        galleryspinner.setAdapter(dataAdapter);
        selectgalleryspinner.setAdapter(galleryaAdapter);
        tourspinner.setAdapter(touraAdapter);
        exhibitspinner.setAdapter(exhibitAdapter);
        tagspinner.setAdapter(exhibitAdapter);

        // Spinner item selection Listener
        addListenerOnSpinnerItemSelection();


    }
    public void addListenerOnSpinnerItemSelection(){

        galleryspinner.setOnItemSelectedListener(new CustomOnItemSelectedListenernfc());
    }


}
class CustomOnItemSelectedListenernfc implements AdapterView.OnItemSelectedListener {

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

        Toast.makeText(parent.getContext(), "On Item Select : \n" + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }
}
