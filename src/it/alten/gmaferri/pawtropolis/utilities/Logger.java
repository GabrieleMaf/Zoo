package it.alten.gmaferri.pawtropolis.utilities;

import java.util.Objects;

public class Logger {

    private static Logger instance;

    private Logger(){}

    public synchronized Logger getInstance() {
        if (Objects.isNull(instance))
            instance = new Logger();
        return instance;
    }

    public void log(String message){
        System.out.println(message);
    }

    public void err(String message){
        System.err.println(message);
    }
}
