package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan({"com.example.demo","com.example.init"})
@SpringBootApplication  // Annotation pour indiquer qu'il s'agit d'une application Spring Boot
public class LoggingApplication {

	public static void main(String[] args)   {
	        // Lance l'application Spring Boot en passant la classe principale et les arguments de la ligne de commande
		SpringApplication.run(LoggingApplication.class, args);
		/*  il y a un seul beans(toujours les beans commence en minuscul ) appele loggingApplication   parceque LogginApplication et annote par @SpringbootApplication elle ne pas */
		// Crée une instance  static de DbConfig  par contre dans spring il faut sera auto 
     /*  DbConfig dbConfig=new DbConfig();*/
	    // Exécute la méthode run de DbConfig en lui passant les arguments de la ligne de commande
	  //dbConfig.run(args);
	  /*  MediaConfig mediaConfig =new MediaConfig();
	  mediaConfig.run(args);*/
	  /*commente les code static on montre comment notre conteneur sprig va cree des instance dynamique  cree des beans sur db config  */
}}

