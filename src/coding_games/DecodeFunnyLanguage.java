package coding_games;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecodeFunnyLanguage {

    public static String decode(List<String> words, String message) {
        Map<String, String> wordMap = createWordMap(words);
        StringBuilder decodedMessage = new StringBuilder();

        String[] messageWords = message.split(" ");
        for (String word : messageWords) {
            String decodedWord = decodeWord(word, wordMap);
            decodedMessage.append(decodedWord).append(" ");
        }

        return decodedMessage.toString().trim();
    }

    private static Map<String, String> createWordMap(List<String> words) {
        Map<String, String> wordMap = new HashMap<>();
        for (String word : words) {
            String key = getWordKey(word);
            wordMap.put(key, word);
        }
        return wordMap;
    }

    private static String decodeWord(String codedWord, Map<String, String> wordMap) {
        String key = getWordKey(codedWord);
        return wordMap.getOrDefault(key, codedWord);
    }

    private static String getWordKey(String word) {
        if (word.length() <= 2) {
            return word; // Words with one or two letters remain unchanged
        }

        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        char[] middle = word.substring(1, word.length() - 1).toCharArray();
        Arrays.sort(middle);

        return first + new String(middle) + last;
    }
}
