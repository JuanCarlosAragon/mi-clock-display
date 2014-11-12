
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
        private int display;
        private int displayLimit;
        
    public NumberDisplay (int limit)
    {
        display = 0;
        displayLimit = limit;
    }
    public void setValue (int value)
    {
        display = value;
    }
    public String getDisplayValue()
    {
        String displayValue;
        displayValue = "0" + display;
        
        return displayValue;
        
    }
    public int getValue()
    {
        int value;
        value = display;
        return value;
    }
    public void increment ()
    {
    if (display >= displayLimit) 
    {
        display = 0;
    }
    else 
    {
        display = display + 1;
    }
    }
}
