package ru.sbt.java.school.step37;

public class MyClass {
	
	public float parseFloat( String s ){
		float f = 0.0f;
		try{
			f = Float.valueOf( s ).floatValue();
			return f ;
		}
		catch(NumberFormatException nfe){
			f = Float.NaN ;
			return f;
		}
		finally{
			f = 10.0f;
			return f;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new MyClass().parseFloat("0.0"));
	}
	
}






























//What will it return if the method is called with the input "0.0" ?
//1. It will not compile.
//2. It will return 10.0 +
//3. It will return Float.Nan
//4. It will return 0.0
//5. None of the above.