/**
 * Created by Peter Pilestedt
 * Date: 2020-09-28
 * Time: 10:34
 * Project: HealthyPets
 *
 * Dog class defines a dog.
 *
 */

public class Dog extends Animal{

    Inlämningsuppgift1.FoodType foodType = Inlämningsuppgift1.FoodType.HUNDFODER;

    /**
     * Constructor setting the name and weight of the Dog
     *
     * @param name Name of the dog
     * @param weight Weight of the dog
     */
    public Dog(String name, double weight){
        super(name,weight);
    }

    @Override
    public String getFoodType() {
        return foodType.toString();
    }

    /**
     * @return returns the amount of food needed by the dog
     */
    @Override
    public double getFoodAmount() {
        return (weight * 1000) / 100;
    }
}
