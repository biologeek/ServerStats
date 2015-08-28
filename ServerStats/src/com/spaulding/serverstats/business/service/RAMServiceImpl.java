package com.spaulding.serverstats.business.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spaulding.serverstats.business.DAO;
import com.spaulding.serverstats.business.SpecificDAO;
import com.spaulding.serverstats.business.SpecificService;
import com.spaulding.serverstats.business.entities.RAM;
import com.spaulding.serverstats.dao.impl.RamDaoImpl;

@Service(value="ramServiceImpl")
public class RAMServiceImpl implements com.spaulding.serverstats.business.Service<RAM>, SpecificService<RAM>{

	@Autowired
	private DAO<RAM> dao;
	
	@Autowired(required=true)
	private SpecificDAO<RAM> specDAO;


	public RAMServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public boolean insert(RAM arg0) {
		// TODO Auto-generated method stub
		return dao.insert(arg0);
	}

	public DAO<RAM> getDao() {
		return dao;
	}

	public void setDao(DAO<RAM> dao) {
		this.dao = dao;
	}

	public SpecificDAO<RAM> getSpecDAO() {
		return specDAO;
	}

	public void setSpecDAO(SpecificDAO<RAM> specDAO) {
		this.specDAO = (RamDaoImpl) specDAO;
	}

	@Override
	public List<RAM> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public RAM selectById(long id) {
		// TODO Auto-generated method stub
		return (RAM) dao.selectById(id);
	}

	@Override
	public boolean update(RAM arg0) {
		// TODO Auto-generated method stub
		return dao.update(arg0);
	}

	@Override
	public boolean delete(RAM arg0) {
		// TODO Auto-generated method stub
		return dao.delete(arg0);
	}


	@Override
	public List<RAM> selectFromDateToDate(Date begin, Date end) {
		System.out.println("Blou"+specDAO);
		return specDAO.selectFromDateToDate(begin, end);
	}



}
