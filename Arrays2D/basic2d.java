package Arrays2D;

import java.util.Scanner;

public class basic2d {
    //for searching an element
    public static boolean search(int matrix[][],int key){
        for(int i = 0 ; i<matrix.length ;i++){
            for(int j = 0; j<matrix[0].length ;j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at ("+i+","+j+")" );
                    return true;
                }
            }
        }
        System.out.println("Not Found");
        return false;
    }
    //for largest element in 2D array
    public static void largest(int matrix[][]){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<matrix.length ;i++){
            for(int j = 0; j<matrix[0].length ;j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Largest element is: "+max);
    }

    public static void main(String[] args) {
        
        int matrix [][]= new int[3][3];
        int n = matrix.length; //rows
        int m = matrix[0].length; //column
        //taking input
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<n ;i++){
            for(int j = 0; j<m;j++){
                matrix [i][j] = sc.nextInt();
            }
        }
        sc.close();
        //for printing
        for(int i = 0 ; i<n ;i++){
            for(int j = 0; j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        search(matrix, 5);
        largest(matrix);
    }
}
