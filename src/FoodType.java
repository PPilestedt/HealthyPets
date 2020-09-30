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
