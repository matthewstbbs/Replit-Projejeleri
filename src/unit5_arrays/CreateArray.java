package unit5_arrays;

public class CreateArray {

    public static void main(String[] args) {


        int[] arr = new int[3];

        arr[0] = 34;
        arr[1] = 59;
        arr[2] = 19;


        System.out.println("First element: " + arr[0]);
        System.out.println("Middle element: " + arr[1]);
        System.out.println("Last element: " + arr[2]);
    }

}


/*

### Create an `int []` that has the values of `34, 59, 19` and print each element on a new line with the following format:

```
First element: $first element
Middle element: $middle element
Last element: $last element
```

Main topics: arrays, primitive datatypes, concatenation, index

Example Flow:
```
First element: 34
Middle element: 59
Last element: 19
```

 */