package com.vksoftware.javastatistics;


import java.io.InterruptedIOException;
import java.util.Scanner;

public enum Operation {
    COMMON_GROUPS,
    MIDDLE_AGE,
    EXIT;

    public static Operation getOperation(Integer i) throws IllegalArgumentException {
        switch (i) {
            case 1:
                return COMMON_GROUPS;
            case 2:
                return MIDDLE_AGE;
            case 3:
                return EXIT;
            default:
                throw new IllegalArgumentException();
        }

    }

    public static Operation askOperation() throws InterruptedIOException {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                return Operation.getOperation(Integer.parseInt(sc.nextLine()));
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}
