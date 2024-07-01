package ru.innopolis.java.basic2_2_3_CLASSLOADERS.gc;

import java.lang.ref.Cleaner;

public class GcDemo {
    private static final Cleaner cleaner = Cleaner.create();

    public static void main(String[] args) {
        // создадим много мусора
        for (int i = 0; i <= 20; i++) {
            new DemoObject(i);
        }
        // Просим GC запуститься;
        System.gc();

        // Подождем некоторое время, чтобы дать возможность сборщику поработать
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Программа завершилась!");
    }


    static class DemoObject {
        DemoObject(int id) {
            cleaner.register(this, new CleanerTask(id));
        }

        private record CleanerTask(int id) implements Runnable {
            @Override
            public void run() {
                System.out.println("Объект " + id + " удален сборщиком мусора!");
            }
        }
    }
}
