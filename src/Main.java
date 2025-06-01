//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задание
        //Напишите небольшой библиотечный справочник, где хранится информация о книгах.

        //Создайте класс Book, который будет содержать в себе данные о названии, авторе и годе публикации книги. Убедитесь, что типы полей класса Book выбраны правильно: это
        //String, Author и int.
        //Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
        //Напишите конструкторы для обоих классов, заполняющие все поля.
        //Создайте геттеры для всех полей автора и всех полей книги.
        //Создайте сеттер для поля «Год публикации» у книги.
        //В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их. Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
        //Метод main не должен находиться в классах Book и Author.
        //
        //Создайте отдельный класс для запуска приложения и объявите метод main в нем.
        //В том же методе main измените год публикации одной из книг с помощью сеттера.
        //Теперь, когда вы изучили геттеры и сеттеры, не оставляйте поля открытыми — то есть без модификатора доступа private.

        Author pushkin = new Author("Alexandr", "Pushkin");
        Author tolstoy = new Author("Lev", "Tolstoy");
        Author test = new Author("Alexandr", "Pushkin");
        Book captainsDaughter = new Book("CaptainsDaughter", pushkin, 1836);
        Book warAndPeace = new Book("WarAndPeace", tolstoy, 1867);
        Book test1 = new Book("WarAndPeace", tolstoy, 1867);
        System.out.println("warAndPeace.getYear() = " + warAndPeace.getYear());
        //warAndPeace.setYear(1900);
        System.out.println("warAndPeace.getYear() = " + warAndPeace.getYear());

        //Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
        //Обратите внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать (вызывать) его версию метода.

        System.out.println(captainsDaughter);
        System.out.println(warAndPeace);
        System.out.println(captainsDaughter.equals(warAndPeace));
        System.out.println(pushkin.equals(tolstoy));
        System.out.println(pushkin.equals(test));
        System.out.println(warAndPeace.equals(test1));
        System.out.println(warAndPeace.hashCode());
    }
}