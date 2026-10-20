
public class maximum_Sum_Subarray_BruteForce {
    public  static int MaxCompare(int maxx,int currentVal){
        if(maxx==currentVal){
            return maxx;
        } else if (maxx<currentVal) {
            return currentVal;

        }else{
            return maxx;
        }
    }

    public static int maximumSum(int [] arr,int k){
        int maximum_Val=Integer.MIN_VALUE;
        int n= arr.length-k;
        for (int i = 0; i <=n; i++) {
            int current=0;
            for (int j = i; j <=(i+k)-1 ; j++) {
                current=current+arr[j];

            }
            maximum_Val=MaxCompare(maximum_Val,current);


        }

        return maximum_Val;
    }
    public static void main(String[] args) {
        int [] nums= new int[] {12,5,6,7,9,18,5,2};
        int windowSize=4;
        int ans=maximumSum(nums,windowSize);
        System.out.println("Maximum Sum == " + ans);

    }
}
