package ca.utoronto.utsc.designpatterns.composite;

public class Main
{ 
	public static void main(String [] args)
	{
        Tree<Integer> t = new Tree<Integer>(new Tree<Integer>(3, new Tree<Integer>(8)), 10, new Tree<Integer>(15, new Tree<Integer>(21, new Tree<Integer>(42))));
        System.out.println(t.getHeight());
        System.out.println(t.getSize());
        System.out.println(t.flatten().toString());
	}

}