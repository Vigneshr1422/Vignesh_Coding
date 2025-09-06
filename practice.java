import java.lang.reflect.Array;
import java.util.*;

public class practice {
    public static void main(String[] args) {
        String str="(a+b)";
        System.out.println(fun(str));
    }

    public static boolean fun(String str)
    {
        char []arr=str.toCharArray();
        Stack<Character>a=new Stack<>();

        for(int i=0;i<arr.length;i++)
        {
            char x=arr[i];
            if(x=='(')
                a.add(x);
            else if(x==')')
            {
                if(a.isEmpty() ||  a.peek()!='('){
                    return false;
                }
            }

            if(i>0)
            {
                    char pre=arr[i];
            }
        }
        return true;
    }
    }

//        int []arr={4,5,6,7,1,2,3};
//        // binary searc h - find minimum in rotaed sorted
//        //
//        int a=25; // r
//        int choclate=3;
//
//        // 3 paper 1 paper
//
//        int x=a/3; // 8  wrapper  /3 ->2 c + 2 c
//        int y=a%3; // 1
        ////







//    }
//}
//        String a="anbu";
//        String b="bu";
//        HashSet<Character>x=new HashSet<>();
//        for(char y:b.toCharArray())
//        {
//            x.add(y);
//        }
//        StringBuilder ans=new StringBuilder();
//        for(char d:a.toCharArray())
//        {
//            if(!x.contains(d))
//            {
//                ans.append(d);
//            }
//        }
//        System.out.println(ans);
//}

//       int arr[]={5,4,8,9,6,3,2};
//       int arr2[]={4,5,2,11};
//       ArrayList<Integer>a=new ArrayList<>();
//       for(int j:arr)
//       {
//            a.add(j);
//       }
//       ArrayList<Integer>w=new ArrayList<>();
//       for(int l:arr2)
//       {
//           if(a.contains(l))
//           {
//               w.add(l);
//           }
//       }
//       System.out.println(w);
//
//   }
//            Scanner in=new Scanner(System.in);
//
//            int n=15;
//            int []arr=new int[n];
//            int max=Integer.MIN_VALUE;
//            int min=Integer.MAX_VALUE;
//            for(int i=0;i<n;i++)
//            {
//                arr[i]=in.nextInt();
//                if(arr[i]<min)
//                {
//                    min=arr[i];
//                }
//                if(arr[i]>max)
//                {
//                    max=arr[i];
//                }
//            }
//        System.out.println("maximum is "+max+" minimum is "+min);
//    }
//    }
//        int n=5;
//        int sum=1;
//        for(int i=1;i<=n;i++)
//        {
//            sum*=i;
//        }
//        System.out.println(sum);
//
//    }

//        int n=1562564785;
//
//        int ans=sum(n);
//
//        while(ans>=10)
//        {
//            ans=sum(ans);
//
//        }
//
//        System.out.println(ans);
//    }
//
//    public static int sum(int n)
//    {
//        int summ=0;
//        while(n!=0)
//        {
//            int rem=n%10;
//            summ+=rem;
//            n/=10;
//        }
//        return summ;
//    }

