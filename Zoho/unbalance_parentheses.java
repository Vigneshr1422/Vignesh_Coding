package Zoho;

import java.util.HashSet;
import java.util.Stack;

public class unbalance_parentheses {
    public static void main(String[] args) {
    String str="((abc)";

    optimalway(str);

    Stack<Integer>stack=new Stack<>();
    HashSet<Integer>set=new HashSet<>();
    StringBuilder ans=new StringBuilder();

    for(int i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
        if(ch=='(')
        {
            stack.add(i);
        }else if(ch==')')
        {
            if(!stack.isEmpty())
            {
                stack.pop();
            }else
            {
                set.add(i);
            }
        }
    }

    while(!stack.isEmpty())
    {
        set.add(stack.pop());
    }

    for(int i=0;i<str.length();i++)
    {
        if(!set.contains(i))
        {
            ans.append(str.charAt(i));
        }
    }
        System.out.println(ans.toString());
    }

    public static void optimalway(String str)
    {
        int open=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char x=str.charAt(i);
            if(x=='(')
            {
                open++;
                sb.append(x);
            }else if(x==')'){
                if(open>0 ){
                    sb.append(x);
                    open--;
                }
            }else {
                sb.append(x);
            }
        }

        StringBuilder res=new StringBuilder();
        int openn=open;
        for(int i=0;i<sb.length();i++)
        {
            char x=sb.charAt(i);
            if(x=='(' && openn>0){
                openn--;
            }else
            {
                res.append(x);
            }
        }

        System.out.println(res.toString());
    }
}