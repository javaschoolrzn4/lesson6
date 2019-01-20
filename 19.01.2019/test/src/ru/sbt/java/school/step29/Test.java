package ru.sbt.java.school.step29;

//in file Test.java
class E1 extends Exception{ }
class E2 extends E1 { }
class Test{
	public static void main(String[] args){
		try{
			throw new E2();
		}
		catch(E1 e){
			System.out.println("E1");
		}
		catch(Exception e){
			System.out.println("E");
		}
		finally{
			System.out.println("Finally");
		}
	}
}































//1. It will not compile.
//2. It will print E1 and Finally.+
//3. It will print E1, E and Finally.
//4. It will print E and Finally.
//5. It will print Finally.