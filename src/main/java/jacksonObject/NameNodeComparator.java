package jacksonObject;

import java.util.Comparator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.TextNode;

public class NameNodeComparator  implements Comparator<JsonNode>   
{  
    // override compare() method of Comparator class  
    @Override  
    public int compare(JsonNode node1, JsonNode node2)  
    {  
        // compare node1 and node2 by using equals() method  
        if (node1.equals(node2)){  
            return 0;  
        }  
       
        // check whether node1 and node2 is of type TextNode   
        if ((node1 instanceof TextNode) && (node2 instanceof TextNode)){  
           
            // get JsonNode value as String  
            String value1 = ((TextNode) node1).asText();  
            String value2 = ((TextNode) node2).asText();   
           
            // use compareTo() method to compare values  
            if (value1.equalsIgnoreCase(value2)) {  
                return 0;  
            }  
        }  
        return 1;  
    }   

	

}
