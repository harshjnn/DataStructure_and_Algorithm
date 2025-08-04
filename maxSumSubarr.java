public class maxSumSubarr {
    public static void Subarr(int arr[]){
        int ms  = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i<arr.length;i++){
            for (int j = i;j<arr.length;j++){
                cs =0;
                for(int k =i;k<=j;k++){
                    cs = cs+arr[k];
                }
                System.out.println("sum from" +"[" +i+ "]"+ "to" +"[" +j+ "]" + "=" + cs);
                if (cs>ms){
                    ms =cs;
                }
                
            }
        }
        System.out.println("MaxSum" +"="+ ms);

    }
    public static void main(String[] args) {
        int arr[]={1,-1,6,-2,3};
        Subarr(arr);
        
        
    }
    
}
