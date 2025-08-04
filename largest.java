public class largest {
    public static int getlargest (int num []){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<num.length;i++){
            if (largest < num[i]){
                largest = num[i];
            }
        }
        return largest;
    }
    
    public static void main(String args[]){
        int num []={1,2,3,4,-1,9};
        
        int max = getlargest(num);
    System.out.println(max);
    }
}
