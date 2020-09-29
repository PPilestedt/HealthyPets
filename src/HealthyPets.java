import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peter Pilestedt
 * Date: 2020-09-28
 * Time: 10:34
 * Project: HealthyPets
 *
 * HealthyPets is a tool that calculates and generates a complete feeding instruction
 * for several different type of animals.
 *
 */

public class HealthyPets {

    /**
     * Constructor that creates an list of animals and
     * starts the main program loop.
     */
    public HealthyPets(){

        List<Animal> animalList = new ArrayList<Animal>();

        animalList.add(new Dog("Sixten",5.0));
        animalList.add(new Dog("Dogge",10.0));
        animalList.add(new Cat("Venus",5.0));
        animalList.add(new Cat("Ove",3.0));
        animalList.add(new Snake("Hypno",1.0));

        programLoop(animalList);
    }

    /**
     * Main program loop
     *
     * @param animalList List of Animal objects
     */
    private void programLoop(List<Animal> animalList){

        while(true) {
            String search = HPUtils.getInput();
            if(search == null)
                break;

            for (Animal animal : animalList) {
                if (animal.getName().equalsIgnoreCase(search)) {
                    HPUtils.printFoodGuide(animal);
                }
            }
        }
    }

    public static void main(String[] args) {

        HealthyPets hp = new HealthyPets();
    }
}
