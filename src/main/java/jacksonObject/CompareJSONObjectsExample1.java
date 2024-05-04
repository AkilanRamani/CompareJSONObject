package jacksonObject;

import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CompareJSONObjectsExample1 {
	
	 public static void main(String args []) throws JsonProcessingException {  
	      
	        int n = 2;  
	          
	        // create an instance of ObjectMapper class  
	        ObjectMapper mapper = new ObjectMapper();  
	          
	        // create Scanner class object  
	        Scanner sc = new Scanner(System.in);  
	          
	        // create two Student objects  
	        Student std1 = new Student();  
	        Student std2 = new Student();  
	          
	        // use for loop to fill Student ArrayList  
	        for(int i = 0; i < n; i++) {  
	              
	            String id, name, status;  
	            Boolean passed = false, fail = true;  
	              
	            System.out.println("Enter id of "+(i+1)+" Student");  
	            id = sc.nextLine();  
	            System.out.println("Enter name of "+(i+1)+" Student");  
	            name = sc.nextLine();  
	              
	            System.out.println("Is "+name+ " pass in exams(Yes/No)?: ");  
	            status = sc.nextLine();  
	              
	            if(status.equals("Yes")) {  
	                passed = true;  
	            }  
	              
	            if(status.equals("No")) {  
	                fail = false;  
	            }  
	              
	            Student std = new Student(id, name, passed, fail);  // 1 , ak , true , true
	              
	            if(i == 0) {  //0==0
	                std1= std;  
	            }else {  
	                std2= std;  
	            }  
	        }  
	          
	        // close Scanner class object  
	        sc.close();  
	          
	        // serialize std1 and std2 into JSON object  
	        String jsonString1 = mapper.writeValueAsString(std1);  
	        String jsonString2 = mapper.writeValueAsString(std2);  
	          
	        // read jsonString1 and jsonString2 as JsonNode  
	        JsonNode node1 = mapper.readTree(jsonString1); 
	       System.out.println(node1);
	        JsonNode node2 = mapper.readTree(jsonString2);  
		       System.out.println(node2);

	          
	        // compare JSON Objects by using equals method of JsonNode  
	        if(node1.equals(node2)) {  
	            System.out.println("Both JSON Objects are identical.");  
	        }else {  
	            System.out.println("Both JSON Objects are not identical.");  
	        }  
	          
	    }  
	
	

}
