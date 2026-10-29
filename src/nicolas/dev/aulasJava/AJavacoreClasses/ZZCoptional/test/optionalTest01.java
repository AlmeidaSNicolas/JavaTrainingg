package nicolas.dev.aulasJava.AJavacoreClasses.ZZCoptional.test;

import java.util.List;
import java.util.Optional;

public class optionalTest01 {
    public static void main(String[] args) {

        Optional<Integer> nums = Optional.ofNullable(null);
        Integer orElse = nums.orElse(12);
        System.out.println(orElse);

        Optional<String> names = Optional.ofNullable(null);
        System.out.println(names);

        Optional<String> nameOptional = Optional.ofNullable(findName("icolas"));
        String empty = nameOptional.orElse("empty");
        System.out.println(empty);

    }

    private static String findName(String name){
        List<String> strings = List.of("Nicolas", "Pedeo", "Heitor");
        int i = strings.indexOf(name);
        if (i >= 0){
            return strings.get(i);
        }
        return null;
    }
}
