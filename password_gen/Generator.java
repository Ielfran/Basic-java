import java.security.SecureRandom;
import java.util.Scanner;

public class Generator {
    private final Alphabet alphabet;
    private static Scanner keyboard;

    public Generator(Scanner scanner){
        keyboard = scanner;
        alphabet = new Alphabet(true, true, true, true); // Default constructor
    }

    public Generator(boolean includeUpper, boolean includeLower, boolean includeNum, boolean includeSym){
        alphabet = new Alphabet(includeUpper, includeLower, includeNum, includeSym);
    }

    public void mainLoop(){
        System.out.println("Welcome to Password Services:");
        printMenu();

        String userOption = "-1";

        while(!userOption.equals("4")){
            userOption = keyboard.next();

            switch(userOption){
                case "1" -> {
                    requestPassword();
                    printMenu();
                }
                case "2" -> {
                    checkPassword();
                    printMenu();
                }
                case "3" -> {
                    printUsefulInfo();
                    printMenu();
                }
                case "4" -> printQuitMessage();
                default -> {
                    System.out.println();
                    System.out.println("Choose a valid option");
                    printMenu();
                }
            }
        }
    }

    public Password generatePassword(int length){
        final StringBuilder pass = new StringBuilder();
        final String alphabetString = this.alphabet.getAlphabet();
        SecureRandom random = new SecureRandom();

        for(int i = 0; i < length; i++){
            int index = random.nextInt(alphabetString.length());
            pass.append(alphabetString.charAt(index));
        }
        return new Password(pass.toString());
    }

    private void requestPassword(){
        boolean includeUpper = getBooleanInput("Do you want Uppercase letters \"ABCD...\" to be used?");
        boolean includeLower = getBooleanInput("Do you want Lowercase letters \"abcd...\" to be used?");
        boolean includeNum = getBooleanInput("Do you want Numbers \"1234...\" to be used?");
        boolean includeSym = getBooleanInput("Do you want Symbols \"!@#$...\" to be used?");

        if(!includeUpper && !includeLower && !includeNum && !includeSym){
            System.out.println("No characters have been selected");
            return;
        }

        System.out.println("Now enter the length of the password");
        int length = keyboard.nextInt();
        final Generator generator = new Generator(includeUpper, includeLower, includeNum, includeSym);
        final Password password = generator.generatePassword(length);

        System.err.println("Your generated password -> " + password);
    }

    private boolean getBooleanInput(String prompt){
        String input;
        do { 
            System.out.println(prompt);
            input = keyboard.next();
            if(!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no")){
                System.out.println("You have entered something incorrect. Let's try again.\n");
            }
        } while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));
        return input.equalsIgnoreCase("yes");
    }

    private void checkPassword(){
        System.out.println("\nEnter your password:");
        String input = keyboard.next();
        final Password p = new Password(input);
        System.out.println(p.calculateScore());
    }

    private void printMenu() {
        System.out.println();
        System.out.println("Enter 1 - Password Generator");
        System.out.println("Enter 2 - Password Strength Check");
        System.out.println("Enter 3 - Useful Information");
        System.out.println("Enter 4 - Quit");
        System.out.print("Choice: ");
    }

    private void printUsefulInfo() {
        System.out.println();
        System.out.println("Use a minimum password length of 8 or more characters if permitted.");
        System.out.println("Include lowercase and uppercase alphabetic characters, numbers, and symbols if permitted.");
        System.out.println("Generate passwords randomly where feasible.");
        System.out.println("Avoid using the same password twice (e.g., across multiple user accounts and/or software systems).");
        System.out.println("Avoid character repetition, keyboard patterns.");
    }

    private void printQuitMessage(){
        System.out.println("Bye");
    }
}
