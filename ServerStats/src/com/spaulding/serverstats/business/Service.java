package com.spaulding.serverstats.business;

import java.util.List;

public interface Service<T> {

	
	public boolean insert (T arg0);
	public List<T> selectAll ();
	public T selectById (long id);
	public boolean update (T arg0);
	public boolean delete (T arg0);
	
}
