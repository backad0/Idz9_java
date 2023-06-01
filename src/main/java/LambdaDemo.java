import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class LambdaDemo {
    public static final Function<String, Integer> getLength = String::length;
    public static final Function<String, Character> getFirstChar = n -> (n == null || n.length() == 0) ? null : n.charAt(0);
    public static final Function<String, Boolean> notHaveSpaces = n -> !n.contains(" ");
    public static final Function<String, Integer> getNumOfWords = n -> n.split(",").length;
    public static final Function<Human, Integer> getAge = Human::getAge;
    public static final BiPredicate<Human,Human> isEqualsSurname = (n,m)->n.getSurname().equals(m.getSurname());
    public static final Function<Human, String> getFullName = n-> n.getSurname() +" "+ n.getName()+" "+n.getPatronymic();
    public static final Function<Human, Human> becameOlder = n ->
            new Human(n.getSurname(), n.getName(), n.getPatronymic(),n.getAge()+1,n.getGender());
    public static final BiPredicate<List<Human>, Integer> isEverybodyYounger = (list, maxAge) -> list.stream().allMatch(n -> n.getAge() < maxAge);
}
