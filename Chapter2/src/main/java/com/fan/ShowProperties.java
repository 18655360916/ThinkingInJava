package com.fan;

import java.util.Properties;

public class ShowProperties {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.list(System.out);

        String libraryPath = System.getProperty("java.library.path");
        System.out.println(libraryPath);
        String username = System.getProperty("user.name");
        System.out.println(username);
    }
}
