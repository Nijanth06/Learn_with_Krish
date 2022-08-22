package responsibilityPattern;

public class ConsoleBased extends Logger {
	 public ConsoleBased(int levels) {  
	        this.levels=levels;  
	    }  
	    @Override  
	    protected void displayLogInfo(String msg) {  
	        System.out.println("CONSOLE LOGGER INFO: "+msg);  
	    }  

}
