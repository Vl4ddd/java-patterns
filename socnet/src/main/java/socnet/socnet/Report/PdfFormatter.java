import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfFormatter implements ReportFormatter {
    @Override
    public void format(String data) {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("Report.pdf"));

        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        Chunk chunk = new Chunk("Report 1", font);

        document.add(chunk);
        document.close();
    }
}