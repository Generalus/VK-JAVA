package com.vksoftware.javastatistics;

import com.vksoftware.javastatistics.command.MiddleAgeCommand;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //TODO реализовать цикл, в котором просить пользователя выбрать действие, пока он не выберет EXIT

        MiddleAgeCommand middleAgeCommand = new MiddleAgeCommand();
        middleAgeCommand.execute();

    }
}
