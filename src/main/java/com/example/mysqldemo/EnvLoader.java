package com.example.mysqldemo;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvLoader {
    public static Dotenv dotenv = Dotenv.configure().directory("/home/daswosau/Library/School/Java/261007/mysqlDemo").load();

    public static String get(String key) {
        return dotenv.get(key);
    }
    public static String get(String key, String defaultValue) {
        return dotenv.get(key, defaultValue);
    }
}
