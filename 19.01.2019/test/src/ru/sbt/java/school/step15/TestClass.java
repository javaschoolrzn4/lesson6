package ru.sbt.java.school.step15;

import java.io.IOException;

//assume appropriate imports
class PortConnector {
	public PortConnector(int port) {
		if (Math.random() > 0.5) {
			//throw new IOException();
		}
		throw new RuntimeException();
	}
}
public class TestClass {
	public static void main(String[] args) {
		try {
			PortConnector pc = new PortConnector(10);
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
	}
}





























//1. add throws IOException to the main method.
//2. add throws IOException to PortConnector constructor.
//3. add throws IOException to the main method as well as to PortConnector constructor. +
//4. Change RuntimeException to java.io.IOException.
//5. add throws Exception to PortConnector constructor and change catch(RuntimeException re) to +
//catch(Exception re) in the main method.
