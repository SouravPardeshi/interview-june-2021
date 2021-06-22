package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.

  }

}
public class Solution {
    public static void LeftShift(int arr[], int n) {
        int temp = arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i+1];
        }       
        arr[n-1] = temp;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        /* Left rotate for k times */
        for (int i = 0; i < k; i++) {
            LeftShift(a, n);
        }
        
        /* Displaying the output */
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
