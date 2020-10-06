import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversedName {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean inInputAValidName = false;
        String input;

        while (!inInputAValidName) {
            System.out.println("Please enter your first and last name in the format \"Name Surname\": ");
            input = reader.readLine();

            if (inInputAValidName(input)){
                reverseNameAndSurname(input);
                inInputAValidName = true;
            }
        }
    }

    public static boolean inInputAValidName (String input) {

        boolean isNameValid = true;

        if (containsDigits(input)){
            System.out.println("Input not valid, numbers are not allowed. Please enter the name in the format \"Name Surname\"");
            return isNameValid = false;
        }
        if (!input.matches("(\\w+)\\s(\\w+)")){
            System.out.println("Input not valid. Please enter the name in the format \"Name Surname\"");
            return isNameValid = false;
        }
        return isNameValid;
    }

    private static boolean containsDigits (String input) {

        boolean isCharANumber = false;
        char[] chars = input.toCharArray();

        for( int i = 0; i < input.length(); i++ ){
            if(Character.isDigit(chars[i])){
                return isCharANumber = true;
            }
        }
        return isCharANumber;
    }

    public static void reverseNameAndSurname (String input) {

        String reversedInput = "";

        for (int i = input.length() -1; i>=0; i--){
            reversedInput+=input.charAt(i);
        }
        System.out.println("Your Name and Surname reversed looks like this: " + reversedInput);
    }
}
