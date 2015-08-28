package com.spaulding.serverstats.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.spaulding.serverstats.business.DAO;
import com.spaulding.serverstats.business.SpecificDAO;
import com.spaulding.serverstats.business.entities.RAM;

@Repository("ramDaoImpl")
@Transactional
public class RamDaoImpl<RAM> implements DAO<RAM>, SpecificDAO<RAM> {


	@Autowired(required=true)
	private SessionFactory sessionFactory;
	private Class<RAM> clazz;

	
	public RamDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean insert(RAM arg0) {
		Session s = sessionFactory.getCurrentSession();
		
		try {
			s.save(arg0);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RAM> selectAll() {
		Session s = sessionFactory.getCurrentSession();
		
		try {
			return (List<RAM>) s.createQuery("from "+this.getClazz().getName()).list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<RAM>();
		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Class<RAM> getClazz() {
		return clazz;
	}

	public void setClazz(Class<RAM> clazz) {
		this.clazz = clazz;
	}

	@Override
	public RAM selectById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(RAM arg0) {
		Session s = sessionFactory.getCurrentSession();
		
		try {
			s.update(arg0);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(RAM arg0) {
		Session s = sessionFactory.getCurrentSession();
		
		try {
			s.delete(arg0);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<RAM> selectFromDateToDate(Date begin, Date end) {
		System.out.println (sessionFactory);
		Session s = sessionFactory.getCurrentSession();
		return (List<RAM>) s.createQuery("from "+this.getClazz().getName()+" WHERE ram_date>="+ begin+" AND ram_date<="+end);
	}

}
