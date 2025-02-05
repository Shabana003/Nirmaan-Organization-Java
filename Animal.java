package InterfaceTask;


public interface Animal {
    String CATEGORY="Living Being";
    
    static boolean isMammal(String name) {
    	if((name.equalsIgnoreCase("Dog"))||(name.equalsIgnoreCase("Cat"))||(name.equalsIgnoreCase("Human"))){
    		return true;
    	}
    	return false;
   
    }
    default void speak() {
    	System.out.println("Animal is making a sound.");
    }
    void move();
}
	
