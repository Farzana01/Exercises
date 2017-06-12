package Encapsulation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetCenter {
	
	//VirtualPets by name
	//Map is the general type (its an interface)
	//HashMap is the specific(concrete) type
	private Map<String, VirtualPet> petsByName = new HashMap<String, VirtualPet>();  
	
	public Collection<VirtualPet> pets() {
		return petsByName.values();
		
	}
	
    public VirtualPet getPet(String name) {
    	return petsByName.get(name);
    }

// add pets to the shelter
    public void intake(VirtualPet pet) {
       	petsByName.put(pet.getName(), pet);
    }

// remove pets from the shelter
    public void adopt(VirtualPet pet) {
        VirtualPet thePetIJustRemoved= petsByName.remove(pet.getName());
    }
    	
    public void feedpets() {
    	
    	for(VirtualPet pet: petsByName.values()) { // remember, pets() returns petsByName.values
    		pet.feed();
    	}
     // water is same as feed
    	
   // if we play with the pets 	
    
    	public void playWith(String name) {
    	// same as petsByName.get(name).play();
    	getPet(name).play();
    	
    	}
    	
    	public void tick() {
    		for (VirtualPet pet: petsByName.values()) {
    		 pet.tick();
    		 
    		}
    		 
    	}
    
    }









}



