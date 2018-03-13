package com.coskunyalcinkaya.datastructure.stack;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StackProblems {
    /**
     * Checks if parenthesis matching.
     */

    private static final String testString = "{ass {dgfg [] () [sff ()] } } ()";

    private static final Map<Character, Character> 	parenthesisMap = new HashMap<>();

    static {
        parenthesisMap.put('}', '{');
        parenthesisMap.put(']', '[');
        parenthesisMap.put(')', '(');
    }


    public boolean isParenthesisMatching(){

        Collection<Character> openingParenthesis = parenthesisMap.values();

        StackImp<Character> stackImp = new StackImp<>();

        for(Character c : testString.toCharArray()){

            //if next char is an opening parenthesis, push to stack.
            if (openingParenthesis.contains(c)){
                stackImp.push(c);
            }
            //if next char is a closing parenthesis, pop stack and check that if the parenthesis matching with opening parenthesis correctly.
            if (parenthesisMap.containsKey(c) && stackImp.pop() != parenthesisMap.get(c)){
                return false;
            }
        }

        return stackImp.size == 0;
    }

}
