package ru.sbt.java.school.step21;

class NewException extends Exception {}
class AnotherException extends Exception {}
public class ExceptionTest{
//	public static void main(String[] args) throws Exception{
//		try{
//			m2();
//		}
//		finally{
//			m3();
//		}
// catch (NewException e){}
//	}
	public static void m2() throws NewException { throw new NewException(); }
	public static void m3() throws AnotherException{ throw new AnotherException(); }
}































//1. It will compile but will throw AnotherException when run.
//2. It will compile but will throw NewException when run.
//3. It will compile and run without throwing any exceptions.
//4. It will not compile.+
//5. None of the above.