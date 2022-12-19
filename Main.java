package DzOOP2;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<String,Float> gpaOfStudents = new TreeMap<>();
        gpaOfStudents.put("Иван Иванов", 4.5f);
        gpaOfStudents.put("Петр Петров", 4.8f);
        gpaOfStudents.put("Сергей Сергеев", 4.6f);
        WriterTxt writeTxt = new WriterTxt();
        writeTxt.writer(gpaOfStudents);
        WriterJSON writeJson = new WriterJSON();
        writeJson.writer(gpaOfStudents);
        WriterXML writeXml = new WriterXML();
        writeXml.writer(gpaOfStudents);
        
    }
}