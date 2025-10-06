package com.bptn.course._08_inheritance_in_depth;

public class ObjectClassDemo {
	
	@Override
	public String toString() {
		return "This is object calling";
	}

	public static void main(String args[]) {
		ObjectClassDemo myobj = new ObjectClassDemo();
		System.out.println(myobj);
		
		System.out.println(myobj.getClass());
		System.out.println(myobj.getClass().getSuperclass());
	}
	
}
