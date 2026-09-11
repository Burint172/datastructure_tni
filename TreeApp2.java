
public class TreeApp2 {
     
	public static void main(String[] args)
	{
		System.out.println("---------------------------");
		System.out.println("Binary Tree from createTree1");
		System.out.println("---------------------------");
		
		BinaryTree tree1 = new BinaryTree();
		tree1.createTree4();
		tree1.printTree(tree1.getRoot(), 0);
		System.out.println("---------------------------");
		System.out.println("Binary Tree from createTree1");
		System.out.println("---------------------------");
		
		BinaryTree tree2 = new BinaryTree();
		tree2.createTree5();
		tree2.printTree(tree2.getRoot(), 0);
		System.out.println("---------------------------");
		System.out.println("Binary Tree from createTree1");
		System.out.println("---------------------------");
		
		BinaryTree tree3 = new BinaryTree();
		tree3.createTree6();
		tree3.printTree(tree3.getRoot(), 0);
	}
}
