package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfmarathi extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfmarathi);
        pdfView =(PDFView) findViewById(R.id.pdfviewtest);
        pdfView.fromAsset("QB-MARATHI.pdf").load();
    }
}