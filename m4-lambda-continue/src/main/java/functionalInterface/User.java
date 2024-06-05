package functionalInterface;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
//@Data // this is covering already @Getter @Setter @ToString
// you can just put Data all the other comes you don't need to @Getter @Setter @ToString
//@AllArgsConstructor
// if there is no any Constructor in your application, @Data is going to create no arg Constructor
// but if you have any Constructors @Data is not going to cretae no arg Constructor for you.
//then is going to create the rest of getter setter to string
// but in the development environment usual's we need to no arg constructor but when we use @Data no constructor is gone
// so we do not use @Data usually

public class User {

    private String firstName;
    private String lastName;
    private int age;


}
