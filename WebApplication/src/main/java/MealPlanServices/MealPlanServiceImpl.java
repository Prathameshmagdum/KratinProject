package MealPlanServices;

import Bean.MealPlan;
import Dao.MealplanDao;

public class MealPlanServiceImpl implements MealPlanService{
	private MealplanDao mealdao;

	@Override
	public MealPlan saveMealPlan(MealPlan mealplan) {
		
		return mealdao.save(mealplan);
	}

}
