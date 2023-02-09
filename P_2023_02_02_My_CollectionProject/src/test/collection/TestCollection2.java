package test.collection;

import java.util.ArrayList;
import java.util.List;

import test.appoint.Appoint;
import test.date.Date;

public class TestCollection2 
{

	public static void main(String[] args) 
	{
		
		
		List list = new ArrayList();
		System.out.println(list.size());
		list.add(1);
		list.add("hello");
		list.add(true);
		list.add('A');
		list.add(3.14);
		System.out.println(list.size());
		System.out.println(list);
		for (Object object : list) 
		{
			System.out.println(object);
		}
	}
}
