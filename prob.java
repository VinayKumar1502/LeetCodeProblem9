//FOR OTHER COMPILERS
import java.util.*;
public class prob{//use program as file to avoid classnotfound error
    public static boolean isPalindrome(int x) {
    int origial=x;
    int rev=0;
    while(x>0){
        int digit=x%10;
        rev=rev*10+digit;
        x/=10;
    }
    if(origial==rev){
        return true;
    }else{
        return false;
    }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Nnumber");
        int x=sc.nextInt();
        boolean palindrome=isPalindrome(x);
        System.out.println(palindrome);
    }
}





//LEETCODE PROBLEM 9 PALENDROM 
//DIRECT ACCESS OF CODE

class Solution {
    public boolean isPalindrome(int x) {
    int origial=x;
    int rev=0;
    while(x>0){
        int digit=x%10;
        rev=rev*10+digit;
        x/=10;
    }
    if(origial==rev){
        return true;
    }else{
        return false;
    }
    }
}