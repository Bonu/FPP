package edu.mum.mscs.fpp.homework.w3d3;

/**
 * 1. Implement the following methods in the demo code folder
 * BinarySearchTreeDemo.java a. Pre order traversal b. Post order traversal c.
 * Find the minimum value d. Find the maximum value e. Count the number of leaf
 * nodes
 * 
 * Extra credit (30) f. Implement a method to get the Successor. int
 * getSuccessor(Node x) g. Implement a method to get the predecessor. int
 * getPredecessor(Node x)
 * 
 * Output: 

	 Node 66 not found
	 Number of leaf nodes: 6
	 Inorder: 10 15 20 25 30 45 50 55 60 65 75 80 
	 Preorder:  10 15 20 25 30 45 50 55 60 65 75 80
	 Postorder:  10 20 15 30 25 50 60 55 80 75 65 4510 15 20 25 30 45 50 55 60 65 75 80 
	 Inorder, after insertion of 44: 10 15 20 25 30 44 45 50 55 60 65 75 80 
	Minimum Value in the tree: 10
	Maximum Value in the tree : 80
	 Successor of 20:  25
	 Predecessor of 20:  15

 * 
 * @author janardhanbonu
 *
 */
class BSTNode {
	int data;
	BSTNode left;
	BSTNode right;

	BSTNode(int d) // constructor
	{
		data = d;
	}
}

class BinarySearchTree {
	public BSTNode insertTree(BSTNode p, int key) // create BST
	{
		if (p == null)
			p = new BSTNode(key); // Root node
		else if (key < p.data)
			p.left = insertTree(p.left, key); // Insert into Left
		else
			p.right = insertTree(p.right, key); // Insert into Right
		return p; // return root
	}

	public BSTNode search(BSTNode root, int key) {
		BSTNode p = root; // initialize p with root
		while (p != null) {
			if (key == p.data)
				return p;
			else if (key < p.data)
				p = p.left;
			else
				p = p.right;
		}
		return null;
	}

	public void inorder(BSTNode p) // 'p' starts with root
	{
		if (p != null) {
			inorder(p.left);
			System.out.print(p.data + " ");
			inorder(p.right);
		}
	}

	// Count number of leaf nodes
	public int leafNodes(BSTNode p) {

		if (p == null)
			return 0;
		if (p.left == null && p.right == null)
			return 1;
		else
			return leafNodes(p.left) + leafNodes(p.right);
	}

	// Implement this method
	public BSTNode minimum(BSTNode p) {
		BSTNode minValue = new BSTNode(Integer.MAX_VALUE);
		if (p != null) {
			BSTNode leftMin = minimum(p.left);
			BSTNode rightMin = minimum(p.right);

			if (leftMin.data < rightMin.data)
				minValue = leftMin;
			else
				minValue = rightMin;

			if (p.data < minValue.data)
				minValue = p;
		}
		return minValue;
	}

	// Implement this method
	public BSTNode maximum(BSTNode p) {

		BSTNode maxValue = new BSTNode(Integer.MIN_VALUE);
		if (p != null) {
			BSTNode leftMax = maximum(p.left);
			BSTNode rightMax = maximum(p.right);

			if (leftMax.data > rightMax.data)
				maxValue = leftMax;
			else
				maxValue = rightMax;

			if (p.data > maxValue.data)
				maxValue = p;
		}
		return maxValue;
	}

	// Implement this method
	public void preorder(BSTNode p) {
		if (p != null) {
			preorder(p.left);
			System.out.printf(" %s", p.data);
			preorder(p.right);
		}
	}

	// Implement this method
	public void postorder(BSTNode p) {
		if (p != null) {
			postorder(p.left);
			postorder(p.right);
			System.out.printf(" %s", p.data);
		}
	}

	public BSTNode getSuccessor(BSTNode root, int data) {
		BSTNode current = search(root, data);

		if (current == null) {
			return null;
		}

		if (current.right != null) {
			BSTNode temp = current.right;
			while (temp.left != null) {
				temp = temp.left;
			}
			return temp;
		} else {
			BSTNode successor = null;
			while (root.data != current.data) {
				if (current.data < root.data) {
					successor = root;
					root = root.left;
				} else {
					root = root.right;
				}
			}
			return successor;
		}
	}

	public BSTNode getPredecessor(BSTNode root, int data) {
		BSTNode current = search(root, data);

		if (current == null) {
			return null;
		}
		if (current.left != null) {
			BSTNode temp = current.left;
			while (temp.right != null) {
				temp = temp.right;
			}
			return temp;
		} else {
			BSTNode predecessor = null;
			BSTNode ancestor = root;
			while (ancestor.data != current.data) {
				if (current.data < ancestor.data) {
					ancestor = ancestor.left;
				} else {
					predecessor = ancestor;
					ancestor = ancestor.right;
				}
			}
			return predecessor;
		}
	}

} // end of BinarySearchTree class
// //////////////////// BinarySearchTreeDemo.java ////////////////////

class BinarySearchTreeDemo {
	public static void main(String args[]) {
		int arr[] = { 45, 25, 15, 10, 20, 30, 65, 55, 50, 60, 75, 80 };
		BinarySearchTree bst = new BinarySearchTree();

		BSTNode root = null;
		// build tree by repeated insertions
		for (int i = 0; i < arr.length; i++)
			root = bst.insertTree(root, arr[i]);
		BSTNode root2 = root; // copy BST
		int key = 66;
		BSTNode item = bst.search(root2, key);
		if (item != null)
			System.out.print("\n item found: " + item.data);
		else
			System.out.print("\n Node " + key + " not found");
		System.out.print("\n Number of leaf nodes: " + bst.leafNodes(root));
		System.out.print("\n Inorder: ");
		bst.inorder(root);
		System.out.print("\n Preorder: ");
		bst.preorder(root);
		System.out.print("\n Postorder: ");
		bst.postorder(root);
		bst.inorder(root);
		key = 44; // insert 44
		bst.insertTree(root, key);
		System.out.print("\n Inorder, after insertion of " + key + ": ");
		bst.inorder(root);
		System.out.println("\nMinimum Value in the tree: "
				+ bst.minimum(root2).data);
		System.out.println("Maximum Value in the tree : "
				+ bst.maximum(root2).data);
		
		System.out.println(" Successor of 20:  " + bst.getSuccessor(root2, 20).data);
		System.out.println(" Predecessor of 20:  " + bst.getPredecessor(root2, 20).data);

	}
}
