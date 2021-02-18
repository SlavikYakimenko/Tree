package com.company;

public interface ITree {
    void init(int[] ar);

    void print(BinaryTree.Node node);

    void clear();

    int size();

    int[] toArray();

    //    void add(BTree.Node newNode, BTree.Node rootExplore);
    void add(int id);

    void del(int val);

    int getWidth();

    int getHeight();

    int nodes();

    int leaves();

    void reverse();
}
