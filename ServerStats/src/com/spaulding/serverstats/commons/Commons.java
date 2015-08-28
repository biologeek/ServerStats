package com.spaulding.serverstats.commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Commons {

static SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
static SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

	
	public static Date stringToDateTime (String dateString) throws ParseException {
				
		return dateTimeFormatter.parse(dateString);	
	}
	
	
	public static Date stringToDate (String dateString) throws ParseException {
		
		return dateFormatter.parse(dateString);	
	}
	
	
	public static Calendar stringToCalendarDay (String dateString) throws ParseException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(dateFormatter.parse(dateString));
		
		return cal;	
	}
	
	public static Calendar stringToCalendarSecond (String dateString) throws ParseException {
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(dateTimeFormatter.parse(dateString));
		
		return cal;		
	}
	
	public static String getCurrentDate () {
		return dateFormatter.format(new Date());
		
	}
}
