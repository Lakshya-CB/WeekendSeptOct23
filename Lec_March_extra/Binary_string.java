package Lec_March_extra;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t>0){
        String str = scn.next();
        solve(str,"");
        t--;
        System.out.println();
        }

    }
    public static void solve(String str,String path){
        if(str.length()==0){
            System.out.print(path+" ");
            return;
        }
        if(str.charAt(0)!='?'){
            solve(str.substring(1),path+str.charAt(0));
        }else{
            solve(str.substring(1),path+0);
            solve(str.substring(1),path+1);
        }
    }

}
public class Binary_string {

}
