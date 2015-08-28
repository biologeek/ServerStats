package com.spaulding.serverstats.ws;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.spaulding.serverstats.business.Service;
import com.spaulding.serverstats.business.SpecificService;
import com.spaulding.serverstats.business.entities.RAM;
import com.spaulding.serverstats.business.service.RAMServiceImpl;


@WebService(endpointInterface="com.spaulding.serverstats.ws.ServerStatsService")
public class ServerStatsServiceImpl implements ServerStatsService{
/********************************************************************************
 * ServerStatsServiceImpl														|
 * Author : Biologeek															|
 * 																				|
 * 	WebService implementation													|
 * 																				|
 * -----------------------------------------------------------------------------
 * 	Version		|		Author		|			Comment							|
 * -----------------------------------------------------------------------------
 *		1.0		|		Biologeek	|	init									|		
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * 
 */
	
	@Autowired
	Service<RAM> ramService;
	
	
	@Override
	public RAM getLastRAM() {
		// TODO Auto-generated method stub
		return (RAM) ramService.selectAll();
	}



	
	
}
