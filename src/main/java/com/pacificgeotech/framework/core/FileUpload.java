package com.pacificgeotech.framework.core;

import org.junit.Assert;

import java.io.File;
import java.net.URI;

import static org.junit.Assert.assertTrue;

public class FileUpload {
    public static File ShapeFile(String fileName) {

        File file = null;
        try {
            System.out.println();
            file = new File(fileName);
            URI uri = file.toURI();
            System.out.println(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertTrue(file.exists());
return file;

    }
}
