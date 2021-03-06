package com.sunsoft;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller()
public class InsuranceController {
	
	private static ArrayList<InsuranceDomain> arr = new ArrayList<InsuranceDomain>();
	
	@RequestMapping("/add")
	public String addUserController(HttpServletRequest request,HttpServletResponse response,Model m) {
		String policyNumber = request.getParameter("policyNumber");
		String name = request.getParameter("name");
		String tenure = request.getParameter("tenure");
		String amount = request.getParameter("amount");
		InsuranceDomain ins = new InsuranceDomain(name, Integer.parseInt(amount), Integer.parseInt(policyNumber), Integer.parseInt(tenure));
		arr.add(ins);
		return "add";
	}
	
	@RequestMapping("/displaypolicies")
	public String newController(Model m) {
		String policies = "";
		for(InsuranceDomain t: arr) {
			policies+=(t.toString()+"\n");
		}
		m.addAttribute("policies",policies);
		return "view";
	}
}
