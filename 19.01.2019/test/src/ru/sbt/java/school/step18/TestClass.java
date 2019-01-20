package ru.sbt.java.school.step18;

import java.util.*;
public class TestClass {
	public static void main(String[] args) throws Exception {
		List al = new ArrayList(); //1
		al.add(111); //2
		System.out.println(al.get(al.size())); //3
	}
}












































//1. It will not compile.
//2. It will throw an exception at run time because of line //1
//3. It will throw an exception at run time because of line //2
//4. It will throw an exception at run time because of line //3 +
//5. null.