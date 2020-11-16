
package com.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.ElectricityMeter;

@RestController
@RequestMapping("/totalbill")
public class ElectricityController{

	@RequestMapping(value="/{initialReading}/{monthReading}", method=RequestMethod.GET)
	public String ElectricityBill(@PathVariable double initialReading, @PathVariable double monthReading) {
		ElectricityMeter em = new ElectricityMeter(initialReading, monthReading);
		em.setTotalBill((em.getMonthReading()-em.getInitialReading())*ElectricityMeter.COST_PER_UNIT);
		return "Total Bill is Rs. "+em.getTotalBill();
	}
}




