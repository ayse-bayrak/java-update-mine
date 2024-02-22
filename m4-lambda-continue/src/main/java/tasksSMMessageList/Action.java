package tasksSMMessageList;

@FunctionalInterface
public interface Action {
    boolean test(Members member);
}
