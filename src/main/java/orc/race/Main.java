package orc.race;

import javax.script.*;

public class Main {

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        Compilable engine = (Compilable) manager.getEngineByName("orc");
        CompiledScript script = null;
        try {
            script = engine.compile("1 + 2");
        } catch (ScriptException e) {
            e.printStackTrace();
            System.exit(1);
        }
        try {
            script.eval();
            script.eval();
        } catch (ScriptException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
