package com.example.btree;

import java.util.ArrayList;
import java.util.List;

public class TreeNull<T> implements TreeInterface<T>{ 
    
    public Integer getSize(){
        return 0;
    }
    
    public Integer getHeight(){
        return 0;
    }
    
    public List<T> flatten(){
    	return new ArrayList<T>();
    }
}