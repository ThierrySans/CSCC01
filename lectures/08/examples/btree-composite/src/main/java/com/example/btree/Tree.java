package com.example.btree;

import java.util.List;

public class Tree<T> implements TreeInterface<T>{ 
    
	private TreeInterface<T> left;
    private T root;
	private TreeInterface<T> right;
    
	public Tree(T value){
            this.root = value; 
            this.left = new TreeNull<T>();
            this.right = new TreeNull<T>();
	}
    
	public Tree(TreeInterface<T> left, T value){
	        this.left = left;
            this.root = value;
            this.right = new TreeNull<T>();
	}
	public Tree(T value, TreeInterface<T> right){
	        this.left = new TreeNull<T>();
            this.root = value;
            this.right = right;
	}
    
	public Tree(TreeInterface<T> left, T value, TreeInterface<T> right){
	        this.left = left;
            this.root = value;
            this.right = right;
	}

	public Integer getSize(){
		return 1 + this.left.getSize() + this.right.getSize();
	}

	public Integer getHeight(){
		return Math.max(this.left.getHeight(), this.right.getHeight()) + 1;        
	}

	public List<T> flatten(){
		List<T> result = this.left.flatten();
		result.add(this.root);
		result.addAll(this.right.flatten());
		return result;
	}
}