package org.example.jichu;

import java.util.Arrays;

public class Text867 {
    public static void main(String[] args) {
        int[][] a=new int[2][3];
        a=transpose(new int[][]{{1,2,3},{4,5,6}});
        for (int i=0;i<3;i++){
            System.out.println(Arrays.toString(a[i]));
        }

    }
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [][] a=new int[n][m];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                a[j][i]=matrix[i][j];
            }
        }

    return a;
    }

//    public static int[]  transpose(int[][] matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        int [] a=new int[2];
//        a[0] = m;
//        a[1] = n;
//        return a;
//
//    }
}

