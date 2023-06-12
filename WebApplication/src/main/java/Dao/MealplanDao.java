package Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Bean.MealPlan;

@Repository
public interface MealplanDao extends JpaRepository< MealPlan, Long >{

}
