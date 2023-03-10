package com.mp.pdfokuyucu;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class DocumentActivity extends AppCompatActivity {


    String filePath = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document);

        PDFView pdfView = findViewById(R.id.pdfView);
        filePath = getIntent().getStringExtra("path");

        File file = new File(filePath);
        Uri path = Uri.fromFile(file);
        pdfView.fromUri(path).load();
    }
}

/* PDF listesi görüntülenen ekrandan, PDF'in açıldığı ekranda görüntülenecek
verileri getirme işleminin başlatılması.

Gösterilecek olan PDF'ler build.gradle app module kısmından 'implementation ile
PDFReader kütüphanesi aktif edilir. */