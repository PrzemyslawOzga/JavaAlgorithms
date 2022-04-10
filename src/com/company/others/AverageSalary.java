package com.company.others;

/*
Problem: Average Salary Excluding the Minimum and Maximum Salary
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual
answer will be accepted.
*/

import java.util.Arrays;

public class AverageSalary {

    public static double average(int[] salary) {
        Arrays.sort(salary);
        int length = salary.length - 2;
        double sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum = sum + salary[i];
        }

        return sum / length;
    }

    public static void main(String[] args) {
        int[] salary1 = {4000,3000,1000,2000};
        int[] salary2 = {1000,2000,3000};

        System.out.println(average(salary1));
        System.out.println(average(salary2));
    }
}
