package Queue;

import java.util.*;

public class CustomQueue<T extends Comparable<T>> {
	
	private Object[] arr;
	private int s;
	private int e;
	private int size;
	
	
	
	public CustomQueue() {
		size=10;
		arr = new Object[size];
		s=0;
		e=0;
	}
	
	private  void grow() {
		Object[] temp =new Object[size*2];
		for(int i=s;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		arr=temp;
	}
	
	public boolean offer(T ele) {
		if(e==size) {
			grow();
			
		}
		arr[e++]=ele;
		return true;	
	}
	
	public Object poll() {
		if(s==e) {
			return null;
		}
		return arr[s++]; 
	}
	
	public Object element() {
		if(s==e) {
			return null;
		}
		return arr[s];
	}
	public int sizeOf() {
		return e-s;
	}
	
	
	
	
	
	

}
