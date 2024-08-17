import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIrcons.Actions.Execute"/> icon in the gutter.
public class PracticeSet01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,22);
        list.stream().filter(i -> i%2==0).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-----------------------");
        list.stream().filter(i -> i%2 !=0).collect(Collectors.toList()).forEach(System.out::println);



    }
}