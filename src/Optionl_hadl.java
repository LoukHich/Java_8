import java.util.Optional;

public class Optionl_hadl {
	
	    public static void main(String[] args)
	    {
	    	
	    	Personne personne = new Personne("Hicham Loukili",null);
	    	Optional<String> email = Optional.ofNullable(personne.getEmail());
	    	System.out.println("NOM: " +personne.getNom()+" Email: "+(email.isPresent()==true?email.get().toUpperCase():"NAN"));
	    	System.out.println("NOM: " +personne.getNom()+" Email: "+email.map(String::toLowerCase).orElse("NAN"));
	    	
            Optional<String> empty = Optional.ofNullable("");//Optional.of("Hello");//Optional.empty();
           // System.out.println(empty);
            //System.out.println(empty.isEmpty());
            System.out.println(empty.isPresent());
            empty.ifPresent(
            	System.out::println);
            empty.ifPresentOrElse(System.out::println,()->System.out.println("COCO"));
            /*String str = empty.map(String::toUpperCase)
            		.orElseThrow(IllegalAccessError::new);*/
            		//.orElse("Hello Nadori");
            		/*.orElseGet(()->{
            			return "Hello Nadori";
            		});*/
           // System.out.println(str);
            
/*
	        // create a Optional
	        Optional<Integer> op
	            = Optional.ofNullable(null);
	  
	        // print value
	        System.out.println("Optional: "
	                           + op);
	  
	        // check for the value
	        System.out.println("Is any value present: "
	                           + op.isPresent());
	  System.out.println("Nadori");
	        /*String[] words = new String[10];
	        String word = words[5].toLowerCase();
	        System.out.print(word);*/
	    }
	}

class Personne {
	
	private String nom ;
	private String email ; 
	
	
   public Personne( String nom ,String email) {
	   this.email = email;
	   this.nom=nom;
   }


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}
	
}
