package Level1.Ex2;

public class Main {
    public static void main(String[] args) {
        Task t = new Task("Study", Level.HIGH);
        Task t1 = new Task("Workout", Level.MEDIUM);

        System.out.println(t);
        System.out.println(t1);

        String [] valueOptions  = {"HIGH", "MEDIUM", "Low", "Medium-Low"};

        for(String values : valueOptions) {
            try{
                Level l = Level.valueOf(values);
                System.out.println(l);
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }

    }
}
