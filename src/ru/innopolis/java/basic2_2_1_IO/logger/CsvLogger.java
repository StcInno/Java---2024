package ru.innopolis.java.basic2_2_1_IO.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;

@SuppressWarnings("unchecked")
@Deprecated
public final class CsvLogger extends FileOutput implements Logger, Serializable {
    private String fileName;

    public CsvLogger() {
        this.fileName = getDefaultFileName() + getFileExtension();
    }

    public CsvLogger(final String fileName) {
        this.fileName = fileName + getFileExtension();
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
        return ".csv";
    }
}
