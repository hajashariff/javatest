package com.kgisl.qs1;
import static java.util.Arrays.deepToString;
class SimpleArray {
    public static void main(String[] args) {
        String[][] deepArrayString = new String[][] { { "John", "Mary" }, { "Alice", "Bob" } };
        System.out.println(deepToString(deepArrayString));
 }
}