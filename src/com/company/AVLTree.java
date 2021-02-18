package com.company;

class AWLTree implements ITree {
    public static Node root;
    private int size;

    class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
            left = right = null;
        }
    }


    public BTree(Node root) {
        this.root = root;
    }


    @Override
    public void init(int[] ar) {

    }

    @Override
    public void print(BinaryTree.Node node) {
//    public void print() {
/*        if(root!=null){
            print(root.left);
            System.out.print(" " + root.val);
            print(root.right);
        }*/
    }

    @Override
    public void clear() {
        root = null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
//    public void add(Node newNode, Node rootExplore) {
    public void add(int id) {
/*        if (rootExplore==null){
            return;
        }

        //

        if (newNode.val >rootExplore.val){
            if (rootExplore.right == null){
                rootExplore.right = newNode;
            }
            else {
                add(newNode,rootExplore.right);
            }
        }
        if (newNode.val<rootExplore.val){
            if (rootExplore.left == null){
                rootExplore.left = newNode;
            }
            else {
                add(newNode,rootExplore.left);
            }
        }*/
        Node newNode = new Node(id);
        if(root==null){
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while(true){
            parent = current;
            if(id<current.val){
                current = current.left;
                if(current==null){
                    parent.left = newNode;
                    return;
                }
            }else{
                current = current.right;
                if(current==null){
                    parent.right = newNode;
                    return;
                }
            }
        }
    }


    @Override
    public void del(int val) {

    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return ;
    }

    @Override
    public int nodes() {
        return 0;
    }

    @Override
    public int leaves() {
        return 0;
    }

    @Override
    public void reverse() {

    }
}