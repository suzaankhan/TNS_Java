package com.genericinterfaceexample;

public interface GenericRepository<T> {
	
	void save(T object);
	T find(int id);
	
}
