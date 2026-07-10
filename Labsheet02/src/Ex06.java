
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayController nums = new ArrayController();
         nums.display("All element: ");
         
         
         int delete_index =2;
         int[] new_nums = new int[nums.getSive()-1];
         for (int i=0; i<delete_index; i++) {
        	 new_nums[i] = nums.getNums()[i];
         }
         
         for (int i=delete_index+1;i<nums.getSive();i++) {
        	 new_nums[i-1] = nums.getNums()[i];
         }
         
         
         
         
         nums.setNums(new_nums);
         nums.display("\n\nAfter deletes index 2:");
	}

}
