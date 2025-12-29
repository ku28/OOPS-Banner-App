/**
 * OOPSBannerApp UC4 - OOPS Banner Display
 *
 * This class demonstrates key Object-Oriented Programming (OOP) concepts through
 * a banner display system that renders text using ASCII art patterns.
 *
 * @author Kushagra
 * @version 4.0
 */
public class UC4 {
    static class CharacterPatternMap{
        private Character character;
        private String[] pattern;
        public CharacterPatternMap(Character character, String[] pattern){
            this.character = character;
            this.pattern = pattern;
        }
        public Character getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMap(){
        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', new String[]{
                        " ***  ",
                        "*   * ",
                        "*   * ",
                        "*   * ",
                        "*   * ",
                        "*   * ",
                        " ***  "
                }),
                new CharacterPatternMap('P', new String[]{
                        "****  ",
                        "*   * ",
                        "*   * ",
                        "****  ",
                        "*     ",
                        "*     ",
                        "*     "
                }),
                new CharacterPatternMap('S', new String[]{
                        " **** ",
                        "*     ",
                        "*     ",
                        " **** ",
                        "     *",
                        "     *",
                        " **** "
                }),
                new CharacterPatternMap(' ', new String[]{
                        "      ",
                        "      ",
                        "      ",
                        "      ",
                        "      ",
                        "      ",
                        "      "
                })
        };
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps){
        for(CharacterPatternMap map : charMaps){
            if(map.getCharacter() == ch){
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ',  charMaps);
    }
    public static void printMessage(String message, CharacterPatternMap[] charMaps){
        int height = charMaps[0].getPattern().length;
        for(int i = 0; i < height; i++){
            for(char ch : message.toCharArray()){
                String[] pattern = getCharacterPattern(ch, charMaps);
                System.out.print(pattern[i]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMap();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
