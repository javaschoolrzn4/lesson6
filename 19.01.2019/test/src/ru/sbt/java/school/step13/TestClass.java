package ru.sbt.java.school.step13;

public class TestClass{
	public static void main(String[] args) {
		System.out.println(getMsg((char)10));
	}
	public static String getMsg(char x){
		String msg = "Input value must be ";
		msg = msg.concat("smaller than X");
		msg.replace('X', x);
		String rest = " and larger than 0";
		msg.concat(rest);
		return msg;
	}
}



































//1. Input value must be smaller than X and larger than 0
//2. Input value must be smaller than 10 and larger than 0
//3. Input value must be smaller than X +
//4. Input value must be smaller than 10