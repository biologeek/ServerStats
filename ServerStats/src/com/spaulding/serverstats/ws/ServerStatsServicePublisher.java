package com.spaulding.serverstats.ws;

import javax.xml.ws.Endpoint;



public class ServerStatsServicePublisher {

	
	public static void main (String[] args) {
		
		Endpoint.publish("http://localhost:8080/ws/ServerStatsService", new ServerStatsServiceImpl());
		
	}
}
