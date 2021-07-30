package com.erouteJavaCaseStudy.erouteJavaStudy.erouteService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.erouteJavaCaseStudy.erouteJavaStudy.erouteModel.Biller;

@Service
public class ErouteService {

	public static List<Biller> billerList(){
		
		List<Biller> billerDetails=Arrays.asList(new Biller("ACT000000NAT01","ACT Fibernet","TestDesc 1",1500,"ACT000000NAT011","NOT_SUPPORTED","Broadband Prepaid",1,"Exact"),
												new Biller("ACT000000NAT02","Airtel BroadBand","TestDesc 2",1434,"ACT000000NAT012","SUPPORTED","Broadband Prepaid",11,"Not_Exact"),
												new Biller("ACT000000NAT03","Airtel Pospaid","TestDesc 3",1350,"ACT000000NAT013","SUPPORTED","Broadband Postpaid",13,"Exact"),
												new Biller("ACT000000NAT04","ACT Fibernet","TestDesc 4",1760,"ACT000000NAT014","NOT_SUPPORTED","Broadband Prepaid",14,"Not_Exact"),
												new Biller("ACT000000NAT05","Airtel Pospaid","TestDesc 5",1120,"ACT000000NAT015","NOT_SUPPORTED","Broadband Postpaid",17,"Exact"),
												new Biller("ACT000000NAT06","Airtel BroadBand","TestDesc 6",1760,"ACT000000NAT016","NOT_SUPPORTED","Broadband Postpaid",18,"Not_Exact"),
												new Biller("ACT000000NAT07","Jio Fiber","TestDesc 7",1450,"ACT000000NAT017","SUPPORTED","Broadband Postpaid",21,"Exact"),
												new Biller("ACT000000NAT08","Jio Fiber","TestDesc 8",1770,"ACT000000NAT018","SUPPORTED","Broadband Prepaid",31,"Exact"),
												new Biller("ACT000000NAT09","Exitel Fibernet","TestDesc 9",1990,"ACT000000NAT019","NOT_SUPPORTED","Broadband Postpaid",19,"Exact"),
												new Biller("ACT000000NAT10","Exitel Fibernet","TestDesc 10",1460,"ACT000000NAT020","NOT_SUPPORTED","Broadband prepaid",16,"Not_Exact"));
		return billerDetails;
	}
	
	public List<Biller> getBillerByName(String billerName) {
		List<Biller> billerList= ErouteService.billerList();
	    return billerList.stream().filter(bil->bil.getBillerName().equals(billerName)).collect(Collectors.toList());
	    
	}
}
