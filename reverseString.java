import java.util.*;
public class reverseString {

    
    //................................ REVERSE STRING.............................................
        public static void reversestring(String str){
            String reverse = "";
            for(int i = str.length()-1;i>=0;i--){
                reverse += str.charAt(i);
            }
            System.out.println(reverse);
        }



    //...................................PALINDROME STRING..................................
        public static void palindrome(String str){
            String rev = new StringBuilder(str).reverse().toString();
            if(rev.equals(str)){
                System.out.println("palindrome");
            }
            else{
                System.out.println("not a palindrome");
            }

        }


    //..........................FIBONACCI...................................
    public static void FIBONACCI(int n){
        int a =0;
        int b= 1;
        for (int i = 0;i<n;i++){
            System.out.print(a +" ");
            int sum = a+b;
            a=b;
            b=sum;
        }
    }



//..............................REVERSEE  IINT .................
    public static void revint (int n){
        int digit ;
       int rev = 0;

        while(n>0){
            digit = n%10;
            rev =  rev*10+digit;
            n=n/10;
        }
        System.out.println(rev);
    }




//.........................TOGGLE STRING .....................
public static String toggle (String str){
   StringBuilder sb = new StringBuilder();
   char ch[] = str.toCharArray();
   for (int i= 0;i<ch.length;i++){
    if (Character.isLowerCase(ch[i])){
        sb.append(Character.toUpperCase(ch[i]));
    }
    else{
        sb.append(Character.toLowerCase(ch[i]));
    }
   }
   return sb.toString();
}



//......................ANAGRSM......>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>..
    public static void Anagram(String s1,String s2){
        char ch1[]= s1.toCharArray();
        char ch2[]= s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals( ch1,ch2)){
            System.out.println("Strings are Anagram");
        }
        else{
            System.out.println("Strings are  not Anagram");
        }
    }
    
//........COUNT THE OCCURENCE OF DIGIT IN THE NUMBER (EX--- IN 12344    4 OCCURE -2 TIME )
            public static int count (int n ,int d){
                int count =0; 
                while (n>0){
                    if (n%10 == d){
                        count++;
                    }
                    n =n/10;
                }
                return count ;
            }




    ///......reverse an array using the recurrsion .........
    public static void reversearray(int arr[],int start,int end){
        //base case
        if (start>= end){
            return;
        }
        //operation
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end]= temp;

        // recursive call
         reversearray(arr, start+1, end-1);

    }



    ///..................first amd last occurence of an element ............
     public static void firstlast (int arr[] ,int key){
        int first =-1;
        int last = -1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]== key){
                if (first ==-1){
                    first = i;
                }
                last =i;
            }
        }
        if (first ==-1){
            System.out.println("-1");
        }
        else{
            System.out.println(first + " "+last);
        }
     }


      //...............last occurence using the recursio......
      public static int  lastoccurence(int arr[],int key ,int i){
        if (i<0){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
          return lastoccurence(arr, key, i-1);
      }
    

        
        public static void main(String[] args) {
            String str = "madam";
            palindrome(str);
               int n = 123445;
           revint(n);
           String s1= "listen";
           String s2 = "silent";
           Anagram(s1,s2);
           System.out.println(count(12333243, 3));
          
           System.out.println(toggle("STrinG"));
           int arr [] ={1,2,3,2,3,4,1} ;
        //    reversearray(arr, 0, arr.length - 1);
        //    System.out.println(Arrays.toString(arr)); 
        //    firstlast(arr, 1);
          
          System.out.println(lastoccurence(arr, 1, arr.length-1));
        }
    
    

    
}
