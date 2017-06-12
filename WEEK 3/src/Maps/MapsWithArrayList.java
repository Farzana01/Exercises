package Maps;

//import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsWithArrayList {

	public static void main(String[] args) {

		
		
	    ArrayList<String> pclothes = new ArrayList<String>();
		pclothes.add("saree");
		pclothes.add("kameez");
		pclothes.add("tops");
		System.out.println(pclothes);
		
		ArrayList<String> aclothes = new ArrayList<String>();
		aclothes.add("shirt");
		aclothes.add("pants");
		aclothes.add("suits");
		System.out.println(aclothes);	
		
		ArrayList<String> zclothes = new ArrayList<String>();
		zclothes.add("socks");
		zclothes.add("shoes");
		zclothes.add("shorts");
		System.out.println(zclothes);
		
		Map<String, ArrayList<String>> hussainF= new HashMap <String, ArrayList<String>>();
		hussainF.put("peony",pclothes);
	    hussainF.put("arman",aclothes);
	    hussainF.put("zakaria", zclothes);
	    
	    System.out.println(hussainF.get("peony"));// print peony(key) elements
	    System.out.println(hussainF.get("zakaria"));
	    System.out.println(hussainF.get("arman")); 
	  //  hussainF.replace("peony", pclothes, aclothes);
	    System.out.println(hussainF.get("peony"));
	    
// return of Collection of all the clothes	   
	    Collection<ArrayList<String>> values = hussainF.values(); // create collection
		 System.out.println(values);// print all items
		 
		 Set<String> keys = hussainF.keySet();
		 for (String key:keys) {
		 System.out.println(key + "->" + hussainF.get(key));
		 } 
		 
		 
	    
	    
		}

}
