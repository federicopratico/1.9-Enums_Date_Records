package Level1.Ex2;

public class Task {
    private String name;
    private Level level;

    public Task(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

   public void setLevel(Level level) {
        this.level = level;
   }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", color=" + level.getColor() +
                '}';
    }
}
