package com.erouteJavaCaseStudy.erouteJavaStudy.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.erouteJavaCaseStudy.erouteJavaStudy.erouteModel.Biller;
import com.erouteJavaCaseStudy.erouteJavaStudy.erouteService.ErouteService;

@RestController
public class ErouteController {

	@Autowired
	private ErouteService erouteService;
	
	@GetMapping("/bbps/getBillers/{billerName}")
	public List<Biller> getBiller(@PathVariable String billerName) {
		return erouteService.getBillerByName(billerName);
	}
	
}
