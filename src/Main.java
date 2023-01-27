public class Main {
    public static void main(String[] args) {
        //задача1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        //задача2
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        //задача3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё','e');
        System.out.println("Данные ФИО сотрудника — " + fullName);

    }
}