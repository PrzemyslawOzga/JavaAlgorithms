package com.company.others;

/*
Problem: Baseball Game
You are keeping score for a baseball game with strange rules. The game consists of several rounds, where the scores
of past rounds may affect future rounds' scores. At the beginning of the game, you start with an empty record. You are given a
list of strings ops, where ops[i] is the ith operation you must apply to the record and is one of the following:

An integer x - Record a new score of x.
    - "+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be
    two previous scores.
    - "D" - Record a new score that is double the previous score. It is guaranteed there will always be a
    previous score.
    - "C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a
     previous score.

Return the sum of all the scores on the record.
*/

import java.util.Stack;

public class BaseballGame {
    public static int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newtop = stack.peek() + top;
                stack.push(top);
                stack.push(newtop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        int record = 0;
        for (int score : stack) {
            record += score;
        }

        return record;
    }

    public static void main(String[] args) {
        String[] ops1 = {"5","2","C","D","+"};
        String[] ops2 = {"5","-2","4","C","D","9","+","+"};
        String[] ops3 = {"1"};

        System.out.println(calPoints(ops1));
        System.out.println(calPoints(ops2));
        System.out.println(calPoints(ops3));
    }
}
