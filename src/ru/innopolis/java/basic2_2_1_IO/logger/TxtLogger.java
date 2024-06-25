package ru.innopolis.java.basic2_2_1_IO.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TxtLogger extends FileOutput implements Logger {

    public TxtLogger(final String fileName) {
        super(fileName);
    }

    @Override
    public void log(String message) {
        try (Writer writer = new FileWriter(fileName, true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
//            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getFileExtension() {
        return ".txt";
    }
}
