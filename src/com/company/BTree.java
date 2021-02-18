package com.company;

class BinaryTree implements ITree {
    private int size = 0;

    static class Node {
        Integer value;
        Node left, right;
        Node parent;

        Node(Integer value) {
            value = null;
            this.parent = null;
            left = right = null;
        }
    }

    Node ROOT;

    BinaryTree() {
        ROOT = null;
        size = 0;
    }


    @Override
    public void init(int[] ar) {
        for (int i : ar) {
            size++;
            add(i);
        }
    }


    @Override
    public void print(Node node) {
        if (node != null) {
            print(node.left);
            System.out.print(node.value + " - ");
            print(node.right);
        }
    }

    @Override
    public void clear() {
        ROOT = null;
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
    public void add(int id) {
        ROOT = recursiveInsert(ROOT, id);
    }

    Node recursiveInsert(Node ROOT, int data) {
        //Если дерево пустое
        if (ROOT == null) {
            ROOT = new Node(data);
            size++;
            return ROOT;
        }
        //traverse the tree
        if (data < ROOT.value) {
            ROOT.left = recursiveInsert(ROOT.left, data);
        } else if (data > ROOT.value) {
            ROOT.right = recursiveInsert(ROOT.right, data);
        }
        return ROOT;
    }

    @Override
    public void del(int val) {

    }

    @Override
    public int getWidth(){
        return getWidthOfTree(ROOT);
    }

    public int getWidthOfTree(Node node) {
        if (node == null) {
            return 0;
        } else {
            return ROOT.value + max(getWidthOfTree(node.left), getWidthOfTree(node.right));
        }
    }

    @Override
    public int getHeight() {
        return getHeightOfTree(ROOT);
    }

    public int getHeightOfTree(Node node) {
        if (node == null) {
            return -1;
        }
        return max(getHeightOfTree(node.left), getHeightOfTree(node.right)) + 1;
    }

      public int max(int a, int b) {
        return Math.max(a, b);
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