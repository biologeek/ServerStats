package com.spaulding.serverstats.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.spaulding.serverstats.business.entities.MonitoredObject;
import com.spaulding.serverstats.business.entities.RAM;


@WebService
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
public interface ServerStatsService {
	
	/********************************************************************************
	 * ServerStatsService															|
	 * Author : Biologeek															|			
	 * 																				|
	 * 	WebService interface														|
	 * 																				|
	 * -----------------------------------------------------------------------------
	 * 	Version		|		Author		|			Comment							|
	 * -----------------------------------------------------------------------------
	 *		1.0		|		Biologeek	|	init									|		
	 * -----------------------------------------------------------------------------
	 * -----------------------------------------------------------------------------
	 * 
	 */
	@WebMethod
	public RAM getLastRAM();
	
	

}
