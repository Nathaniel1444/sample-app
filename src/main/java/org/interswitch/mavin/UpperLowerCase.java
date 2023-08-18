package org.interswitch.mavin;

public class UpperLowerCase {
    public String wordToUpperCase(String word) {
        if (null != word && !word .isEmpty()) {
            String[] words = word.split(" ");
            return words[0].toUpperCase();
        }
        throw new
                IllegalArgumentException("Word cannot be Empty");
    }

    public String wordToLowerCase(String word) {
        if (null != word && !word .isEmpty()) {
            String[] words = word.split(" ");
            return words[0].toLowerCase();
        }
        throw new
                IllegalArgumentException("Word cannot be Empty");
    }
}
