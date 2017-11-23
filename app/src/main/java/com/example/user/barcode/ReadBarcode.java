package com.example.user.barcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ReadBarcode extends AppCompatActivity {


    private EditText readBarcode;
    private EditText readBarcodeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_barcode);

        readBarcode = (EditText) findViewById(R.id.readBarcode);
        readBarcodeName = (EditText) findViewById(R.id.readBarcodeName);

        readBarcode.setEnabled(false);
        readBarcode.setFocusable(false);

        readBarcodeName.setEnabled(false);
        readBarcodeName.setFocusable(false);

    }

    public void backBarcodeMenu(View view) {
        Intent barcodeMenu = new Intent(this,BarcodeMenu.class);
        startActivity(barcodeMenu);
    }

    public void findBarcode(View view) {
    }
}
