package personalizedmealplangenerator;
import java.util.*;

//Generic Class

public class Meal<T extends MealPlan> {
    private List<T> mealList = new ArrayList<>();

    public void addMeal(T meal) {
        mealList.add(meal);
    }

    public List<T> getMeals() {
        return mealList;
    }
}
