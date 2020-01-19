package com.daotec.bluetoothapp;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listVIew;
    TextView statusTextView;
    Button searchButton;
    BluetoothAdapter bluetoothAdapter;

    public void searchClicked(){
        statusTextView.setText("Searching");
        searchButton.setEnabled(false);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listVIew = findViewById(R.id.listView);
        statusTextView =  findViewById(R.id.statusTextView);
        searchButton = findViewById(R.id.searchButton);
    }
}
