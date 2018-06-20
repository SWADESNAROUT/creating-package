package package2;

import package1.student;

public class example
{
	public static void main (String []args)
	{
		student s1 = new student();
		s1.SETROLLNO(100);
		s1.SETNAME("mamuni");
		System.out.println("name:" + s1.GETNAME());
		System.out.println("roll:" + s1.GETROLLNO());
		
	}

}
