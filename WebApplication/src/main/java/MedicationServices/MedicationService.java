package MedicationServices;

import Bean.Medication;

public interface MedicationService {

	Medication saveMedication(Medication medication);
	
	Medication getMedicationById(Long id); 
}
