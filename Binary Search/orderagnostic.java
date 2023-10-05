import java.util.*;

public class orderagnostic {

    public static void main(String[] args) {

        int[] arr = { -12, -3, 9, 89, 101, 109, 150 };
        int target = 89;

        int ans = orderagnosticBS(arr, target);
        System.out.println(ans);
    }










    public static int orderagnosticBS(int[] arr, int target) {









        int start = 0;


        int end = arr.length - 1;


        boolean isAsc;

        if (arr[start] < arr[end]) {



            isAsc = true;


        } else {
            isAsc = false;


        }











        while (start <= end) {  // Change start<end to start<=end








            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {



                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
