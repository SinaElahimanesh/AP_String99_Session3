package view;

import controller.MainController;

import java.util.Scanner;

public class Main {

    // VIEW
    // input / output
    private static MainController commandController;

    // terminal
    public static void main(String[] args) {
        getInput();
    }

    public static void getInput() {
        commandController = MainController.getInstance();
        Scanner input = new Scanner(System.in);
        String instruction;
        while (true) {
            instruction = input.next();
            if(commandController.processCommand(instruction)) {
                break;
            }
        }
//        Math.
    }
}
