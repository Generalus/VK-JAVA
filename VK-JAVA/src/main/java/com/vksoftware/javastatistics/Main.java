package com.vksoftware.javastatistics;

import com.vksoftware.javastatistics.command.CommonGroupsCommand;
import com.vksoftware.javastatistics.command.MiddleAgeCommand;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //TODO реализовать цикл, в котором просить пользователя выбрать действие, пока он не выберет EXIT
        Scanner sc = new Scanner(System.in);

        System.out.println("print 1 for Middle Age Command");
        System.out.println("print 2 for Common Groups Command");
        System.out.println("print EXIT to finish");
        for (int i = 0; ; i++) {
            String choice = sc.nextLine().toUpperCase();

            switch (choice) {
                case "1":
                    MiddleAgeCommand middleAgeCommand = new MiddleAgeCommand();
                    middleAgeCommand.execute();
                    break;
                case "2":
                    CommonGroupsCommand commonGroupsCommand = new CommonGroupsCommand();
                    commonGroupsCommand.execute();
                    System.out.println("2");
                    break;
                case "EXIT":
                    System.out.println("Good luck");
                    break;
            }
            if (choice == "EXIT") {
                break;
            }
        }
    }
}

