package ru.innopolis.java.basic2_2_1_IO;


import ru.innopolis.java.basic2_2_1_IO.logger.CsvLogger;
import ru.innopolis.java.basic2_2_1_IO.logger.Logger;
import ru.innopolis.java.basic2_2_1_IO.logger.TxtLogger;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
//    implements Serializable
    //SerialVersionUID
    // private static final Long serialVersionUID = 1L;

    //    Logger log = new Logger("MyLogger");
    public static void main(String[] args) {
//        System.out.printf("Name: %s; %s; %d", "Andrei", "Gavrilov", 33);
//        System.out.print("\n");
//        System.out.println("Name: " + "Andrei; " + "Gavrilov; " + 33);
//        log.debug();
//        log.info();
//        log.error();
//        java.util.logging.logger.level = INFO


//        Logger fileLogger = new CsvLogger("MyCSVLogFile");
//        fileLogger.log("Hello from CSV logger1");

        Logger txtLogger = new TxtLogger("MyFile");
        txtLogger.log("Hello from TXT");
    }

}
