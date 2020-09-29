/**
 * Created by Peter Pilestedt
 * Date: 2020-09-28
 * Time: 10:34
 * Project: HealthyPets
 *
 * Snake class defines a snake.
 *
 */

public class Snake extends Animal {

    Inlämningsuppgift1.FoodType foodType = Inlämningsuppgift1.FoodType.ORMPELLETS;

    /**
     * Constructor for a snake object
     *
     * @param name Name of the snake
     * @param weight Weight of the snake
     */
    public Snake(String name, double weight){
        super(name,weight);
    }

    @Override
    public String getFoodType() {
        return foodType.toString();
    }

    /**
     * @return The food ammount eaten by the snake
     */
    @Override
    public double getFoodAmount() {
        return 20;
    }
}
