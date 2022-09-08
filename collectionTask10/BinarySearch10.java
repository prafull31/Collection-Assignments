package com.yash.collectionTask10;

import java.util.ArrayList;

public class BinarySearch10 {

            int binarySearch(Integer arr[], int x)
            {
                int l = 0, r = arr.length - 1;
                while (l <= r) {
                    int m = l + (r - l) / 2;
         
                    // Check if x is present at mid
                    if (arr[m] == x)
                        return m;
         
                    // If x greater, ignore left half
                    if (arr[m] < x)
                        l = m + 1;
         
                    // If x is smaller, ignore right half
                    else
                        r = m - 1;
                }
         
                // if we reach here, then element was
                // not present
                return -1;
            }
         
            // Driver method to test above
            public static void main(String args[])
            {
                ArrayList<Integer> al=new ArrayList<>();
                al.add(4);
                al.add(40);
                al.add(32);
                al.add(36);
                al.add(30);
                al.add(16);
                
                Integer arr[]=al.toArray(new Integer[0]);
                
                BinarySearch10 ob = new BinarySearch10();
                
                int n = arr.length;
                int x = 4;
                int result = ob.binarySearch(arr, x);
                if (result == -1)
                    System.out.println("Element not present");
                else
                    System.out.println("Element found at "
                                       + "index " + result);
            }
}