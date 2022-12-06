package unit4_loops;

import java.util.Scanner;

public class CountHi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
String newStr="";


        int count = 0;

        for (int i = 0; i < str.length()-1; i++) {

            newStr = str.substring(i, i+2);

            if( newStr.equals("hi")){

                count++;
            }


        }

        System.out.println(count);


    }


}


/*

Use a loop to count how many times the characters hi are found in the given String str. Only consider the lowercase characters for hi.
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

Ex:
  Input:
    abc hi how

  Output:
    1
Ex:
  Input:
    hihi bye

  Output:
    2
Ex:
  Input:
    apple

  Output:
    0

 */