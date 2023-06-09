package capitulo09;


import java.util.logging.Level;
import java.util.logging.Logger;

public class testeDeLog {

    private static Logger log;
    
    public static void main(String[] args ) {
        log = Logger.getLogger(testeDeLog.class.getName());
        log.log(Level.WARNING, "Hello people");
        log.log(Level.INFO, "Nice Day");
    }
} 
