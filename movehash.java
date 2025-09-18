


import java.util.Scanner;

public class movehash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int count = 0;
         for (int i = 0;i<n;i++){
            if (s.charAt(i)== '#'){
                count ++;
            }
         }
         StringBuilder ans = new StringBuilder();
         for (int i = 0;i<count ;i++){
            ans.append('#');
         }
         for (int i= 0;i<n ;i++){
            if (s.charAt(i)!= '#'){
                ans.append(s.charAt(i));
            }
           
         }
         System.out.println(ans.toString());
    
    }
}
