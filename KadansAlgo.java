public class KadansAlgo {
    public static void Subarr(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0 ;i<arr.length;i++){
            cs += arr[i];
            if (cs<0){
                cs =0;
            }  
             ms = Math.max(cs, ms) ;        
        } 
        System.out.println(ms);      
    } 
    //    For all -ve integer Array
    public static void SubArrForNegValued(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0 ;i<arr.length;i++){
           cs = Math.max(arr[i],cs+arr[i]);
           ms = Math.max(ms, cs);     
        }  
        System.out.println(ms);      
    }   
    public static void main(String[] args) {  
        int arr[]={-1,-1,-6,-2,-3};
        Subarr(arr);
        SubArrForNegValued(arr);
        
    }   
    
}  
