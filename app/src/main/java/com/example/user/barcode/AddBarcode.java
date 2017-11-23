package com.example.user.barcode;

import android.content.Intent;
import android.graphics.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

public class AddBarcode extends AppCompatActivity {

    private SurfaceView surfaceView;
    private SurfaceHolder surfaceHolder;
    private Camera mCamera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_barcode);

    }

    public void backBarcodeMenu(View view) {
        Intent barcodeMenu = new Intent(this,BarcodeMenu.class);
        startActivity(barcodeMenu);
    }

    public void readBarcode(View view) {
    }
}
