package Striver_Arrays;

import java.util.*;

public class Pascal {
    public static void main(String[] args) {
        System.out.println("Find NCR of Given Number ");
        int a=5;
        int b=3;
        NCR(a,b);

        System.out.println("Find Pascal Triangle value between the Number  ");
        int x=4;
        int y=3;
        NCR(x-1,y-1);

        int n=5;
        System.out.println("Print the row ");
        printrow(n);

        System.out.println("Generate Pascal ");
        List<List<Integer>> ans=generate(n);

        for(List<Integer>j:ans) {
            for (int c : j) {
                System.out.print(c + " ");
            }
            System.out.println();
        }


    }

    public static void NCR(int a, int b)
    {
        int ans=1;

        for(int i=0;i<b;i++)
        {
            ans=ans*(a-i);
            ans=ans/(i+1);
        }
        System.out.println(ans);
    }

    public static void printrow(int n)
    {
        int ans=1;
        System.out.println(ans);
        for (int i=1;i<n;i++)
        {
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }
    }





    public static List<Integer> generateHelper(int n)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        int x=1;
        ans.add(1);
        for(int i=1;i<n;i++)
        {
            x=x*(n-i);
            x=x/i;
            ans.add(x);
        }

        return ans;
    }

    public static List<List<Integer>> generate(int n)
    {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            ans.add(generateHelper(i));
        }
        return ans;
    }
}
