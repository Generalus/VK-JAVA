package com.vksoftware.javastatistics;

import com.vksoftware.javastatistics.command.Command;
import com.vksoftware.javastatistics.command.CommandExecutor;
import com.vksoftware.javastatistics.command.CommonGroupsCommand;
import com.vksoftware.javastatistics.command.MiddleAgeCommand;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //TODO реализовать цикл, в котором просить пользователя выбрать действие, пока он не выберет EXIT
        try {
            Operation operation;
            do {

                System.out.println("print 1 for Common Groups Command");
                System.out.println("print 2 for Middle Age Command");
                System.out.println("print 3 to Exit");

                operation = Operation.askOperation();
                CommandExecutor.execute(operation);
            } while (operation != Operation.EXIT);
        } catch (InterruptedIOException ex) {
            System.out.println(ex);
        }


    }
}

