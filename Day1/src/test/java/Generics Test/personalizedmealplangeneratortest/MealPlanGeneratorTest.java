//Test

package personalizedmealplangeneratortest;

import org.junit.Assert;
import org.junit.Test;
import personalizedmealplangenerator.VegeterianMeal;
import personalizedmealplangenerator.VeganMeal;
import personalizedmealplangenerator.Meal;

public class MealPlanGeneratorTest {
    @Test
    public void test1() {
        //Test for Vegeterian Meal
        Meal<VegeterianMeal> vegeterianMeal = new Meal<>();
        VegeterianMeal meal1 = new VegeterianMeal("Paneer Tikka");
        vegeterianMeal.addMeal(meal1);
        Assert.assertEquals(1, vegeterianMeal.getMeals().size());
    }

    @Test
    public void test2() {
        //Test for Vegan Meal
        Meal<VeganMeal> veganMeal = new Meal<>();
        VeganMeal meal1 = new VeganMeal("Chickpea Salad");
        veganMeal.addMeal(meal1);
        Assert.assertEquals("Chickpea Salad", veganMeal.getMeals().get(0).getMealDetails());
    }
}
