package tasksSMMessageList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Members> allMembers = new ArrayList<>();
        allMembers.add(new Members('M', 19));
        allMembers.add(new Members('F', 20));
        allMembers.add(new Members('F', 23));
        allMembers.add(new Members('M', 24));
        allMembers.add(new Members('M', 17));

        Action p = member ->  member.getAge() >= 18 && member.getAge() <= 25 && member.getGender() == 'M';
    anyAction(allMembers, p);
    }

    private static void anyAction(List<Members> members, Action p ) {
        List<Members> messageList = new ArrayList<>();
        for (Members member : members) {
            if(p.test(member)) {
                messageList.add(member);
            }
        }

        System.out.println("Message List " );
        System.out.println(messageList);
    }
}
