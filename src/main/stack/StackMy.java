package main.stack;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackMy {
    public static void main(String[] args) {
        Stack<String> stackm = new Stack<>();
        stackm.push("Elena1");
        stackm.push("Elena2");
        stackm.push("Elena3");
        stackm.push("Elena4");
        System.out.println(stackm.pop());
        System.out.println(stackm.search("Elena3"));
        List<String> list = new Vector<>();
        list.add("sd");
    }
}
