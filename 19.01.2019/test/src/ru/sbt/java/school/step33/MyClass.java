package ru.sbt.java.school.step33;

import java.io.IOException;
import java.sql.SQLException;

public class MyClass {
	
	void m1() throws Exception{
//		try{
//			// line1
//		}
//		catch (IOException e){
//			throw new SQLException();
//		}
//		catch(SQLException e){
//			throw new InstantiationException();
//		}
//		finally{
//			throw new CloneNotSupportedException(); // this is not a RuntimeException.
//		}
	}
}





































//Which of the following statements are true?
//You had to select 2 options.
//1. If IOException gets thrown at line1, then the whole method will end up throwing SQLException.
//2.+ If IOException gets thrown at line1, then the whole method will end up throwing CloneNotSupportedException.
//3. If IOException gets thrown at line1, then the whole method will end up throwing InstantiationException.
//4.+ If no exception is thrown at line1, then the whole method will end up throwing CloneNotSupportedException.
//5. If SQLException gets thrown at line1, then the whole method will end up throwing InstantiationException.