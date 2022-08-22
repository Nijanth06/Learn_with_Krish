package responsibilityPattern;

public class ErrorBased extends Logger{
	public ErrorBased(int levels) {  
        this.levels=levels;  
    }  
    @Override  
    protected void displayLogInfo(String msg) {  
        System.out.println("ERROR LOGGER INFO: "+msg);  
    }  

}
