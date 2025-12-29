/**
 * OOPSBannerApp UC2 - OOPS Banner Display
 *
 * This class demonstrates the creation of ASCII art banner using
 * Object-Oriented Programming principles.
 * It extends the basic banner concept by displaying the word "OOPS"
 * in a visual format using asterisks (*) and spaces to form each letter.
 *
 * @author Kushagra
 * @version 2.0
 */

public class UC2 {
    public static void main(String[] args) {
        String[] lines = {
                "   ***       ***     ******       ***** ",
                " **   **   **   **   **    **   **      ",
                "**     ** **     **  **     ** **       ",
                "**     ** **     **  **    **   **      ",
                "**     ** **     **  ******       ***   ",
                "**     ** **     **  **              ** ",
                "**     ** **     **  **               **",
                " **   **   **   **   **              ** ",
                "   ***       ***     **         *****   "
        };
        for(String line : lines) {
            System.out.println(line);
        }
    }
}
