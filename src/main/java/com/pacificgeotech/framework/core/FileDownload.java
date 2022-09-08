package com.pacificgeotech.framework.core;

import java.io.File;

public class FileDownload {

    public static String DownloadPath="E:\\repo\\Downloaded files for all the projects";

    public static boolean isFileDownloaded(String DownloadPath, String fileName) {
        boolean flag = true;
        File dir = new File(DownloadPath);
        File[] dir_contents = dir.listFiles();

        for (int i = 0; i < dir_contents.length; i++) {
            if (dir_contents[i].getName().equals(fileName))
                return flag=true;
        }

        return flag;
    }





}
