package ru.sbt.java.school.step27;

class Super{
	public String toString(){
		return "4";
	}
}
public class SubClass extends Super{
	public String toString(){
		return super.toString()+"3";
	}
	public static void main(String[] args){
		System.out.println( new SubClass() );
	}
}



































//      1. 43 +
//		2. 7
//		3. It will not compile.
//		4. It will throw an exception at runtime.
//		5. None of the above.