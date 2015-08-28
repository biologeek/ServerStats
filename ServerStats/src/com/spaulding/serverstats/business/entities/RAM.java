package com.spaulding.serverstats.business.entities;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
@Entity
public class RAM extends MonitoredObject{
	
	
	private String ramTotal;
	private String ramFree;
	private String ramUsed;
	private String ramShared;
	private String ramBuffers;
	private String ramCached;
	
	
	public RAM() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getRamTotal() {
		return ramTotal;
	}


	public void setRamTotal(String ramTotal) {
		this.ramTotal = ramTotal;
	}


	public String getRamFree() {
		return ramFree;
	}


	public void setRamFree(String ramFree) {
		this.ramFree = ramFree;
	}


	public String getRamUsed() {
		return ramUsed;
	}


	public void setRamUsed(String ramUsed) {
		this.ramUsed = ramUsed;
	}


	public String getRamShared() {
		return ramShared;
	}


	public void setRamShared(String ramShared) {
		this.ramShared = ramShared;
	}


	public String getRamBuffers() {
		return ramBuffers;
	}


	public void setRamBuffers(String ramBuffers) {
		this.ramBuffers = ramBuffers;
	}


	public String getRamCached() {
		return ramCached;
	}


	public void setRamCached(String ramCached) {
		this.ramCached = ramCached;
	}
	
	
	
}
