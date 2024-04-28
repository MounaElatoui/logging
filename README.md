ApplicationRunner et CommandLineRunner sont deux interfaces différentes
dans le framework Spring Boot de Java, 
utilisées pour exécuter du code au démarrage de l'application.Voici une explication succincte des deux :

1/ApplicationRunner :
 Cette interface est utilisée lorsque vous avez besoin d'accéder aux arguments de la ligne de commande 
  et aux options d'application.
 Elle définit une seule méthode run(ApplicationArguments args) qui est appelée une fois que l'application
 a démarré.
 Les ApplicationArguments fournissent un moyen pratique 
 de traiter les arguments de la ligne de commande, ainsi que les options d'application spécifiques.

2/CommandLineRunner :
 *Cette interface est plus simple et plus directe.
 *Elle est utilisée lorsque vous n'avez pas besoin des fonctionnalités supplémentaires fournies par ApplicationArguments.
 *Elle définit une seule méthode run(String... args) qui est appelée une fois que l'application a démarré.
 *Les arguments sont passés sous forme de tableau de chaînes de caractères.

==>
En résumé, 
==>ApplicationRunner offre une approche plus riche et plus flexible pour accéder aux arguments
 de la ligne de commande et aux options d'application,
 tandis que 
==>CommandLineRunner est plus simple et convient mieux lorsque vous avez seulement besoin des arguments de base passés à l'application.



/* CommandLineRunner*/
La méthode run est une méthode définie dans l'interface CommandLineRunner dans le framework Spring Boot de Java. Cette méthode est conçue pour être appelée une fois que l'application Spring Boot a démarré. Elle prend en paramètre un tableau de chaînes de caractères qui représente les arguments de la ligne de commande passés à l'application.

L'objectif principal de la méthode run est d'exécuter le code spécifique que vous souhaitez exécuter au démarrage de votre application. Cela peut inclure des opérations d'initialisation, des configurations spéciales, ou toute autre logique nécessaire au bon fonctionnement de votre application dès son lancement.

L'utilisation de la méthode run dans une classe qui implémente CommandLineRunner permet de définir facilement des tâches à exécuter au démarrage de l'application, tout en bénéficiant de la gestion de contexte et de configuration fournie par Spring Boot.
/***/

public class DbConfig implements CommandLineRunner {
/*Dès que Dbconfig implémente CommandLineRunner, il faut comprendre que CommandLineRunner est une interface fonctionnelle et qu'elle possède une seule méthode, run. */
  @Override
    /* L'utilisation de la méthode run dans une classe qui implémente CommandLineRunner permet de définir facilement des tâches à exécuter au démarrage de l'application, tout en bénéficiant de la gestion de contexte et de configuration fournie par Spring Boot.  */
   public void run(String... args) throws Exception {// throws Exception : indique que cette methode exptible de leve les exception 
   System.out.println("Db initialized successfully");    }
/*Dès que notre application démarre, elle va détecter que la classe DBConfig implémente CommandLineRunner. CommandLineRunner est une interface fonctionnelle qui dispose d'une seule méthode, run, qui est automatiquement exécutée, c'est-à-dire qu'on n'a pas besoin de l'appeler pour qu'elle s'exécute au niveau de notre application. */
}
/***************/

@SpringBootApplication  // Annotation pour indiquer qu'il s'agit d'une application Spring Boot
public class LoggingApplication {

	public static void main(String[] args)   {
	        // Lance l'application Spring Boot en passant la classe principale et les arguments de la ligne de commande
		SpringApplication.run(LoggingApplication.class, args);
		/*  il y a un seul beans(toujours les beans commence en minuscul ) appele loggingApplication   parceque LogginApplication et annote par @SpringbootApplication elle ne pas */
		// Crée une instance  static de DbConfig  par contre dans spring il faut sera auto 
     // DbConfig dbConfig=new DbConfig();
	    // Exécute la méthode run de DbConfig en lui passant les arguments de la ligne de commande
	  //dbConfig.run(args);
	  /*  MediaConfig mediaConfig =new MediaConfig();
	  mediaConfig.run(args);*/
	  /*commente les code static on montre comment notre conteneur sprig va cree des instance dynamique  cree des beans sur db config  */
}}


