package unit4_loops;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        int catCount = 0,
                dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {

            if (str.substring(i, i + 3).equals("cat"))
                catCount++;
            if (str.substring(i, i + 3).equals("dog"))
                dogCount++;

        }


    System.out.println(catCount==dogCount);



}


}

// find the "cat"s and "dog"s in a given string and if the counts are equal print true else print false.