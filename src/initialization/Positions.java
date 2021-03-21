package initialization;

import java.util.Scanner;

public class Positions {


    public char[] convertStringToCharArray(String s) {
        char[] myStringChar = s.toCharArray();
        return myStringChar;
    }

    public int convertCharacterToAsciiCode(char c) {
        int characterNumber = (int) c;
        return characterNumber;
    }

    public String kingPosition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select king position");
        String king = scanner.nextLine();
        char[] stringToCharacter = convertStringToCharArray(king);
        int charToAsciiFirst = convertCharacterToAsciiCode(stringToCharacter[0]);
        int charToAsciiLast = convertCharacterToAsciiCode(stringToCharacter[1]);
        while (king.length() > 2 || (charToAsciiFirst < 97 || charToAsciiFirst > 104) || charToAsciiLast < 49 || charToAsciiLast > 56) {
            System.out.println("Not a valid position. Please enter a correct position");
            king = scanner.nextLine();
            stringToCharacter = convertStringToCharArray(king);
            charToAsciiFirst = convertCharacterToAsciiCode(stringToCharacter[0]);
            charToAsciiLast = convertCharacterToAsciiCode(stringToCharacter[1]);
        }
        return king;
    }

    public String queenPosition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select queen position");
        String queen = scanner.nextLine();
        char[] stringToCharacter = convertStringToCharArray(queen);
        int charToAsciiFirst = convertCharacterToAsciiCode(stringToCharacter[0]);
        int charToAsciiLast = convertCharacterToAsciiCode(stringToCharacter[1]);
        while (queen.length() > 2 || (charToAsciiFirst < 97 || charToAsciiFirst > 104) || charToAsciiLast < 49 || charToAsciiLast > 56) {
            System.out.println("Not a valid position. Please enter a correct position");
            queen = scanner.nextLine();
            stringToCharacter = convertStringToCharArray(queen);
            charToAsciiFirst = convertCharacterToAsciiCode(stringToCharacter[0]);
            charToAsciiLast = convertCharacterToAsciiCode(stringToCharacter[1]);
        }
        return queen;
    }


}
