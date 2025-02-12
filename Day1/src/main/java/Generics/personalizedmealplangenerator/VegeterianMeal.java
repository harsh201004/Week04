package personalizedmealplangenerator;

//Concrete Class Vegeterian Meal
public class VegeterianMeal implements MealPlan {
    private String mealDetails;

    public VegeterianMeal(String mealDetails) {
        this.mealDetails = mealDetails;
    }

    @Override
    public String getMealDetails() {
        return mealDetails;
    }
}
