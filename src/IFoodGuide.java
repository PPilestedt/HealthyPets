/**
 * Created by Peter Pilestedt
 * Date: 2020-09-28
 * Time: 10:34
 * Project: HealthyPets
 *
 * IFoodGuide creates the interface for printing a feeding instruction.
 * To implement this interface the object has to have a Name,
 * a food type and amount of food it needs to eat.
 * getFeedingPreference() returns an complete feeding instruction as a String.
 *
 */

public interface IFoodGuide {

    FoodType foodType = FoodType.ORMPELLETS;

    /**
     * @return name of the object implementing IFoodGuide
     */
    String getName();

    /**
     * @return The food type eaten by the object
     */
    String getFoodType();

    /**
     * @return The amount of food the object should eat
     */
    double getFoodAmount();

    /**
     * Constructs a string describing the feeding instruction for the object
     *
     * @return The full feeding instruction for the object
     */
    default String getFeedingPreference(){
        return String.format("%s skall ha %.1f gram %s",getName(), getFoodAmount(),getFoodType());
    }
}
