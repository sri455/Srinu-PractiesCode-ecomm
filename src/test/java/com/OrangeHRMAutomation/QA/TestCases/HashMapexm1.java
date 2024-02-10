package com.OrangeHRMAutomation.QA.TestCases;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapexm1 {

	public static void main(String[] args) 
	{
		HashMap<String,String> employe=new HashMap<String,String>();
		employe.put("emplname" ,"srinu");
		employe.put("empcmpny", "ibm");
		employe.put("salary", "5000$");
		employe.put("emplID","IBM@345");
		System.out.println("employe name is "+employe.get("emplname"));
		employe.put("emplname" ,"suman");
		employe.put("emplname" ,"ramesh");
		System.out.println("employe name is "+employe.get("emplname"));
		System.out.println(employe.keySet());
		Set<String> mykeys = employe.keySet();
		Iterator<String> it =mykeys.iterator();
		System.out.println("*********************************");
		while(it.hasNext())
		{
			System.out.println(employe.get(it.next()));
		}
	}

}
