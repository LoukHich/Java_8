import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_video1 {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("******** Bonjour Nadori ***********");
		// intstream simple
		IntStream.range(1, 10).forEach(System.out::println);
		// instream + range closed + sum return int 
		//int x = IntStream.rangeClosed(1, 10).skip(2).sum();
		//System.out.println("somes: "+ x);
		// stream of number int sorted them and take first 
		Stream.of(2,4,4,5,7,7,10,10).sorted((a,b)->b-a).findFirst().ifPresent(System.out::println);
		// Handle   stream of Array
		String[] personnes = {"Ali","Hicham","Nadori","Fozia","Hakim","Rachid"};
		Arrays.stream(personnes).filter(s->s.startsWith("H")).sorted().map(c->c+" Nadori").forEach(System.out::println);
		Stream.of(personnes).filter(c->c.startsWith("H")).sorted().map(c->c+" Nadori").forEach(System.out::println);
		
		 // Averege square of int Array 
	/*	Arrays.stream(new int [] {1,2,3,4,5}).map(x->x*x).average().ifPresent(System.out::println);
	  //Stream.of(new int [] {1,2,3,4,5}).map(z->z*z).forEach(x-> System.out.println(x));//.forEach(System.out::println);//.average().ifPresent(System.out::println);  //!!!! not work
		Stream<String> txt = Files.lines(Paths.get("nadori.txt").toAbsolutePath());
		txt.filter(line->line.length()>10).forEach(System.out::println);
		txt.close();*/
		
	//
		//Stream<String> rows = Files.lines(Paths.get("nadri.txt"));
		//int nbr = (int) rows.map(l->l.split(",")).filter(r->r.length>3).count();
		IntSummaryStatistics summaray = IntStream.of(1,25,7,8).summaryStatistics();
		System.out.println(summaray);
		
	}
	
	
	
}
