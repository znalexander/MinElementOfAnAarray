import java.util.ArrayList;

public class WorkingWithArray {

    public static void getMin(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        System.out.print(array[minIndex]);
    }

    public static void getEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void showArray(User[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("Имя(Name): " + inputArray[i].getName() + ", День рождения(BirthDate): " + inputArray[i].getBirthDate());
        }
    }

    public static User[] searchByName(User[] inputArray, String name) {
        ArrayList<User> newUsers = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (name.equals(inputArray[i].getName())) {
                newUsers.add(inputArray[i]);
            }
        }

        return newUsers.toArray(new User[newUsers.size()]);
    }
}
