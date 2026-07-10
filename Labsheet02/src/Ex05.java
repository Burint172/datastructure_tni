
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayController nums =new ArrayController();
		nums.display("All element");
		
		int[] new_nums =new int[nums.getSive()-1];
		
		for (int i=0 ; i<new_nums.length;i++) {
			new_nums[i] = nums.getNums()[i];
		}
		
		
		
		
		nums.setNums(new_nums);
        nums.display("\n\nAfter deletes the First index:");
	}

}
