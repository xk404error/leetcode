package normal;


import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

public class ParentImpl extends AbstractParent {
    public static void main(String[] args) {
        Integer planId = new Integer(1056);
        Object[] argArray={"field"+planId};
        String message = MessageFormatter.arrayFormat("crms.loanapply.creditPrescription.{}", argArray).getMessage();
        System.out.println(message);


    }

}
