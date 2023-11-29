/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test_pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

/**
 *
 * @author DELL
 */
public class Test_pdf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          try{
          String file_name = "pdf\\test.pdf";
          Document doc = new Document();
          
          PdfWriter.getInstance(doc, new FileOutputStream(file_name));
          
          doc.open();
          
          // add an image
          doc.add(Image.getInstance("ee.jpeg"));

          //add a paragraph
          
          Paragraph p = new Paragraph("Hello pdf!\n\n\n\n");
          doc.add(p);
          
          
          //add a table 
          
          PdfPTable t = new PdfPTable(4);
          
          PdfPCell c1 = new PdfPCell(new Phrase("colmn1"));
          t.addCell(c1);
          PdfPCell c2 = new PdfPCell(new Phrase("colmn2"));
          t.addCell(c2);
          PdfPCell c3 = new PdfPCell(new Phrase("colmn3"));
          t.addCell(c3);
          PdfPCell c4 = new PdfPCell(new Phrase("colmn14"));
          t.addCell(c4);
          t.setHeaderRows(1);
          
          t.addCell("1");
          t.addCell("2");
          t.addCell("3");
          t.addCell("4");
          t.addCell("5");
          t.addCell("6");
          t.addCell("7");
          t.addCell("8");
          
          
          doc.add(t);
          
          
          
          
          
          doc.close();
          
          }catch(Exception e){
              System.err.println(e.getMessage());
          };
    
    }
}
