/**
 * Created by Peter Pilestedt
 * Date: 2020-09-28
 * Time: 10:34
 * Project: HealthyPets
 * <p>
 * Enum defining different types of animal food
 */


public enum FoodType {
    DJURMAT("djurmat"),
    HUNDFODER("hundfoder"),
    KATTFODER("kattfoder"),
    ORMPELLETS("ormpellets");

    private String name;

    FoodType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
