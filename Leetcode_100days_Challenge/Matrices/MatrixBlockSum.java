package first_ideaprogram.src.Leetcode_100days_Challenge.Matrices;
import java.util.*;
public class MatrixBlockSum {
    public static void main(String[] args) {
        int [] [] mat ={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++)
              System.out.print(mat[i][j] + " " );
            System.out.println();
        }

        System.out.println("k block sum of matrix");
        int ans [][] =matrixBlockSum(mat,1);
        for(int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++)
                System.out.print(ans[i][j] + " " );
            System.out.println();
        }

    }
    static int[][] matrixBlockSum(int[][] mat, int k) {

        int answer [][] = new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j =0;j<mat[0].length;j++){
                int row_start =i-k;
                int row_end =i+k;
                int column_start =j-k;
                int column_end =j+k;

                if(row_start<0){
                    row_start=0;
                }
                if(row_end>0){
                    row_end=mat.length-1;
                }
                if(column_start<=0){
                        column_start=0;
                }
                if(column_end>mat.length){
                    column_end=mat.length-1;
                }
                answer [i] [j] = blockSum(mat,row_start,row_end,column_start,column_end);
            }
        }
        return answer;
    }

    static int blockSum(int [][] mat , int row_start,int row_end,int column_start,int column_end){
        int res=0;
        for(int i=row_start;i<row_end;i++){
            for(int j=column_start;j<column_end;j++){
                res+=mat[i][j];
            }
        }
        return res;
    }
}