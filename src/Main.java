public class Main {
    public static void main(String[] args) {
        int[] number = {2, 4, 5, 7, 9, 4, 1, 16};
        int[] evenElementInArrays = {2, 4, 5, 7, 9, 4, 1, 16};
        User[] users = new User[4];
        users[0] = new User("Jonny Walker", "1995-12-17");
        users[1] = new User("Andrew", "2001-10-29");
        users[2] = new User("Viktor", "1998-11-09");
        users[3] = new User("Andrew", "2011-05-09");

        System.out.println();
        System.out.print("Массив элементов: ");

        for (int num : number) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.print("Минимальный элемент массива: ");
        WorkingWithArray.getMin(number);

        System.out.println();
        System.out.println();

        System.out.print("Массив элементов: ");

        for (int evenEl : evenElementInArrays) {
            System.out.print(evenEl + " ");
        }

        System.out.println();
        System.out.println("Четные элементы массива: ");
        WorkingWithArray.getEven(evenElementInArrays);

        System.out.println();
        System.out.println();

        System.out.println("Весь массив объектов класса User:");
        WorkingWithArray.showArray(users);

        System.out.println();
        System.out.println("Массив со всеми объектами, после работы метода searchByName:");
        WorkingWithArray.showArray(WorkingWithArray.searchByName(users, "Andrew"));
    }
}
