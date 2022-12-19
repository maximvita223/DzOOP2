package DzOOP2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;

public class WriterTxt implements WriterInFile {

    @Override
    public void writer(Map<String, Float> map) {
        try {
            File file = new File("WriteTXT.txt");
            FileOutputStream fos = new FileOutputStream(file);
            PrintWriter pw = new PrintWriter(fos);

            for (Entry<String, Float> element : map.entrySet()) {
                pw.println(element.getKey() + " = " + element.getValue());
            }

            pw.flush();
            pw.close();
            fos.close();
        } catch (Exception e) {
        }

    }

}
