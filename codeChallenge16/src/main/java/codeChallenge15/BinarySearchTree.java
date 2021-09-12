package codeChallenge15;


public class BinarySearchTree extends BinaryTree {

    Node root;

    public int add(int value) {

        return addNodeToTree(root, value);
    }

    public boolean contains(int value) {
        System.out.println(findKey(root, value));
        return findKey(root, value);
    }

    public int findMaxValue() {
        return methodFindMaxValue(root);
    }


    private int addNodeToTree(Node root, int value) {

        if (root == null) {
            this.root = new Node(value);
        } else if (value < root.value) {
            if (root.left != null) {
                addNodeToTree(root.left, value);
            } else {
                root.left = new Node(value);
            }

        } else if (value > root.value) {
            if (root.right != null) {
                addNodeToTree(root.right, value);
            } else {
                root.right = new Node(value);
            }
        }
        return value;
    }

    private boolean findKey(Node root, int value) {

        if (root == null) {
            return false;
        } else if (root.value == value) {
            return true;
        } else if (value < root.value) {
            return findKey(root.left, value);
        }
        return findKey(root.right, value);
    }

    public int methodFindMaxValue(Node root) {
        if (root == null) {
            return -1;
        }

        int result = root.value;
        int liftSide = methodFindMaxValue(root.left);
        int rightSide = methodFindMaxValue( root.right);

        if (liftSide > result){
            return liftSide;
        }else if(rightSide > result){
            return rightSide;
        }
        return result;
    }























    public int maxNum(){
       return visitAllNodes(this.root);

    }


    public int visitAllNodes(Node root) {

        if(root == null){
        return 0;
        }

      int max = root.value;
       int leftSide= visitAllNodes(root.left);
       int rightSide = visitAllNodes(root.right);

       if(leftSide> max){
           return leftSide;
       }else if(rightSide> max){
           return rightSide;
       }
       return max;

    }
}
