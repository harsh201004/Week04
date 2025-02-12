package personalizedmealplangenerator;

public class MealPlanGeneratorMain {
    public static void main(String[] args) {
        Meal<VegeterianMeal> vegeterianMeals = new Meal<>();
        vegeterianMeals.addMeal(new VegeterianMeal("Paneer Masala"));
        vegeterianMeals.addMeal(new VegeterianMeal("Chhole Kulche"));

        Meal<VeganMeal> veganMeal = new Meal<>();
        veganMeal.addMeal(new VeganMeal("Lentil Soup"));
        veganMeal.addMeal(new VeganMeal("Chickpea Salad"));

        System.out.println("Vegetarian Meals:");
        MealUtility.displayMeals(vegeterianMeals.getMeals());
        System.out.println("----------------");

        System.out.println("Vegan Meals:");
        MealUtility.displayMeals(veganMeal.getMeals());
        System.out.println("----------------");


    }
}
