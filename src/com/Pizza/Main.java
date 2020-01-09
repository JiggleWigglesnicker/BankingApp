package com.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("||==================================================||" +
                    "\n||Welcome to the Banking Administration application.||" +
                    "\n||==================================================|| \n");
            System.out.println("Please select an option." +
                    " \n-option one \n-option two \n-Exit\n");

            String action = "";
            while(action != "-Exit") {
                action = reader.readLine();

                switch (action) {
                    case "-command one":
                        //method here
                        break;
                    case "command two":
                        //method here
                        break;
                    case "-Exit": System.exit(1);
                        break;
                    default: System.out.println("Invalid Command");
                }
            }
        }catch (IOException e){
            System.out.println("line cant be read");
        }
    }
}
