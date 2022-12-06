package unit4_loops;

import java.util.Scanner;

public class JavaAndPython {
    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int javaCount = 0,
                pythonCount = 0;

        for (int i = 0; i < sentence.length() - 5; i++) {

            if (sentence.substring(i, i + 4).equals("java"))
                javaCount++;
            if (sentence.substring(i, i + 6).equals("python"))
                pythonCount++;

        }


        System.out.println(javaCount==pythonCount);



/*

### Use a `loop` to count how many times the characters `java` and `python` are found in the given String `sentence`. Output `true` if `java` and `python` appear the same number of times, otherwise output `false`.

#### Note: Case sensitivity should be considered. We are looking for the lowercase character versions of both Strings

Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

```
Ex:
  Input:
    We study java not python

  Output:
    true
```
```
Ex:
  Input:
    What's the difference between java, javascript and python?

  Output:
    false

  -> the 'java' characters appear 2 times in the String but the 'python' characters appear only 1 time.
```
```
Ex:
  Input:
   Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented,[15] and specifically designed to have as few implementation dependencies as possible.

  Output:
    true

  -> The first word 'Java' is not counted because it starts with the uppercase 'J', so the number of times 'java' and 'python' appear in this String is 0 and 0 and since they are the same, the output is true
```


 */




    }



}
