package management.library;

import java.lang.System;

public class Test {
    public static void main(String[] args) {
        System.out.println(System.getenv("DB_USERNAME"));
        System.out.println(System.getenv("DB_PASSWORD"));
        System.out.println(System.getenv("DB_URL"));
    }
}

