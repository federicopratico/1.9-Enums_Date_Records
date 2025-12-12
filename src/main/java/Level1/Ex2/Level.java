package Level1.Ex2;

public enum Level {
    LOW(1, "Green"),
    MEDIUM(2, "Yellow"),
    HIGH(3, "Red");

    private final int integer;
    private final String color;

    Level(int integer, String color) {
        this.integer = integer;
        this.color = color;
    }

    public int getInteger() {
        return integer;
    }

    public String  getColor() {
        return color;
    }
}
