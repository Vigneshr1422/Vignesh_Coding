package Zoho.Array_2D;

public class zig_zag {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        printzig(arr);
    }
    public static void printzig(int [][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;

        for(int i=0;i<n+m-1;i++)
        {
            int row,col;
            if(i%2==0)
            {
                row=(i<n) ? i: n-1;
                col=i-row;

                while(row>=0 && col<m)
                {
                    System.out.print(arr[row][col]+" ");
                    row--;
                    col++;
                }
            }else
            {
                col=(i<m) ? i: m-1;
                row=i-col;

                while(col>=0 && row<m)
                {
                    System.out.print(arr[row][col]+" ");
                    row++;
                    col--;
                }
            }

        }
    }
}
