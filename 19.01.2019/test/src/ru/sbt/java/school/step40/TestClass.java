package ru.sbt.java.school.step40;

public class TestClass{
	public static int getSwitch(int x){
		return x - 20/x + x*x;
	}
	public static void main(String args[]){
		switch( getSwitch(10) ){
			case 1 :
			case 2 :
			case 3 :
			default : break;
		}
	}
}






































//1. int +
//2. float
//3. long
//4. double
//5. char
//6. byte
//7. short