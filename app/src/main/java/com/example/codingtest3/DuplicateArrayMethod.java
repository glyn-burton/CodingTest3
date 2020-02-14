package com.example.codingtest3;

public class DuplicateArrayMethod {


    private void FindDuplicates(int[] duplicatesArray){
//Write a program to remove duplicates from an array in Java without using the Java Collection API

        for (int i = 0; i < duplicatesArray.length; i++)
        {
            for (int j = i+1; j < duplicatesArray.length; j++)
            {
                if(duplicatesArray == duplicatesArray)
                {
                    System.out.println("Duplicate Element : "+ duplicatesArray);
                }
            }
        }
    }
}
