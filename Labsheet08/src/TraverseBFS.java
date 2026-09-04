import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class TraverseBFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.createTree3();    // Try to test with createTree2() and createTree3()
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Postorder = " + traversal(tree.getRoot()));
	}
	
	public static ArrayList<Integer> traversal(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if (node != null) {
			Queue<Node> queue = new ArrayDeque<Node>();
			queue.add(node);
			
			while(!queue.isEmpty()) {
				
				int levelSive = queue.size();
				
				for(int i=0; i<levelSive;i++ ) {
					Node current_Node = queue.poll();
					if(current_Node.left != null) {
						queue.add(current_Node.left);
					}
					if(current_Node.right != null) {
						queue.add(current_Node.right);
					}
					list.add(current_Node.data);
				}
			}
            
		}
		return list;
	}
		
	}


