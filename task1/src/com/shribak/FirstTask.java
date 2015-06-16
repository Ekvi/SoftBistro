package com.shribak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;


public class FirstTask {
    public static void main(String[] args) throws IOException {
        String value = getStringFromUser();

        printValue(findCharacter(value));
    }

    private static String getStringFromUser() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter the input string: " );

        return reader.readLine();
    }

    private static Character findCharacter(String value) {
        Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();

        char character;
        for(int i = 0; i < value.length(); i++) {
            character = value.charAt(i);

            if(countCharacters.containsKey(character)) {
                countCharacters.put(character, countCharacters.get(character) + 1);
            } else {
                countCharacters.put(character, 1);
            }
        }

        for(Map.Entry<Character, Integer> map : countCharacters.entrySet()) {
            if(map.getValue() == 1) {
                return map.getKey();
            }
        }

        return null;
    }

    private static void printValue(Character character) {
        if(character != null) {
            System.out.println(character);
        } else {
            System.out.println("There is no any non repeated character.");
        }
    }
}
