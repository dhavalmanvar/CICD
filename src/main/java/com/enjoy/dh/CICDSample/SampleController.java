package com.enjoy.dh.CICDSample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@RequestMapping("/")
	public String getVersion() {
		return "Sample Application v1.0";
	}

}
