package com.vksoftware.javastatistics.res;



import com.vksoftware.javastatistics.command.MiddleAgeCommand;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Authorize connector = new Authorize();
        connector.connector();


        MiddleAgeCommand middleAgeCommand = new MiddleAgeCommand();
        middleAgeCommand.execute();
    }
}
