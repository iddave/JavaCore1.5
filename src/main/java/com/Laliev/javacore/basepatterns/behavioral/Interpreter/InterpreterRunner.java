package com.Laliev.javacore.basepatterns.behavioral.Interpreter;

public class InterpreterRunner{
    public static void main(String[] args) {

    }

    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("java");
        Expression javacore = new TerminalExpression("javacore");
        return new OrExpression(java, javacore);
    }
    public static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("java");
        Expression spring = new TerminalExpression("spring");
        return new OrExpression(java, spring);
    }
}
