package personalizedmealplangenerator;

//Concrete Class Vegan Meal
public class VeganMeal implements MealPlan {
    private String mealDetails;

    public VeganMeal(String mealDetails) {
        this.mealDetails = mealDetails;
    }

    @Override
    public String getMealDetails() {
        return mealDetails;
    }
}
