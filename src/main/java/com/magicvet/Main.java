package main.java.com.magicvet;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String PASSWORD = "1234";
    static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        run();
    }
    static void run(){
        boolean accepted = false;
        for(int i = 0; i < 3; i++){
            System.out.print("Enter your password: ");
            String input = SCANNER.nextLine();

            if(input.equals(PASSWORD)){
                accepted = true;
                break;
            } else {
                System.out.println("Access denied. Please check your password.");
            }
        }

        System.out.println(accepted? "Welcome!": "Application has been blocked.");
    }
}