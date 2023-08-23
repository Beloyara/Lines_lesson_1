public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задача из видео
        String phone = "+960-415 75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = "7" + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        }else  if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех!");
        }else {
            System.out.println("Неудача");
        }
        System.out.println();

        // Первая задача
        System.out.println("Первая задача");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();

        //Вторая задача
        System.out.println("Вторая задача");

        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);
        System.out.println();

        //Третья задача
        System.out.println("Третья задача");
        fullName = "Иванов Семён Семёнович";
        String fullNameNew = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullNameNew);

    }
}