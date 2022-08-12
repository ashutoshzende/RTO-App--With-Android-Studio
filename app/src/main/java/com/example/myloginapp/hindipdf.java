package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class hindipdf extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindipdf);
        pdfView =(PDFView) findViewById(R.id.pdfviewtest);
        pdfView.fromAsset("hindi_qb.pdf").load();
    }
}