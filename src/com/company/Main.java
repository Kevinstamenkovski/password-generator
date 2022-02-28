package com.company;

import  java.util.*;

import java.lang.Math;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //             {0  1  2  3  4  5  6  7  8  9}//
        char[] letter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        //              { 0    1    2    3    4    5    6    7    8    9   10   11   12   13   14   15   16    17   18   19  20   21   22    23   24   25}//
        char[] symbols = {'!', '?', '@', '#', '$'};
        //!,?,@,#,$      { 0    1    2    3    4 }//

        //Number output     (number[(int)(Math.random() * 9 - 0 + 1) + 0])
        //Letter Output     (letter[(int)(Math.random() * 25 - 0 + 1) + 0])
        //Symbol Output    (symbols[(int)(Math.random() * 4 - 0 + 1) + 0])

        //System.err.println(number-symbol-letter-number-letter-symbol-letter-number);
        System.err.println(
                (number[(int)(Math.random() * 9 - 0 + 1) + 0]) + "" +
                (symbols[(int)(Math.random() * 4 - 0 + 1) + 0]) + "" +
                (letter[(int)(Math.random() * 25 - 0 + 1) + 0]) + "" +
                (number[(int)(Math.random() * 9 - 0 + 1) + 0]) + "" +
                (letter[(int)(Math.random() * 25 - 0 + 1) + 0]) + "" +
                (symbols[(int)(Math.random() * 4 - 0 + 1) + 0]) + "" +
                (letter[(int)(Math.random() * 25 - 0 + 1) + 0]) + "" +
                (number[(int)(Math.random() * 9 - 0 + 1) + 0])
        );



    }
}
