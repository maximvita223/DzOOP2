package DzOOP2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;

public class WriterJSON implements WriterInFile {

    @Override
    public void writer(Map<String, Float> map) {
        try {
            File file = new File("WriteJSON.json");
            FileOutputStream fos = new FileOutputStream(file);
            PrintWriter pw = new PrintWriter(fos);
            pw.write("{\n");
            int count = 1;
            for (Entry<String, Float> element : map.entrySet()) {
                if(map.size()==count){
                    pw.println("    " + '"' + element.getKey() + '"' + ": " + element.getValue());
                }
                else{
                pw.println("    " + '"' + element.getKey() + '"' + ": " + element.getValue() + ",");
                }
                count++;
            }
            pw.write("}\n");

            pw.flush();
            pw.close();
            fos.close();
        } catch (Exception e) {
        }

    }

}