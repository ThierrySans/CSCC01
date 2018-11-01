package com.example.btree;

import java.util.List;

public interface TreeInterface<T>{ 
        
    public Integer getSize();
    
    public Integer getHeight();
    
    public List<T> flatten();
}