public class Main {
    public static void main(String[] args) {
        Author shield = new Author("Herbert","Shield");
        Book java = new Book("Java. The Complete Reference, 12th edition",shield,2021);
        Author martin = new Author("Robert","Martin");
        Book cleanCode = new Book("Clean code",martin,2023);
        System.out.println(java.getYearOfPublication());
        java.setYearOfPublication(2023);
        System.out.println(java.getYearOfPublication());
    }
}