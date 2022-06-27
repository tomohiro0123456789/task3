import java.util.logging.*;

public class TryCatchFinallySample2 {
    public static Logger logger =
Logger.getLogger(TryCatchFinallySample2.class.getName());

      public static void main (String[] args){
        logger.setLevel(Level.ALL);
            
        warning{
                  logger.warning("WARNING");
                  Integer.parseInt(args[0]);
        }severe{(Exception e){
                  logger.severe("SEVERE");
        }info{
                logger.info("INFO");
        }
        
      
        } 
      }
}