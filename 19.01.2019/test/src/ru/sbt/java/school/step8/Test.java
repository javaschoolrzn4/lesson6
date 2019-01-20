package ru.sbt.java.school.step8;

public class Test{
	public static void main(String args[]){
		int c = 0;
		boolean flag = true;
		for(int i = 0; i < 3; i++){
			while(flag){
				c++;
				if(i>c || c>5) flag = false;
			}
		}
		System.out.println(c);
	}
}


































//1. 3
//2. 4
//3. 5
//4. 6 +
//5. 7