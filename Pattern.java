import java.util.*;

public class Pattern{
    public static void hollowBox(int m ,int n){
        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                if (i==n-1|| i==0 || j==m-1||j==0){
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
    }
    public static void right(int n,int m){
        for (int i=0;i<n;i++){
            for (int j= 0;j<=i;j++){
                System.out.print("*");

            }
            System.out.println( );
        }

    }
    public static void invertedrightpyramid(int n,int m){
        for (int i=n;i>0;i--){
            for (int j= 0;j<i;j++){
                System.out.print("*");

            }
            System.out.println( );
        }

    }
    public static void leftpyramid(int n){
        for (int i=0;i<n;i++){
           for (int j = 1;j<n-i;j++){
            System.out.print(" ");
           }
           for (int j=0;j<=i;j++){
            System.out.print("*");
           }
           System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int n = sc.nextInt();
        int m = sc.nextInt();
    
        sc.close();
        // hollowBox(m, n);
        // rightpiramid(n, m);
        // invertedrightpiramid(n, m);
        leftpyramid(n);
        
    }
    
}
