package org.example;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class EncodeFile {
    public static void main(String[] args) throws IOException {
        String filePath = "example.txt";
        String encodedFile = "encoded_file.txt";

        String forEncoder = Files.readString(Path.of(filePath));
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] bytes = encoder.encode(forEncoder.getBytes());

        FileOutputStream fileOutputStream = new FileOutputStream(encodedFile);
        fileOutputStream.write(bytes);


    }
}
