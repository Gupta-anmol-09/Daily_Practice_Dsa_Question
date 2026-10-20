// Given an Array which contains the elements You have to find the
// Elements which addition is equal to the target
// So, applying Two Pointer Technique to sove this question

public class Day_1_TwoPointer {
    public static void twosum(int[] arr,int target){
        int left=0;
        int right= arr.length-1;
        while(left<right){
            int current_Sum=arr[left]+arr[right];
            if(current_Sum==target){
                System.out.print("Indexs of elements is:-- "+ left + ","+ right);
                return;
            } else if (current_Sum<target) {
                left++;

            }else{
                right--;
            }
        }
        System.out.println("The Elements are Not Found");

    }

    public static void main(String[] args) {
        int[] arr = new int []{1,2,3,5,7,10,11,15};
        int target=15;
        twosum(arr,target);

    }
}


//
