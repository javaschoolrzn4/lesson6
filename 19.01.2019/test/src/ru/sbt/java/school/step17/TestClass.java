package ru.sbt.java.school.step17;

class TestClass{
	public static void main(String[] args) throws Exception{
		try{
			amethod();
			System.out.println("try ");
		}
		catch(Exception e){
			System.out.print("catch ");
		}
		finally {
			System.out.print("finally ");
		}
		System.out.print("out ");
	}
	public static void amethod(){ }
}

































//1. try finally
//2. try finally out +
//3. try out
//4. catch finally out
//5. It will not compile because amethod() does not throw any exception.