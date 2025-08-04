public class maxSumprefix {
     
    public static void Subarr(int arr[]){
        int prefix[] = new int [arr.length];
        prefix[0]=arr[0];
        for (int i =1; i<prefix.length ; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int ms = Integer.MIN_VALUE;
        for (int j=0;j<arr.length;j++){  //start
            for (int k =j;k<arr.length;k++){
                int cs = (j==0)?prefix[k] : prefix[k]-prefix[j-1] ;
                System.out.println("Subarray sum from " + j + " to " + k + " = " + cs);
                if (cs>ms){
                    ms =cs;
                }
                System.out.println(cs);
            }
        }
        System.out.println( "MAX SUB ARRAY SUM"+"="+ ms);
    }

    public static void main(String[] args) {
         int arr[]={1,-1,6,-2,3};
        Subarr(arr);
        
    }
    
}
