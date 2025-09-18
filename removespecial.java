import java.util.Arrays;
import java.util.Stack;

public class removespecial {
    public static String reveString(String str){
       String rs =new StringBuilder(str).reverse().toString().trim();
       return rs;
    }
    public static void nextgreatr (int arr[]){
      int n = arr.length;
      Stack<Integer> s =new Stack<>();
      int res []= new int [n];
      for (int i = n-1;i>=0;i--){
        while (!s.isEmpty() && s.peek()<=arr[i]){
          s.pop();
        }
        if(s.isEmpty()){
          res[i]=-1;

         }
         else{
          res[i]= s.peek();
         }
         s.push(arr[i]);   
      }
      System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args) {
      // String str = " Hello!&^012$ ";
      // String clean = str .replaceAll("[^A-Za-z0-1]" ,"");
      // String lll = str.replace("ll", "ww");
      //   System.out.println(lll);
      //   // String reverse = reveString(str);
      //   System.out.println(reveString(str));
      
        int[] arr = {3,6,12,4,76,34};
        nextgreatr(arr);
               

    //     int n = arr.length;
    //     Stack<Integer> st = new Stack<>();
    //     int[] ans = new int[arr.length];
    //     ans[ans.length-1] = -1;

    //     st.push(-1);
    //     for(int i=n-2; i>=0; i--) {
    //       int temp = arr[i];

    //       while(st.peek() != -1 && st.peek() <= temp){
    //         st.pop();
    //       }
    //       ans[i]=st.peek();
    //       st.push(arr[i]);
    //     }
    //     for (int i = 0; i<ans.length; i++) {
    //       System.out.println(ans[i]);
    //     }
    }

}
