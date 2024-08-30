// 3) Write a java program to accept 5 numbers using command line arguments sort and
// display them.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Sort
{
public static void main(String[] args) throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the 5 elements:");
    int [] arr=new int[5];
    for(int i=0;i<5;i++){   //Array Initialization
        arr[i]=Integer.parseInt(br.readLine());
    }
    int temp = 0; //Temporary variable to store the element
    for (int i = 0; i < 5; i++) {   //Holds each Array element
        for (int j = i+1; j < 5; j++) {     //compares with remaining Array elements
            if(arr[i] > arr[j]) {    //Compare and swap
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    System.out.println();      //Displaying elements of array after sorting
    System.out.println("Elements of array sorted in ascending order: ");
    for (int i = 0; i < 5; i++){
        System.out.print(arr[i] + " ");
    }
}
}
