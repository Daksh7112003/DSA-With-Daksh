import java.util.*;
public class Code{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]arr = {1,2,3,4,6,7,89,90,755,899};
        int target=90;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
        
    }
    static int binarySearch(int[]arr, int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
        
        int mid = start + (end-start)/2;

        if(target<arr[mid]){
            end = mid-1;

        }
        if(arr[mid]<target){
            start=mid+1;


        }
        else{
       return mid;


        }

        

        }

    return -1;




    }

















        
    }
