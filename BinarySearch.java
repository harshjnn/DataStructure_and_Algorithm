import java.util.Arrays;

public class BinarySearch {
    public static int BinSearch(int num[], int key) {
        Arrays.sort(num); 
        int start = 0, end = num.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // key not found
    }
    

    public static void main(String args[]) {
        int num[] = {1, 2, 3, 4, -1, 9};
        int r = BinSearch(num, 4);
        System.out.println(r);  // Will print the index in sorted array
    }
}
