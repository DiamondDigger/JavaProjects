package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("John", "Smith");

        em1.setAlternateEmail("gary@gmail.com");
        System.out.println(em1.getAlternateEmail());
        em1.changePassword("sdfsdsds!@#$!@5132415136sadff13");
        System.out.println(em1.getPassword());
    }
}


