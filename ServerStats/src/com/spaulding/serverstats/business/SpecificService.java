package com.spaulding.serverstats.business;

import java.util.Date;
import java.util.List;

public interface SpecificService<T> {

	
	public List<T> selectFromDateToDate(Date begin, Date end);

}
