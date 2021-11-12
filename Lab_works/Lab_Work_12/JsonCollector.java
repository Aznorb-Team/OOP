package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class JsonCollector {
    public void getInfo(JSONImportable ji) throws IOException {
        File file = new File("output.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(ji.getJson());
        fileWriter.close();
    }
}
