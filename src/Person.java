
public class Person {
   private  final String nom ;
   private  final int  age ;
   private  final Gender gender;
   
public Person(String nom, int age, Gender gender) {
	this.nom = nom;
	this.age = age;
	this.gender = gender;
}

public String getNom() {
	return nom;
}

public int getAge() {
	return age;
}

public Gender getGender() {
	return gender;
}

@Override
public String toString() {
	return "Person [nom=" + nom + ", age=" + age + ", gender=" + gender + "]";
}
 
 
   
}
