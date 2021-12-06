package builder;

import java.util.List;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

@Builder @ToString
public class User {
    private String firstName;
    private String lastName;
    @Singular
    private List<String> occupations;
    private String gender;
    private int age;
    private int weight;
}
