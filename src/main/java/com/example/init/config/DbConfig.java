package com.example.init.config;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
 
@Component
public class DbConfig implements CommandLineRunner {
/*Dès que Dbconfig implémente CommandLineRunner, il faut comprendre que CommandLineRunner est une interface fonctionnelle et qu'elle possède une seule méthode, run. */
  @Override
    /* L'utilisation de la méthode run dans une classe qui implémente CommandLineRunner permet de définir facilement des tâches à exécuter au démarrage de l'application, tout en bénéficiant de la gestion de contexte et de configuration fournie par Spring Boot.  */
   public void run(String... args) throws Exception {// throws Exception : indique que cette methode exptible de leve les exception 
   System.out.println("Db initialized successfully");    }
/*Dès que notre application démarre, elle va détecter que la classe DBConfig implémente CommandLineRunner. CommandLineRunner est une interface fonctionnelle qui dispose d'une seule méthode, run, qui est automatiquement exécutée, c'est-à-dire qu'on n'a pas besoin de l'appeler pour qu'elle s'exécute au niveau de notre application. */
}
