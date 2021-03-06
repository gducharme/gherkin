package gherkin.parser;

import gherkin.Lexer;
import gherkin.Listener;
import gherkin.lexer.EN;
import gherkin.util.FixJava;

import java.util.ArrayList;
import java.util.List;

public class StateMachineReader implements Listener {
    private final String machinePath;
    private List<List<String>> transitionTable;

    public StateMachineReader(String name) {
        machinePath = "/gherkin/parser/" + name + ".txt";
    }

    public List<List<String>> transitionTable() {
        transitionTable = new ArrayList<List<String>>();
        Lexer lexer = new EN(this);
        lexer.scan(FixJava.readResource(machinePath));
        return transitionTable;
    }

    public void tag(String tag, int line) {
    }

    public void comment(String comment, int line) {
    }

    public void feature(String keyword, String name, String description, int line) {
    }

    public void background(String keyword, String name, String description, int line) {
    }

    public void scenario(String keyword, String name, String description, int line) {
    }

    public void scenarioOutline(String keyword, String name, String description, int line) {
    }

    public void examples(String keyword, String name, String description, int line) {
    }

    public void step(String keyword, String name, int line) {
    }

    public void pyString(String string, int line) {
    }

    public void eof() {
    }

    public void syntaxError(String state, String event, List<String> legalEvents, String uri, int line) {
    }

    public void row(List<String> cells, int line) {
        transitionTable.add(cells);
    }
}
