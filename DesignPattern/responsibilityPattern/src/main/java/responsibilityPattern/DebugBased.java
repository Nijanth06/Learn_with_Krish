package responsibilityPattern;

public class DebugBased extends Logger{
	public DebugBased(int levels) {  
        this.levels=levels;  
    }  
    @Override  
    protected void displayLogInfo(String msg) {  
        System.out.println("DEBUG LOGGER INFO: "+msg);  
    }  

}
