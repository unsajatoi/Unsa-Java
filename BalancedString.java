//3f. Write a program to check if a given string of parenthesis has balanced parenthesis or not.For example a string as "(())" is a valid string where as strings like ")(" or "(()))" are not valid strings.
package com.whitebox.edu;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
//Not working
public class BalancedString {
	public static boolean isBalanced(final String str1, final LinkedList<Character> openedBrackets, final Map<Character, Character> closeToOpen) {
	    if ((str1 == null) || str1.isEmpty()) {
	        return openedBrackets.isEmpty();
	    } else if (closeToOpen.containsValue(str1.charAt(0))) {
	        openedBrackets.add(str1.charAt(0));
	        return isBalanced(str1.substring(1), openedBrackets, closeToOpen);
	    } else if (closeToOpen.containsKey(str1.charAt(0))) {
	        if (openedBrackets.getLast() == closeToOpen.get(str1.charAt(0))) {
	            openedBrackets.removeLast();
	            return isBalanced(str1.substring(1), openedBrackets, closeToOpen);
	        } else {
	            return false;
	        }
	    } else {
	        return isBalanced(str1.substring(1), openedBrackets, closeToOpen);
	    }
	}
	public static void main(final String[] args) {
	    final Map<Character, Character> closeToOpen = new HashMap<Character, Character>();
	    closeToOpen.put('}', '{');
	    closeToOpen.put(']', '[');
	    closeToOpen.put(')', '(');
	    closeToOpen.put('>', '<');

	    final String[] testSet = new String[] { "(abcdefksdhgs)", "[{aaa<bb>dd}<232>", "[ff{<gg}]<ttt>", "{<}>" };
	    for (final String test : testSet) {
	        System.out.println(test + "  ->  " + isBalanced(test, new LinkedList<Character>(), closeToOpen));
	    }
	}
}

