package DzOOP2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;

public class WriterXML implements WriterInFile {

    @Override
    public void writer(Map<String, Float> map) {
        try {
            File file = new File("WriteXML.xml");
            FileOutputStream fos = new FileOutputStream(file);
            PrintWriter pw = new PrintWriter(fos);
            pw.println("<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
            for (Entry<String, Float> element : map.entrySet()) {
                pw.printf("\t<students>\n");
                pw.printf("\t\t<student>\n");
                pw.printf("\t\t\t<name>");
                pw.print(element.getKey());
                pw.printf("</name>\n");
                pw.printf("\t\t\t\t<grade>");
                pw.print(element.getValue());
                pw.printf("</grade>\n");
                pw.printf("\t\t</student>\n");
                pw.printf("\t</students>\n");
            }

            pw.flush();
            pw.close();
            fos.close();
        } catch (Exception e) {
        }

    }
    
}
