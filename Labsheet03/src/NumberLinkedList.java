
public class NumberLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList number = new LinkedList();
       
       number.insert(0, 37);
       number.insert(0, 7);
       number.insert(0, 4);
       number.insert(0, 16);
       System.out.println(number.traversal());
       
       number.insert(2, 20);
       System.out.println(number.traversal());
       
       number.insert(25);
       System.out.println(number.traversal());
       
       number.remove(0);
       System.out.println(number.traversal());
       number.remove(2);
       System.out.println(number.traversal());
       number.removeLastElement();
       System.out.println(number.traversal());
       
	}

}
