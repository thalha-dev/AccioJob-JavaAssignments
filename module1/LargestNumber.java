import java.util.*;
import java.lang.*;
import java.io.*;

public class LargestNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        String largestNumInString = "";
        for(int i = 0 ; i < arr.length ; i++){
            
        }
    }
}

// Given an array of numbers, program to
// arrange the numbers to form the
// largest number
// import java.util.*;

// class GFG {

//     // The main function that prints the
//     // arrangement with the largest value.
//     // The function accepts a vector of strings
//     static void printLargest(Vector<String> arr)
//     {

//         Collections.sort(arr, new Comparator<String>()
//         {
//             // A comparison function which is used by
//             // sort() in printLargest()
//             @Override public int compare(String X, String Y)
//             {

//                 // first append Y at the end of X
//                 String XY = X + Y;

//                 // then append X at the end of Y
//                 String YX = Y + X;

//                 // Now see which of the two
//                 // formed numbers
//                 // is greater
//                 return XY.compareTo(YX) > 0 ? -1 : 1;
//             }
//         });

//         Iterator it = arr.iterator();

//         while (it.hasNext())
//             System.out.print(it.next());
//     }

//     // Driver code
//     public static void main(String[] args)
//     {

//         Vector<String> arr;
//         arr = new Vector<>();

//         // output should be 6054854654
//         arr.add("54");
//         arr.add("546");
//         arr.add("548");
//         arr.add("60");
//         printLargest(arr);
//     }
// }
