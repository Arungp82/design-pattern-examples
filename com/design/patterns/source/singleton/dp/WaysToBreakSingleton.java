//package com.design.patterns.source.singleton.dp;
//
//import com.design.patterns.source.Singleton;
//
//import java.io.*;
//import java.lang.reflect.Constructor;
//
//public class WaysToBreakSingleton implements Serializable {
//    public static void main(String[] args) throws ClassNotFoundException, IOException {
//        Singleton originalSingletonInstance = Singleton.getInstance();
//
//        Singleton duplicateSingletonInstance = Singleton.getInstance();
//
//        System.out.println("Hash code for originalSingletonInstance is :: " + originalSingletonInstance.hashCode());
//        System.out.println("Hash code for duplicateSingletonInstance is :: " + duplicateSingletonInstance.hashCode());
//
//        //Reflection - 1st way
//
////        Class<?> singletonClass = Class.forName("com.design.patterns.source.Singleton");
////        Constructor<?> constructor = (Constructor<Singleton>) singletonClass.getDeclaredConstructors();
////        constructor.setAccessible(true);
////        Singleton brokenSingletonUsingReflections = constructor.newInstance();
//
////        System.out.println("Hash code for originalSingletonInstance is :: " + originalSingletonInstance.hashCode());
////        System.out.println("Hash code for duplicateSingletonInstance is :: " + duplicateSingletonInstance.hashCode());
//        System.out.println("-------------------------------------------------");
//        //Serialization process - 2nd process
////        try {
////            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Serialization.ser"));
////            objectOutputStream.writeObject(originalSingletonInstance);
////            objectOutputStream.close();
////
////            //deserialization
////            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Serialization.ser"));
////            Singleton brokenSingletonUsingDeserialization = (Singleton) objectInputStream.readObject();
////            objectInputStream.close();
////            System.out.println("Hash code for originalSingletonInstance is :: " + originalSingletonInstance.hashCode());
////            System.out.println("Hash code for brokenSingletonUsingDeserialization is :: " + brokenSingletonUsingDeserialization.hashCode());
////            System.out.println("-------------------------------------------------");
////        } catch (NotSerializableException nse) {
////            nse.printStackTrace();
////        }
//
//
//        //Cloning
//       Singleton originalSingletonInstance1 = Singleton.getInstance();
//
//
//
//
//
//    }
//}
