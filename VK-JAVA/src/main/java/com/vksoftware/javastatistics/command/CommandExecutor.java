package com.vksoftware.javastatistics.command;

import com.vksoftware.javastatistics.Operation;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {

    private static Map<Operation, Command> map = new HashMap<>();

    static {
        map.put(Operation.COMMON_GROUPS, new CommonGroupsCommand());
        map.put(Operation.MIDDLE_AGE, new MiddleAgeCommand());
        map.put(Operation.EXIT, new ExitCommand());
    }

    public static void execute(Operation operation) {
        map.get(operation).execute();
    }
}
