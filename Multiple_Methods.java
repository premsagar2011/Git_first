package com.methods;

public class Multiple_Methods
{

	public static void main(String[] args)
	{
		Doctor d=new Doctor();
		d.doSurgery();
		System.out.println("Operation is completed");
	}

}
class Doctor
{
	public void doSurgery() 
	{
		Nurse n=new Nurse();
		n.prepareForSurgery();
	System.out.println("Do surgery for the patient");	
	}
}
class Nurse
{
	public void prepareForSurgery()
	{
		Patient p=new Patient();
		p.admit();
	System.out.println("Prepare the patient for Surgery");	
	}
}
class Patient
{
	public void admit() 
	{
	System.out.println("come for operation room");	
	}
}
