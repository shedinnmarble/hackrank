package com.ctci.dynamicProgramming;

import java.io.File;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by Dewei on 12/14/2016.
 */
public class CountTxtFile {
    private static int count = 0;

    public static int numberOfJavaFile(String dir) {

        File[] files = new File(dir).listFiles();
        for (File f : files) {
            System.out.println(f.getPath());
            if (f.isFile() && f.getName().endsWith(".pdf")) {
                count++;
            }
            if (f.isDirectory()) {
                numberOfJavaFile(f.getPath());
            }
        }
        return count;
    }
}
