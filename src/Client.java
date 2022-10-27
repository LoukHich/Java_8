import java.util.*;

public class Client {
	private final Type type; 
	private final String nom ;
	private final int age ;
	private final List<String> villes ;
	private String somthing ;
	public Type getType() {
		return type;
	}
	
	public String getNom() {
		return nom;
	}
	public int getAge() {
		return age;
	}
	public List<String> getVilles() {
		return villes;
	}
	public String getSomthing() {
		return somthing;
	}

	public void setSomthing(String somthing) {
		this.somthing = somthing;
	}

	@Override
	public String toString() {
		return "Client [type=" + type + ", nom=" + nom + ", age=" + age + ", villes=" + villes + " "+somthing+"]";
	}
	public Client(Type type, String nom, int age, List<String> villes) {
		super();
		this.type = type;
		this.nom = nom;
		this.age = age;
		this.villes = villes;
	}

		
		// TODO Auto-generated constructor stub
	

	
/*const personnes = [
{type: 'user', nom:'Max Mustermann', age: 25, villes: ['Marseille',
'Lyon', 'Paris']},
{type: 'admin', nom: 'John Wick', age : 45, villes : ['Paris']},
{type: 'user', nom: 'Kate Muller', age : 23, villes : ['Nantes', 'Lyon
', 'Lille', 'Nice']},
{type: 'admin', nom: 'Bruce Willis', age : 64, villes : ['Paris',
'Nantes']},
{type: 'user', nom: 'Jack Wilson', age : 35, villes : ['Marseille',
'Lyon', 'Montpellier']},
{type: 'admin', nom: 'Carol Smith', age : 23, villes : ['Marseille',
'Nice ', 'Montpellier']}
];
*/
}
