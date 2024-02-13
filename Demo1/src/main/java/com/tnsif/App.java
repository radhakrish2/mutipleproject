package com.tnsif;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
	public static void main(String[] args) 
	{	
		Date date1 = new Date();
	
		
		SimpleDateFormat sf= new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		try {
			date1= sf.parse("18/11/2023 10:33 pm");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sf.format(date1));
	}
}
