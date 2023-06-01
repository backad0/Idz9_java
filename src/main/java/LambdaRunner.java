import java.util.function.BiPredicate;
import java.util.function.Function;

public class LambdaRunner {
    public static <T, R> R run(Function<T, R> f, T t){
        return f.apply(t);
    }
    public static <T, R> boolean run(BiPredicate<T, R> f, T t, R r){
        return f.test(t, r);
    }
}
