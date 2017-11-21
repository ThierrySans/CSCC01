package ca.utoronto.utsc.designpatterns.composite;

import java.util.ArrayList;

public class Tree<T>{ 
    
    private Tree<T> left, right;
    private T root;
    
	public Tree(T value){
            this.root = value; 
            this.left = left = this.right = null;
	}
    
	public Tree(Tree<T> left, T value){
	        this.left = left;
            this.root = value;
            this.right = null;
	}
    
	public Tree(T value, Tree<T> right){
	        this.left = null;
            this.root = value;
            this.right = right;
	}
    
	public Tree(Tree<T> left, T value, Tree<T> right){
	        this.left = left;
            this.root = value;
            this.right = right;
	}
    
    public Integer getSize(){
        Integer size = 1;
        if (this.left != null){
            size += this.left.getSize();
        }
        if (this.right != null){
            size += this.right.getSize();
        }
        return size ;
    }
    
    public Integer getHeight(){
        Integer lleft = -1;
        Integer lright = -1;
        if (this.left != null){
            lleft = this.left.getHeight();
        }
        if (this.right != null){
            lright = this.right.getHeight();
        }
        return Math.max(lleft, lright) + 1;
    }
    
    public ArrayList<T> flatten(){
        ArrayList<T> result = new ArrayList<T>();
        if (this.left != null){
            result = this.left.flatten();
        }
        result.add(this.root);
        if (this.right != null){
            result.addAll(this.right.flatten());
        }
        return result;
    }
}