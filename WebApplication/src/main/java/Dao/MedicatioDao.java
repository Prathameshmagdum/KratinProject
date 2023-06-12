package Dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Bean.Medication;

@Repository
public interface MedicatioDao extends JpaRepository<Medication,Long > {

}
