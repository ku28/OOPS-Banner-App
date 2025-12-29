/**
 * OOPSBannerApp UC5 - OOPS Banner Display
 *
 *  This class demonstrates advanced Object-Oriented Programming concepts through the
 *  creation and display of an ASCII art banner. It extends the functionality of Use Case 4
 *  by implementing a modular, reusable character pattern system using the Collections Framework.
 *
 * @author Kushagra
 * @version 5.0
 */

import java.util.HashMap;

public class UC5 {
    public static HashMap<Character, String[]> createCharacterMap(){
        HashMap<Character, String[]> charMap = new HashMap<>();
        charMap.put('O',  new String[]{
                " ***  ",
                "*   * ",
                "*   * ",
                "*   * ",
                "*   * ",
                "*   * ",
                " ***  "
        });
        charMap.put('P',  new String[]{
                "****  ",
                "*   * ",
                "*   * ",
                "****  ",
                "*     ",
                "*     ",
                "*     "
        });
        charMap.put('S',  new String[]{
                " **** ",
                "*     ",
                "*     ",
                " **** ",
                "     *",
                "     *",
                " **** "
        });
        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap){
        int patternHeight = charMap.get('O').length;
        for(int i = 0; i < patternHeight; i++){
            for(char ch : message.toCharArray()){
                System.out.print(charMap.get(ch)[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message,charMap);
    }
}
