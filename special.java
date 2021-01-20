package com.company;
public class special {
    public static void main(String[] args){

    System.out.println(specialchar("wow"));
        System.out.println(palindrome("hello"));
    }
    public static boolean specialchar(String str){
        int len = str.length()-1;
        if(str.charAt(0)==str.charAt(len))
            return true;
        else
            return(false);
    }
    public static boolean palindrome(String str){String ne="";
       for(int i=str.length()-1;i>=0;--i){
           ne = ne+str.charAt(i);
       }
       if(str.equals(ne)) return true;else return false;
    }
}
