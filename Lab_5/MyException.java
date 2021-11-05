/**
 * @author Artem Syrotenko
 * @version 1.0
 * Example of a custom exception class
 * To call:
 * " throw new MyException("EXCEPTION TEXT", exVariable); "
 */

public class MyException extends Exception{
    /**
     * Stirng field "variable" 
    */
    private String variable;
    /**
     * Get property for field
     * @return field
     */ 
    public String getVariable(){return variable;}

    /**
     * Get property for field
     * @param message message of an exception / error
     * @param exVariable example of an variable
     */ 
    public MyException(String message, String exVariable){
        super(message);
        variable = exVariable;
    }
}