package functionalInterface;

import tasksSMMessageList.Action;
import tasksSMMessageList.Members;

import java.lang.reflect.Member;
import java.util.function.*;

//This is anonymous class we don't know name and we wil not use. because of lambda,
// We should new interface, automatically added method but this interface implements anonymous class, er don't know where or what
public class FunctionalInterface {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public boolean test(Members member) {
                return member.getAge() >= 18 && member.getAge() <= 25 && member.getGender() == 'M';
            }
        };
        // READY FUNCTIONAL INTERFACES

        //***********************PREDICATE **************************//

        // in the Predicate interface there is this abstract method
        // boolean test(T t);
        // signature : accepting an object T, it returns boolean
        // when you write your Lambda expression, your Lambda expression signature should be this

        Predicate<Integer> lesserThan = i-> i < 18 ;
                        // lesserThan, this is action behaviour, you can paste this one anywhere you want
        // implementation of the method inside the interface boolean test(T t);
            System.out.println(lesserThan.test(20));

        //***********************CONSUMER **************************//
        // inside there is:
        // void accept (T t);
        //it takes an object, it does not return anything
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        //***********************BI CONSUMER **************************//
        // inside there is:
        // void accept (T t, U u);
        // accepting two object and returns nothing

        BiConsumer<Integer, Integer> addTwo = (x,y) -> System.out.println(x+y);
        //if we have two parameters we need to parentheses is
        addTwo.accept(1,2);
        /*
        When you think this kind of scenario, you always think for Loops, if statement.
        This kind of thinks you thinking, because that is core Java subjects. But they created
        this kind of functional programming, you can basically you don't need to write so many lines code,
        but of course behind the scenario everything is built with this. Those core concept by Java.
         */
        //***********************FUNCTION **************************//
        // inside there is:
        //public interface Function<T, R> // First one is parameter type second one is return type
        // R apply(T t);
        //accepting an object and returns object
        Function<String, String > fun = s-> "Hello " + s;
        System.out.println(fun.apply("Cydeo"));

        //***********************BI FUNCTION **************************//
        /*
        public interface BiFunction<T, U, R> {
        R apply(T t, U u);
        // apply method accepts two parameters T U, and R is return type
         */

        BiFunction<Integer, Integer, Integer> func = (x1, x2)-> x1+x2;
                                        //we don't need to give the type because
        //compiler is looking here, first parameter is integer, second parameter is integer
        //it says i will figure out for you
        System.out.println(func.apply(2, 3));

        //***********************SUPPLIER **************************//
        // IN THE STREAM we are gonna use
        //public interface Supplier<T>
        //    T get();  // does not get any parameter and it returns something

        Supplier<Double> randomValue = () -> Math.random();
        randomValue.get();

    }
}
