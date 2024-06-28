package ru.innopolis.java.basic2_2_2_REFLECTION;

import ru.innopolis.java.basic2_2_1_IO.logger.CsvLogger;
import ru.innopolis.java.basic2_2_1_IO.logger.TxtLogger;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<CsvLogger> clazz = CsvLogger.class;
//        System.out.println(clazz.getName());
//        System.out.println(clazz.getSuperclass());
//        Class<?>[] classes = clazz.getInterfaces();
//        System.out.println(Arrays.toString(classes));
//        System.out.println(classes[0].getInterfaces()[0]);
//
//        System.out.println(Arrays.toString(clazz.getSuperclass().getInterfaces()));
//        System.out.println(Arrays.toString(clazz.getInterfaces()));
        Constructor<?>[] constructors = clazz.getConstructors();
        System.out.println(Arrays.toString(constructors));

        Class<?> txtLogger = TxtLogger.class;

        System.out.println(Arrays.toString(txtLogger.getDeclaredConstructors()));

        for (Constructor<?> constructor : constructors) {
            Class<?>[] params = constructor.getParameterTypes();
            for (Class<?> param : params) {
                System.out.println(param.getName());

            }
        }

        Constructor<?> myConstructor = CsvLogger.class.getConstructor(String.class);
        CsvLogger csv = (CsvLogger) myConstructor.newInstance("Hello");
        csv.log("Hello from Reflection");

        //чтобы получить доступ к private полям и методам - нужно выставить для них в рефлексии field.setAccessible(true);

        int value = clazz.getModifiers();
        if (Modifier.isFinal(value)) {
            System.out.print("final ");
        }
        if (Modifier.isPublic(value)) {
            System.out.print("public \n");
        }

        Annotation annotation = clazz.getAnnotation(Deprecated.class);
        System.out.println(annotation);

        Annotation[] annotations = clazz.getAnnotations();
        System.out.println(Arrays.toString(annotations));
    }
}
