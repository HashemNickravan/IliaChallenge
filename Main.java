import information.Intern;

public class Main {
    public static void main(String[] args) {
        Intern intern = new Intern("EPFL", 112590, "Iliya Asadi", "iliya70594@gmail.com", "Iran", "Computer Science", "Machine Learning", 1);
        intern.showDetails();

        try {
            intern.setNationalID(2547);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            intern.setFullName("iliya");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            intern.setEmail("iliyaasd84128.gmail.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            intern.setInternID(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        intern.showDetails();
    }
}