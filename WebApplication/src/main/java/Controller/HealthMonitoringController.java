package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Bean.HealthMonitoring;
import HealthMonitoringServices.HealthMonitoringService;

@RestController
@RequestMapping("/healthmonitoring")
public class HealthMonitoringController {

	@Autowired
	private HealthMonitoringService healtmonitoringservice;
	
	@PostMapping("/add")
	public ResponseEntity<String>addhealth(@RequestBody HealthMonitoring h)
	{
		healtmonitoringservice.saveHealthMonitoring(h);
		return new ResponseEntity<String>("Health Data Added Successfully !", HttpStatus.CREATED);
	}

}
