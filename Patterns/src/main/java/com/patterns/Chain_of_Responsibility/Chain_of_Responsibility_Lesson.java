package com.patterns.Chain_of_Responsibility;

public class Chain_of_Responsibility_Lesson {
    public static void main(String [] args) {
        MessagePrinter messagePrinter = new ConsoleMethodPrinter();
        FileMethodPrinter fileMethodPrinter = new FileMethodPrinter();
        messagePrinter.setNextMessagePrinter(fileMethodPrinter);
        fileMethodPrinter.setNextMessagePrinter(new DbMethodPrinter());
        messagePrinter.print("hello");
    }
}

abstract class  MessagePrinter {
    MessagePrinter nextMessagePrinter;

    void setNextMessagePrinter(MessagePrinter messagePrinter) {
        nextMessagePrinter = messagePrinter;
    }

    void print(String  message) {
        printMessage(message);
        if(nextMessagePrinter != null) {
            nextMessagePrinter.print(message);
        }
    }

    abstract void printMessage(String message);
}

class ConsoleMethodPrinter extends MessagePrinter {
    @Override
    void printMessage(String message) {
        System.out.println("message print to console " + message);
    }
}

class FileMethodPrinter extends MessagePrinter {
    @Override
    void printMessage(String message) {
        System.out.println("message print to file " + message);
    }
}

class DbMethodPrinter extends MessagePrinter {
    @Override
    void printMessage(String message) {
        System.out.println("message print to db " + message);
    }
}