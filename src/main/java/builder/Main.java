package builder;

public class Main {
    public static void main(String[] args) {

        User user = User.builder()
                .firstName("Ostap")
                .lastName("Trush")
                .gender("male")
                .age(18)
                .occupation("Student")
                .occupation("Beginner Game Dev")
                .weight(80)
                .build();

        System.out.println(user.toString());
    }
}
