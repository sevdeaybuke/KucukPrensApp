package com.sevdeaybuke.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pdfView=(PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("kucukprens.pdf").load();

    }
}
