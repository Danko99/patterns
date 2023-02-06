package behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

public class InterpeterRunner {
    public static void main(String[] args) {
//        Expression isJava = getJavaExpression();
//        Expression isJavaEEDeveloper = getJavaEEExpression();
//
//        System.out.println("Does developer know Java Core? " +isJava.interpret("Java Core"));
//
//        System.out.println("Does developer know Java EE? " +isJavaEEDeveloper.interpret("Java Spring"));

        List<AndExpression> andExpressionList = new ArrayList<>();
        andExpressionList.add(new AndExpression(null,null));
        System.out.println(andExpressionList);




    }
    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");
        return new OrExpression(java,javaCore);
    }

    public static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");
        return new AndExpression(java,spring);
    }
}
