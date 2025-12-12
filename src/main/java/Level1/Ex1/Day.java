package Level1.Ex1;

public enum Day {
    MONDAY(1),
    TUSDAY(2),
    WDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int integer;

    private Day(int i) {
        this.integer = i;
    }

    public int getInteger() {
        return integer;
    }
}
