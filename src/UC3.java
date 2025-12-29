/**
 * OOPSBannerApp UC3 - OOPS Banner Display
 *
 * This class extends User Story 2 to display the "OOPS" banner using a modular approach
 * by implementing the Single Responsibility Principle (SRP) and Method Extraction.
 *
 * <p><b>Pattern:</b> String arrays representing ASCII art for letters O, P, and S are generated
 * and combined horizontally to create the visual "OOPS" message.</p>
 *
 * @author Kushagra
 * @version 3.0
 */
public class UC3 {
    public static String[] getOPattern(){
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** ",
        };
    }
    public static String[] getPPattern(){
        return new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    ",
        };
    }
    public static String[] getSPattern(){
        return new String[]{
                " **** ",
                "*     ",
                "*     ",
                " **** ",
                "     *",
                "     *",
                " **** ",
        };
    }
    public static void main(String[] args) {
        String[] oPatterns = getOPattern();
        String[] pPatterns = getPPattern();
        String[] sPatterns = getSPattern();

        for(int i = 0; i < oPatterns.length; i++){
            System.out.println(oPatterns[i] + " " + oPatterns[i] + " " + pPatterns[i] + " " + sPatterns[i]);
        }
    }
}
