package ru.sbt.java.school.step14;

interface Account{
	public default String getId(){
		return "0000";
	}
}
interface PremiumAccount extends Account{
	public String getId();
}
//public class BankAccount implements PremiumAccount{
//	public static void main(String[] args) {
//		Account acct = new BankAccount();
//		System.out.println(acct.getId());
//	}
//}


































//1. It will print 0000 when run.
//2. It will compile if class BankAccount provides an implementation for getId method. +
//3. It will not compile unless interface PremiumAccount is marked abstract.
//4. It will compile if getId method in PremiumAccount is replaced with:
//public String getId(){ super.getId(); }
//5. It will compile if getId method in PremiumAccount is replaced with:
//public default String getId(){ super.getId(); }