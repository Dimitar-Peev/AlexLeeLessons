import java.util.ArrayList;

public class Demo_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruitList = new ArrayList<>();

        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Watermelon");

        fruitList.remove("Strawberry");
//      fruitList.clear();
        System.out.println(fruitList.contains("Raspberry"));

        System.out.println(fruitList);
    }
}
