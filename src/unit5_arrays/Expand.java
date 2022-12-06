package unit5_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Expand {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i =0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }

        //WRITE YOUR CODE BELOW

        //
        // equals(array1, array2): checks if two arrays are equal (each index element should match), returns boolean
        //
        //		copyOf(array, newLength): copys the elements of the array, starting from FIRST element to given number, returns new array
        //
        //		copyOfRange(array, beginningIndex, endingIndex): copys the elements of the array, starting from beginning index till the ending index (ending index excluded), returns new array



//int [] numbers = new int [2*nums.length];
//        for (int i = 0; i < nums.length ; i++) {    // ilk array in uzunluğunu verilmesi gerekiyor. Esas COPYOF() kullanılması gerekir.
//            numbers[i]=nums[i];
//        }


        int[] numbers = Arrays.copyOf(nums, 2*nums.length); // ilk array in uzunluğunu verilmesi gerekiyor.  COPYOF() kullanılması gerekir.


        System.out.println(Arrays.toString(numbers));




    }


}


/*

Given an int [] nums create a new array that is an expanding version of nums. The new array will hold double the elements, and the original elements from nums should be stored at the beginning of the new array. You can assume the size of nums will be 3.
Note: The loop used in the given code is to dynamically create the int array. You don't need to fully understand this part yet, focus only on having access to an array and has some numbers.
Main topics: arrays, primitive datatypes, concatenation, index, operators

Example:

Input:
  [4, 5, 6]

Output:
  [4, 5, 6, 0, 0, 0]
Example:

Input:
  [3, 100, 140]

Output:
  [3, 100, 140, 0, 0, 0]

 */