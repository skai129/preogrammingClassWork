package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Function Name: Input
        // Inputs: string to be used as a prompt
        // What it should do:
            // Print the prompt to the screen
            // get input from the user
        // Returns: string containing what the user entered
        Input();

        // Function Name: IntInput
        // Inputs: string to be used as a prompt
        // What it should do:
            // Print the prompt to the screen (use the input function created above)
            // get input from the user
            // this should continue to re prompt the user and get new input until an integer is entered by the user
        // Returns: the integer that the user entered
        IntInput();

        // Function Name: GenerateNumber
        // Inputs: none
        //What it should do:
            //generate random number between 1 and 100  - see bottom of page for how to do this
        // Returns: the number generated
        GenerateNumber();

        // Function Name: GetGuess
        // Inputs: none
        // What it should do:
            // prompt the user to guess a number between 1 and 100 (use IntInput you created to do this.
            // while the number returned by the function is not valid have it re ask for a number
        // Returns: the number the user entered (should be valid integer between 1-100 at this point)
        GetGuess();

        // Function Name: printHint
        //Inputs: theSecretNumber, userGuessedNumber
        // What it should do:
            // if userGuessedNumber is less than theSecretNumber
                // print your number was too small
            // else if userGuessedNumber is greater than theSecretNumber
                // print your number was too large
        // Returns: nothing
        printHint();

        //Function Name: CheckGuess
        // Inputs: theSecretNumber, userGuessedNumber
        // What it should do:
            // check to see if the number the userGuessedNumber was != or == to theSecretNumber
            // if theSecretNumber was != userGuessedNumber then call PrintHint
        // Returns: boolean indicating if it was a match or not
        CheckGuess();
    }
    static void Input(){
        System.out.println("Enter your name:");
    }
    static void IntInput(){

    }
    static int GenerateNumber(){
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        return n;
    }
    static void GetGuess(){

    }
    static void printHint(int theSecretNumber, int userGuessedNumber){

    }
    static void CheckGuess(){

    }
}
