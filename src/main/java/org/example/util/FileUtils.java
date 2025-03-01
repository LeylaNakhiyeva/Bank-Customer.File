package org.example.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileUtils {
    public static final String basePath = "C:\\Users\\User\\Desktop\\";

    public static void writeObjectToFile(String fileName, Object object) {
        try {
            FileOutputStream fop = new FileOutputStream(basePath+fileName);
            ObjectOutputStream oop = new ObjectOutputStream(fop);
            oop.writeObject(object);
            oop.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Exception occurred");
        }
    }

//    public static Object readObjectFromFile(String fileName) throws IOException, ClassNotFoundException {
//            FileInputStream fileInputStream = new FileInputStream(basePath+fileName);
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            return objectInputStream.readObject();
//
//    }
}



