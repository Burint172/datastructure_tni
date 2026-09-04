import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class TreeHeight {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree3();    // Try to test with createTree2() and createTree3()
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Height of tree (DFS) = " + heightDFS(tree.getRoot()));
		System.out.println("Height of tree (BFS) = " + heightBFS(tree.getRoot()));
	}
	
	public static int heightDFS(Node node) {
		Deque<Node> stack_node = new ArrayDeque<Node>(); 
		Deque<Integer> stack_depth = new ArrayDeque<Integer>();
		int maxHeight = 0;
		
		stack_node.push(node);
		stack_depth.push(1);
		while(!stack_node.isEmpty()) {
			Node cuurent_node = stack_node.pop();
			int  current_depth = stack_depth.pop();
			maxHeight = Math.max(current_depth, maxHeight);
			
			if(cuurent_node.left != null) {
				stack_node.push(cuurent_node.left);
				stack_depth.push(current_depth+1);
			}
			if(cuurent_node.right != null) {
				stack_node.push(cuurent_node.right);
				stack_depth.push(current_depth+1);
			}
		}
		
		return maxHeight - 1;
	}
	
	public static int heightBFS(Node node) {
		int height = 0;
		if (node != null) {
			Queue<Node> queue = new ArrayDeque<Node>();
			queue.add(node);
			
			while(!queue.isEmpty()) {
				height++;
				int levelSive = queue.size();
				
				for(int i=0; i<levelSive;i++ ) {
					Node current_Node = queue.poll();
					if(current_Node.left != null) {
						queue.add(current_Node.left);
					}
					if(current_Node.right != null) {
						queue.add(current_Node.right);
					}
					
				}
			}
            
		}
		return height-1;
	}

}