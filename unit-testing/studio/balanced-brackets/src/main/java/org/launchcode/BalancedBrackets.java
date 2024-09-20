package org.launchcode;

import java.util.ArrayList;

public class BalancedBrackets {
    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        boolean isTrue = false;

        ArrayList<Character> bracketArray = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
                bracketArray.add(ch);
            } else if (ch == ']') {
                brackets--;
                bracketArray.add(ch);
            }
        }
        Object[] bracketObjectArray = bracketArray.toArray();
        if(brackets == 0 && bracketObjectArray.indexOf("[") == 0){
            isTrue = true;
        }
        return isTrue;
    }

//    public static boolean hasOrderedBrackets(String str){
//        ArrayList<Character> bracketArray = new ArrayList<>();
//        for (char ch : str.toCharArray()) {
//            if (ch == '[') {
//                bracketArray.add(ch);
//            } else if (ch == ']') {
//                bracketArray.add(ch);
//            }
//        }
//        return (bracketArray.indexOf("[") == 0);
//    }
}