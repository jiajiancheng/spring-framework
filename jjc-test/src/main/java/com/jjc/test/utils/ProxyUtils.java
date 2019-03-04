package com.jjc.test.utils;

public class ProxyUtils {


    /**
     * 用于生产代理对象的字节码，并将其保存到硬盘上
     * @param className
     * @param cl
     * @param path
     */
    public static void addClassToDisk(String className, Class<?> cl, String path) {
//        //用于生产代理对象的字节码
//        byte[] classFile = ProxyGenerator.generateProxyClass(className, cl.getInterfaces());
//        FileOutputStream out = null;
//        try {
//            out = new FileOutputStream(path);
//            //将代理对象的class字节码写到硬盘上
//            out.write(classFile);
//            out.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (out != null) {
//                    out.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
