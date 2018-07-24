package main;

public class Person
{
	private String name;
	
	public Person(String n)
	{
		setName(n);
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public String getName()
	{
		return this.name;
	}
}
