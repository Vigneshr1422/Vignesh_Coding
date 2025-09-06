package Zoho;
//28
import java.util.*;
public class alternative_sort {
    public static void main(String[] args) {
     int arr[]={1,2,3,4,5,6,7,8};

     int s=0;
     int e=arr.length-1;
     int idx=0;
     int []res=new int[arr.length];
    while(s<=e)
    {
        if(idx<arr.length)
        {
            res[idx++]=arr[e--];
        }
        if(idx<arr.length)
        {
            res[idx++]=arr[s++];
        }
    }
        System.out.println(Arrays.toString(res));
    }
}
