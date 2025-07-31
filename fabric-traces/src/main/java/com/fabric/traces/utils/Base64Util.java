package com.fabric.traces.utils;

//import sun.misc.BASE64Decoder;
import org.apache.commons.codec.binary.Base64;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Base64Util {
    public static File base64ConvertFile(String s) {
        String filePath = "/static";
        String fileName = System.currentTimeMillis()+".jpg";
        Base64 decoder = new Base64();
        File file = null;
        try {
//            byte[] bytes = decoder.decodeBuffer(s);
            byte[] bytes = decoder.decode(s);
            for (int i = 0; i < bytes.length; ++i) {
                if (bytes[i] < 0) {
                    bytes[i] += 256;
                }
            }
            String imageFilePath = filePath+fileName.replace("\\\\","/");
            OutputStream out = new FileOutputStream(imageFilePath);
            out.write(bytes);
            out.flush();
            out.close();
            file = new File(imageFilePath);
        }catch (IOException e){
            e.printStackTrace();
        }
        return file;
    }
}
