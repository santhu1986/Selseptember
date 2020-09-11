package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		        //Instance class
		
				Library LB=new Library();
				
				LB.OpenApp("http://183.82.100.55/ranford2");
				LB.AdminLgn("Admin","M1ndq");
				
				//To get Test data File Path
				
			String Fpath="E:\\Seleniumbatch10\\Ebanking\\src\\com\\ebanking\\testdata\\Role.txt";
			
			//Results File Path
			
			String Rpath="E:\\Seleniumbatch10\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.txt";
		String SD;
		
		//To Get Test Data File
			
			FileReader FR=new FileReader(Fpath);
            BufferedReader BR=new BufferedReader(FR);
            String Sread=BR.readLine();
            System.out.println(Sread);
			
			//Write Header
            
            FileWriter FW=new FileWriter(Rpath);
            BufferedWriter BW=new BufferedWriter(FW);
            BW.write(Sread);
            BW.newLine();
            
            
            
            //Multiple Iterations-----While loop
            
          while ((SD=BR.readLine())!=null)
          {
			//Split
        	  
        	 String SR[]= SD.split("###");
        	 
        	 String Rname=SR[0];
		     String Rty=SR[1];
		     
		     String Res=LB.Role(Rname,Rty);
		     
		     //Results
		     
		     BW.write(Rname+"$#$^&"+Rty+"^&^&^"+Res);
		     BW.newLine();
		     
          }
            
            BW.close();
            BR.close();
            
	}
}