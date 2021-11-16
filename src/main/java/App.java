import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {

    FileInputStream docFile = new FileInputStream(new File("C:/Users/Diptanu/Desktop/DocToPdfConvertFiles/sampledoc.docx"));
    XWPFDocument doc =  new XWPFDocument(docFile);
    PdfOptions pdfoptions = PdfOptions.create();
    OutputStream out = new FileOutputStream(new File("C:/Users/Diptanu/Desktop/DocToPdfConvertFiles/sampledoc.pdf"));
    PdfConverter.getInstance().convert(doc,out,pdfoptions);
       doc.close();
       out.close();
       System.out.println("Pdf Conversion Done");
    }
}
