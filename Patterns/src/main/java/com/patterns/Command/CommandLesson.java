package com.patterns.Command;

/*

        https://www.youtube.com/watch?v=7q4XdO8TtHM&list=PL786bPIlqEjRMh8_H4EBkxXlLis-Ag4na&index=18

        https://github.com/iluwatar/java-design-patterns/tree/master/command

        Инкапсулируйте запрос как объект, тем самым позволяя параметризовать клиентов с различными запросами,
        очередями или запросами журнала и поддерживать отменяемые операции.

 */

import java.util.ArrayList;
import java.util.List;

public class CommandLesson {
    public static void main(String [] args) {

        Receiver receiver = new Receiver();
        receiver.addCommand(new MouseClick());
        receiver.addCommand(new MousePress());
        receiver.RunCommand();

    }
}

interface Command {
    void execute();
}

class MouseClick implements  Command {
    @Override
    public void execute() {
        System.out.println("mouse click");
    }
}

class MousePress implements Command {
    @Override
    public void execute() {
        System.out.println("mouse pressed");
    }
}

class  Receiver  {
    List<Command> commands = new ArrayList<>();

    void addCommand(Command command) {
        commands.add(command);
    }

    void RunCommand () {
        for (Command command : commands) {
            command.execute();
        }
    }
}