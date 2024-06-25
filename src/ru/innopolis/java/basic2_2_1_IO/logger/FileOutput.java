package ru.innopolis.java.basic2_2_1_IO.logger;

public abstract class FileOutput {
    private final String defaultFileName = "default_file_name";
    protected String fileName;

    public FileOutput() {
        this.fileName = getDefaultFileName() + getFileExtension();
    }

    public FileOutput(final String fileName) {
        this.fileName = fileName + getFileExtension();
    }

    protected String getDefaultFileName() {
        return this.defaultFileName;
    }

    public abstract String getFileExtension();
}
