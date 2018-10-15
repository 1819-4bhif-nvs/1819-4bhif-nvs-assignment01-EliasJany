package at.htl.ignoreLetters;

public class StringUtility {
    public static String trimCharacterA(String word)
    {
        return word.replaceFirst("^A*","").replaceFirst("A*$","");
    }
}
