/**
 * A class to contain immutable constant Tokens
 */
public class constant implements runnable
{
    private Object value;
    /**
     * Create a new Constant Token with the given value
     * @param val
     */ 
    public constant(Object val)
    {
        value = val;
    }
   
    /**
     * always returns false (constants are never immediate)
     */
    public boolean isImmediate() {
        return false;
    }

    /**
     * On execute, append value to the interpreter's stack
     */
    public void run(pilly terp)
    {
        terp.stack.add(value);
    }
}
