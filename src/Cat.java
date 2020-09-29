/**
 * Created by Peter Pilestedt
 * Date: 2020-09-28
 * Time: 10:34
 * Project: HealthyPets
 *
 * Cat class defines a cat.
 *
 */

public class Cat extends Animal {

    Inlämningsuppgift1.FoodType foodType = Inlämningsuppgift1.FoodType.KATTFODER;

    /**
     * Construcotr for the Cat
     *
     * @param name Name of the Cat
     * @param weight Weight of the Cat
     */
    public Cat(String name, double weight){
        super(name,weight);
    }

    @Override
    public String getFoodType() {
        return foodType.toString();
    }

    /**
     * @return The amount of food eaten by the cat
     */
    @Override
    public double getFoodAmount() {
        return (weight * 1000) / 150;
    }
}
