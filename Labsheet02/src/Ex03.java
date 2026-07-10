
public class Ex03 {

	public static void main(String[] args) {
		ArrayController nums = new ArrayController();
		nums.display("All element: ");
		
		int[]new_nums = new int[nums.getSive()+1];
		
		for(int i=0; i<nums.getSive();i++) {
			new_nums[i] = nums.getNums()[i];
		
		}

		nums.setNums(new_nums);
		nums.display("\n\nAfter add sive: ");
		
		nums.getNums()[nums.getSive()-1]=15;
		nums.display("\n\nAfter add the last element:  ");
	}

}
