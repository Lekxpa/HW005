public class Main {
    public static void main(String[] args) {
//        Account<Integer> acc1 = new Account<Integer>(1, 5000);
//        Integer a = acc1.getId();
//        System.out.println(a);
//
//        Account acc2 = new Account("Valeri", 5000);
//        System.out.println(acc2.getId());

        Account acc1 = new Account("Valeri", 5000);
        AccountWorker acc2 = new AccountWorker(1, 4000.76);

        String[] people = {"Vova", "Inna", "Olga"};
        Integer[] numbers = {1, 5, 3, 5};
        Printer.<String>print(people);
        Printer.<Integer>print(numbers);
    }
}