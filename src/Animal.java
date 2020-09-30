/**
 * Created by Peter Pilestedt
 * Date: 2020-09-28
 * Time: 10:34
 * Project: HealthyPets
 * <p>
 * Abstract class Animal defines an animal.
 */

public abstract class Animal implements IFoodGuide {

    protected String name;
    protected double weight;

    /**
     * Constructor that sets the name and weight of the animal
     *
     * @param name   Name of the animal
     * @param weight Weight of the animal
     */
    public Animal(String name, double weight) {
        setName(name);
        setWeight(weight);
    }

    /**
     * @return Name of the animal
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Name of the animal
     */
    public void setName(String name) {
        if (name != null)
            this.name = name;
        else
            throw new IllegalArgumentException();
    }

    /**
     * @return Weight of the animal
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight Weight of the animal
     */
    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
        else
            throw new IllegalArgumentException();
    }

}
