import java.util.Collection;

class Funs {
    public static void meowsCare(Collection<Meowable> meowables) {
        for (Meowable meowable : meowables) {
            meowable.meow();
        }
    }
}