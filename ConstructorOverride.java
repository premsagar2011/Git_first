package com.overriding;

public class ConstructorOverride
{

	public static void main(String[] args) 
	{
		B b=new B();
		b.car();
		b.property();
		b.marriage();
	}

}
class A
{
	public void property()
	{
		System.out.println("I have property");
	}
	public void car()
	{
		System.out.println("I have car");
	}
	public void marriage()
	{
		System.out.println("marry Rangamma or mangamma");
	}
}
class B extends A
{
	public void marriage()
	{
		System.out.println("I marry rashmika");
	}
}
