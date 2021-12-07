package com.nl3.인터페이스;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        FileInputStream fis = new FileInputStream("src/setting.txt");
        Scanner sc = new Scanner(fis);
        String className = sc.nextLine();
        sc.close();
        fis.close();

        Class clazz = Class.forName(className);
        A a = new A();
        X x = (X) clazz.getDeclaredConstructor().newInstance();
        a.setX(x);

        a.output();
    }
}
