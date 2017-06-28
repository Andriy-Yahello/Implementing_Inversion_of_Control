package co.lofongi.third;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@SuppressWarnings("restriction")
public class Greating {
	
	@SuppressWarnings("restriction")
	@PostConstruct
	public void afterInstantiation(){
		System.out.println("I start after initialialization of a new bean.");
	}
	
	@PreDestroy
	public void beforeDestruction(){
		System.out.println("I will start before a bean is destroyed.");
	}
	
	public void Great(){
		System.out.println("Welcome to the new world!");
	}

}
