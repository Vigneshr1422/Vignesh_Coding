package Arrays_2D;

public class Rotate_image {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n=arr.length;
        int m=arr[0].length;
        System.out.println("Arrays Print");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpose ");
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<m;j++)
            {
                int t=0;
                t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }

        }

        for(int []arrs : arr)
        {
            for(int k:arrs)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }

        System.out.println("Rotate Arrays ");


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m/2;j++)
            {
                int t=0;
                t=arr[i][j];
                arr[i][j]=arr[i][m-1-j];
                arr[i][m-1-j]=t;
            }
        }
        for(int []arrs : arr)
        {
            for(int k:arrs)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }

        System.out.println("finish ");


    }
}
