package MedicationServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Bean.Medication;
import Dao.MedicatioDao;

@Service
public class MedicationSeviceImpl implements MedicationService{
	
	@Autowired
	private MedicatioDao medicationdao;

	@Override
	public Medication saveMedication(Medication medication) {

		return medicationdao.save(medication);
	}

	@Override
	public Medication getMedicationById(Long id) {
		
		return medicationdao.findById(id).orElse(null);
	}

	
}
