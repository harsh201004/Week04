package personalizedmealplangenerator;
import java.util.*;

public class MealUtility {
    public static void displayMeals(List<? extends MealPlan> meals) {
        for (MealPlan meal : meals) {
            System.out.println(meal.getMealDetails());
        }
    }
}
