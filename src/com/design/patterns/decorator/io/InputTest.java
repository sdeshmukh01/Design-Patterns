package com.design.patterns.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by himu on 2/23/2018.
 */
public class InputTest {

    public static void main(String[] args) throws IOException {
        int c;
        try {
            try (InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("test.txt")))) {
                while ((c = in.read()) >= 0) {
                    System.out.print((char) c);
                }
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
