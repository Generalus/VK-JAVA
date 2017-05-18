package pro100denysko;

import ukr.pro100denysko.command.MiddleAgeCommand;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Authorize connector = new Authorize();
        connector.connector();

        MiddleAgeCommand middleAgeCommand = new MiddleAgeCommand();
        middleAgeCommand.execute();
    }
}
