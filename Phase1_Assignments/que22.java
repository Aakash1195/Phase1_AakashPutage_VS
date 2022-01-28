

	class que22 {

	public void rotate(int[] nums, int k) {
        if(k > nums.length) 
               k=k%nums.length;
     int[] result = new int[nums.length];
     for(int i=0; i < k; i++){
                result[i] = nums[nums.length-k+i];
     }
     int j=0;
        for(int i=k; i<nums.length; i++){
                result[i] = nums[j];
j++;
        }
        
     System.arraycopy( result, 0, nums, 0, nums.length );
}


	public static class ArrayRotation{
public static void main(String[] args) {
	que22 r = new que22();
            int arr[] = { 11, 2, 3, 14, 5, 16, 17 }; 
            r.rotate(arr, 5); 
            for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
            }
}
}
}