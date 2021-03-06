package com.honeywell.ims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.ims.api.weather.Forecast;
import com.honeywell.ims.service.ForecastService;

/**
 * Created by h134602 on 9/12/2016.
 */
@RestController
@RequestMapping("/forecast")
public class ForecastResource {

	@Autowired
	private ForecastService service;

	@RequestMapping("/actual")
	public Forecast getActual(){
		return service.getActualForecast();
	}
}
