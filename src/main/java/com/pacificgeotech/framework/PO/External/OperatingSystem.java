package com.pacificgeotech.framework.PO.External;


public class OperatingSystem {

    public static String OS = System.getProperty("os.name").toLowerCase();

    static void OperatingSystem() {

        System.out.println(OS);

        if (isWindows()) {
            System.out.println("This is Windows");
        } else if (isMac()) {
            System.out.println("This is Mac");
        } else if (isUnix()) {
            System.out.println("This is Unix or Linux");
        } else if (isSolaris()) {
            System.out.println("This is Solaris");
        } else {
            System.out.println("Your OS is not support!!");
        }
    }

    private static boolean isWindows() {

        return (OS.contains("win"));

    }

    private static boolean isMac() {

        return (OS.contains("mac"));

    }

    private static boolean isUnix() {

        return (OS.contains("nix") || OS.contains("nux") || OS.indexOf("aix") > 0 );

    }

    private static boolean isSolaris() {

        return (OS.contains("sunos"));

    }

    public void MyOs() {
        System.out.println(OS);
    }

}
