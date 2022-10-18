import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Farm [] farms = {new Farm("Prostokvashino", 5, 2, 3, "Oleg")};
       Animal [] animals ={
               new Cow("masha", 5, "female", "krasotka"),
               new Cow("Zita", 5, "female", "Gi"),
               new Cow("Gita", 5, "female", "Zi"),
               new Cow("lera", 5, "female", "le"),
               new Cow("tanya", 5, "female", "ta"),
               new Horse("Tulpar", 5, "male", "Kula"),
               new Horse("Jorgo", 8, "male", "Kerkashka"),
               };
        System.out.println(Arrays.toString(farms));
        System.out.println(Arrays.toString(animals));

        Farm [] farm1 ={ new Farm("Vkus prirody", 5, 2,3, "Michael")};
        Animal [] animals1 ={
                new Cow("masha", 5, "female", "krasotka"),
                new Horse("Tulpar", 5, "male", "Kula")};

        System.out.println(Arrays.toString(farm1));
        System.out.println(Arrays.toString(animals1));
                   }
                }

