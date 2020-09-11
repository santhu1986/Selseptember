package com.ebanking.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws InterruptedException, IOException
	
	{
		//Instance Class
		
		Library LB=new Library();
		
		String Rval=LB.OpenApp("http://183.82.100.55/ranford2");
		System.out.println(Rval);
		LB.AdminLgn("Admin","M1ndq");
		LB.Branchcre();
		
	}

}
