import java.util.*;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main2 {
       //   private static Main2 instance = null;	
	    private  List<Client> clients ; //private final List<String> villes ;
	   
	    static void printMe(Integer i) {
	    System.out.println("Integer");
	    }
	    static void printMe(double d) {
	    System.out.println("double");
	    }
      //n getByType(type: string): Array<Object>	
	private Main2() {
		String [] v1 = {"Marseille","Lyon", "Paris","Nador"};
		String [] v2 = {"Paris"};
		String [] v3 = {"Nantes","Lyon", "Lille","Nice"};
		String [] v4 = {"Paris","Nantes"};
		String [] v5 = {"Marseille","Lyon", "Montpellier"};
		String [] v6 = {"Marseille","Nice ", "Montpellier"};
		Client c1 = new Client(Type.USER,"Max Mustermann", 25, new ArrayList<>(Arrays.asList(v1)));
		Client c2 = new Client(Type.ADMIN,"John Wick", 45, new ArrayList<>(Arrays.asList(v2)));
		Client c3 = new Client(Type.USER,"Kate Muller", 23, new ArrayList<>(Arrays.asList(v3)));
		Client c4 = new Client(Type.ADMIN,"Jack Wilson", 35, new ArrayList<>(Arrays.asList(v4)));
		Client c5 = new Client(Type.USER,"Carol Smith", 23, new ArrayList<>(Arrays.asList(v5)));
		Client c6 = new Client(Type.USER,"Nador Hicham", 23, new ArrayList<>(Arrays.asList(v6)));
		this.clients = List.of(c1,c2,c3,c4,c5,c6);
	}

     public  List<Client> getByType(Type type){
	  return clients.stream().filter(user->user.getType().equals(type)).collect(Collectors.toList());
     }
		
	 public List<Client> getByVille(String ville){
		 return clients.stream().filter(user-> user.getVilles().contains(ville)).collect(Collectors.toList());
	 }
	 public List<Client> getOtherVilleThan(String ville ){
		return clients.stream().filter(user->!user.getVilles().contains(ville)).collect(Collectors.toList());
	 }
	/* public void doSomthing() {
		 clients.stream().filter(user->user.getVilles().size()>3).map(user->user.setSomthing("this user from more than 4 cities"));
	 }*/
	 public List<Client>  getByVillesNumber(int nbrVille) {
		 return clients.stream().filter(user->user.getVilles().size()==nbrVille).collect(Collectors.toList());
	 }
	 
	 public  Map<String,  Integer> countCharacterInVilles(){
		 Map<String,  Integer> res = new HashMap<String, Integer>();
		// res =clients.stream().collect(Collectors.toMap((Client elm)->{return elm.getNom();}, (Client elm)->elm.getVilles().stream().reduce(0,(String a,String b)->a.length()+b.length())));
		// clients.forEach(user-> res.put(user.getNom(),Integer.valueOf(( user.getVilles().stream().reduce(0,((som,elm)->som+=elm.length())).get())
			//	 )));
		  //clients.forEach(elm-> res.put(elm.getNom(),elm.getVilles().stream().reduce((firstElement, secondElement) -> firstElement.length() + secondElement.length()))
				// );
		  return res ;
	 }
	/*3. Ecrivez une fonction getOtherVilleThan(ville: string): Array<Object> qui retourne la
liste des personnes n’ayant pas dans villes la ville passée en paramètre.
*/
	
	
	
	
	/*const personnes = [
{type: 'user', nom:'Max Mustermann', age: 25, villes: ['Marseille','Lyon', 'Paris']},
{type: 'admin', nom: 'John Wick', age : 45, villes : ['Paris']},
{type: 'user', nom: 'Kate Muller', age : 23, villes : ['Nantes', 'Lyon', 'Lille', 'Nice']},
{type: 'admin', nom: 'Bruce Willis', age : 64, villes : ['Paris','Nantes']},
{type: 'user', nom: 'Jack Wilson', age : 35, villes : ['Marseille','Lyon', 'Montpellier']},
{type: 'admin', nom: 'Carol Smith', age : 23, villes : ['Marseille','Nice ', 'Montpellier']}
];*/
	
public static void main(String[] args) {
	//String [] v2 = {"Paris"};
	//System.out.println(a);
 //Client cl = new Client(Type.ADMIN,"Hicham Loukili", 21,new ArrayList<String>(List.of(v2)) );//Stream.of("Nador").collect(Collectors.toList())); /* new ArrayList<String>(){{ add("Nador");add("fes"); }}/*List.of("Nador")/*Stream.of("Nador").collect(Collectors.toList()*/ 
	//cl.getVilles().add("Rabat");
  // System.out.println(cl);
	
	//c1.getVilles().add("Rabat");
	//System.out.println(personnes);
	/*String [] v1 = {"Marseille","Lyon", "Paris"};
	String [] v2 = {"Paris"};
	String [] v3 = {"Nantes","Lyon", "Lille","Nice"};
	String [] v4 = {"Paris","Nantes"};
	String [] v5 = {"Marseille","Lyon", "Montpellier"};
	String [] v6 = {"Marseille","Nice ", "Montpellier"};
	Client c1 = new Client(Type.USER,"Max Mustermann", 25, new ArrayList<>(Arrays.asList(v1)));
	Client c2 = new Client(Type.ADMIN,"John Wick", 45, new ArrayList<>(Arrays.asList(v2)));
	Client c3 = new Client(Type.USER,"Kate Muller", 23, new ArrayList<>(Arrays.asList(v3)));
	Client c4 = new Client(Type.ADMIN,"Jack Wilson", 35, new ArrayList<>(Arrays.asList(v4)));
	Client c5 = new Client(Type.USER,"Carol Smith", 23, new ArrayList<>(Arrays.asList(v5)));
	List<Client > clients = List.of(c1,c2,c3,c4,c5);
	System.out.println(clients);*/
	//List<Client> cls =  clients.stream().filter(vil->vil.getType().equals(Type.USER)).collect(Collectors.toList());
  //   System.out.println(cls);
	Main2 mn = new Main2();
	List<Client> cls = mn.getByType(Type.ADMIN);
	 int i = 9876;
	    printMe(i);
	    
	//System.out.println(mn.getByVille("Nador"));
	//System.out.println(mn.getOtherVilleThan("Lyon"));
	
	//System.out.println(mn.getByVillesNumber(3));
  
  // System.out.println(mn.countCharacterInVilles());
}
}
