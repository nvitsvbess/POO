package command; // Línea agregada

import java.util.ArrayList; // Línea agregada
import java.util.List; // Línea agregada

public class Invoker { // Línea agregada
    private final List<Command> commands = new ArrayList<>(); // Línea agregada

    public void addCommand(Command command) { // Línea agregada
        commands.add(command); // Línea agregada
    } // Línea agregada

    public void executeCommands() { // Línea agregada
        for (Command cmd : commands) { // Línea agregada
            cmd.ejecutar(); // Línea agregada
        } // Línea agregada
        commands.clear(); // Línea agregada
    } // Línea agregada
} // Línea agregada
