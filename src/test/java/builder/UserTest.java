package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;

    @Test
    void builder() {
        user = User.builder()
            .firstName("Ostap")
            .lastName("Trush")
            .gender("male")
            .age(18)
            .occupation("Student")
            .occupation("Beginner Game Dev")
            .weight(80)
            .build();

        assertEquals("User(firstName=Ostap, lastName=Trush, occupations=[Student, Beginner Game Dev], gender=male, age=18, weight=80)", user.toString());
    }
}