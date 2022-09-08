package com.pacificgeotech.framework.CreatePDFReport;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AutomationPDFReport {


    Document doc;

    public void openPdfPath() throws FileNotFoundException, DocumentException {

        String fileName = new File("").getAbsoluteFile().toString()+"/TestReport/pdf-"+System.currentTimeMillis()+".pdf";

        FileOutputStream fos = new FileOutputStream(fileName);

        doc = new Document();

        PdfWriter.getInstance(doc, fos);

        doc.open();
    }

    public void addMetaData(String authorName, String title, String description){
        doc.addAuthor(authorName);
        doc.addTitle(title);
        doc.addSubject(description);
    }

    public void addParagraph(String text) throws DocumentException{
        doc.add(new Paragraph(text));

    }

    public void closePdf(){
        doc.close();
    }




}
