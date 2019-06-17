import java.util.*;
public class Basics {

    public void printRange(int a, int b){
        int i = 0;
        for( i= a; i<= b; i++){
            System.out.println(i);
        }
    }

    public void oddNum(int a, int b){
        int i = 0;
        for ( i= a; i<= b; i++){
            if( i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public void printNSum(int a, int b){
        int i = 0;
        int c= 0;
        for( i= a; i<= b; i++){
            c = i+c; 
            System.out.println("New number: " +i+ " Sum: " +c);
        }
    }

    public void array(int[] arr){
        int i = 0;
        for( i= 0; i< arr.length; i++){
            int c = arr[i];
            System.out.println(c);
        }
    }

    public int max(int[] arr){
        int i = 0;
        int c = arr[0];
        for( i= 0; i< arr.length; i++){
            if (arr[i] > c) {
                c = arr[i];
            }
        }
        return c;
    }
    
    public int avg(int[] arr){
        int i = 0;
        int c = 0;
        for( i= 0; i< arr.length; i++){
            c = arr[i] + c;
        }
        c = c / arr.length;
        return c;
    }

    public int[] oddArray(int arr) {
        int i = 0;
        int[] c = new int[150];
        int b = 0;
        for( i= 1; i<= 255; i+=2){
            c[b] = i;
            b++; 
        }

        return c;
    }

    public int greaterThanY(int[] arr, int y){
        int i = 0;
        int a = 0;
        for ( i = 0; i < arr.length; i++) {
            if (arr[i] > y) {
                a++;
            }
        }
        return a;
    }

    public int[] sqArray(int[] arr) {
        int i = 0;
        for ( i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }
        return arr;
    }

    public int[] elimNegArray(int[] arr){
        int i = 0;
        for ( i = 0; i < arr.length; i++) {
            if (arr[i] < 0 ) {
                arr[i] = 0;
            }
        }
        return arr;
    }


    public int[] minMaxAvg(int[] arr){
        int i = 0;
        int min = arr[0];
        int max = arr[0];
        int avg = 0; 
        for ( i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            avg += arr[i];
        }
        avg/= arr.length;
        return new int[]{max, min, avg};
        
    }

    public int[] shifting(int[] arr){
        int i = 0;
        for ( i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = 0;
        return arr;  
    }
}