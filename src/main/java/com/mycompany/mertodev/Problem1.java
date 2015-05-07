package com.mycompany.mertodev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {
    List<Integer> asd=new ArrayList<>();
     static List<Integer> numberList = new ArrayList<>();
    
    public int solution(int N) {
        
        if (N >= 0) {
            
            while (N != 0) {
                
                Problem1.numberList.add( N % 10);
                System.out.println(N % 10);
                N = N / 10;
            }
        } else {
            System.out.println("the number must be positive.");
        }
        return 0;
    }
    public static void main(String[] args) {
    Problem1 P=new Problem1();
    P.solution(519);
    
    }
    }
        
        

