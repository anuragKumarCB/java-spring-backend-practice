package io.github.anurag;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StrictPasswordGenerator {
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+";
    private static final String ALL = UPPER + LOWER + DIGITS + SPECIAL;
    private static final SecureRandom RANDOM = new SecureRandom();

    public static String generateStrictPassword(int length) {
        if (length < 4) throw new IllegalArgumentException("Length must be at least 4");

        List<Character> chars = new ArrayList<>();
        // 1. Guarantee at least one of each required type
        chars.add(UPPER.charAt(RANDOM.nextInt(UPPER.length())));
        chars.add(LOWER.charAt(RANDOM.nextInt(LOWER.length())));
        chars.add(DIGITS.charAt(RANDOM.nextInt(DIGITS.length())));
        chars.add(SPECIAL.charAt(RANDOM.nextInt(SPECIAL.length())));

        // 2. Fill the remaining length from all characters
        for (int i = 4; i < length; i++) {
            chars.add(ALL.charAt(RANDOM.nextInt(ALL.length())));
        }

        // 3. Shuffle so the guaranteed characters aren't always at the start
        Collections.shuffle(chars, RANDOM);

        return chars.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    void main() {
        System.out.println(generateStrictPassword(16));
    }
}

