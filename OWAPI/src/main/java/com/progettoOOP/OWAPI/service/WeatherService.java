package com.progettoOOP.OWAPI.service;

import java.util.ArrayList;

import com.progettoOOP.OWAPI.model.AbstractCityData;


/* @Author Luigi Smargiassi
 * Interfaccia pubblica del servizio meteo 
 */

public interface WeatherService {

	//metodo astratto per la chiamata alle funzionalità del servizio meteo relative alle condizioni attuali
	public abstract ArrayList<AbstractCityData> actualService(double lat,double lon,int cnt);
	
	/*metodo astratto per la chiamata alle funzionalità del servizio meteo relative alle condizioni storiche
	 * del parametro "type" -> cloud/pressure 
	 * sul periodo "period" -> misurato in giorni
    */
	public abstract ArrayList<AbstractCityData> statService
		(int period, double lat, double lon, int cnt, String type);

}

