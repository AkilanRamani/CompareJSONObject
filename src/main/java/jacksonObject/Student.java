package jacksonObject;

public class Student {
	   private String stdId;  
	    private String stdName;  
	    private Boolean passed;  
	    private Boolean fail;  
	      
	    public Student() {  
	        this.stdId = null;  
	        this.stdName = null;  
	        this.passed = null;  
	        this.fail = null;  
	    }  
	  
	    public Student(String stdId, String stdName, Boolean passed, Boolean fail) {  
	        this.stdId = stdId;  
	        this.stdName = stdName;  
	        this.passed = passed;  
	        this.fail = fail;  
	    }  
	  
	    public String getStdId() {  
	        return stdId;  
	    }  
	  
	    public String getStdName() {  
	        return stdName;  
	    }  
	  
	    public Boolean getPassed() {  
	        return passed;  
	    }  
	  
	    public Boolean getFail() {  
	        return fail;  
	    }  
	  

}
