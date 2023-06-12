package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Bean.Medication;
import MedicationServices.MedicationService;

@RestController
@RequestMapping("/medication")
public class MedicationController {
	
	@Autowired
	private MedicationService medicationservice;
	
	@PostMapping("/addmed")
	public ResponseEntity<String> addmedication(@RequestBody Medication m)
	{
		medicationservice.saveMedication(m);
		return new ResponseEntity<String>("Medication Data Added Successfully !", HttpStatus.CREATED);
	}
	
	@GetMapping("/find")
	public ResponseEntity<Medication> getMedication(@PathVariable Long id)
	{
		Medication med=medicationservice.getMedicationById(id);
		if(med!=null) {
			return new ResponseEntity<>(med,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
