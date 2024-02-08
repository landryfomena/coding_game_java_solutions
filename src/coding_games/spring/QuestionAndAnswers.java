package coding_games.spring;

import java.util.HashMap;
import java.util.Map;

public class QuestionAndAnswers {
    private Map<String,String> qaMap= new HashMap<>();
    private void populateMap(){
        qaMap.put("String name - XXX-getContext) -getAuthentication) -getName" , "SecurityContextHolder");
        qaMap.put("public void getType(XXX(\"type\") String type) ) -getName" , "@PathVariable");
        qaMap.put("Par défaut, combien d'instances d'un bean Spring trouveriez-vous dans le contexte d'application?" , "une");
        qaMap.put("what @anotation do i put on webSecurityConfiguation file in spring security ??" , "@EnableWebSecurity");
        qaMap.put("what advice is exceuted regardless if we have an exception or not?" , "@After");
        qaMap.put("@pointcut(\"within(org.sport..*)\") what matches this ?" , "The @Pointcut expression within(org.sport..*) in Spring AOP is specifying a pointcut that matches any join point within the package org.sport or any of its subpackages");
        qaMap.put("What are the differences between @RequestParam\n" +
                "and\n" +
                "@PathVariable " , "@RequestParam: Used for extracting query parameters from the URL or form data.\n" +
                "@PathVariable: Used for extracting values from URI templates (variables within the ");
        qaMap.put("Lorsqu'un objet requête quitte le client, son premier arrêt lorsqu'il entre dans une application Spring est " , " DispatcherServlet");
        qaMap.put("Vous souhaitez exécuter une méthode advice (AOP) après un point de jointure (oin point), " +
                "mais seulement dans le cas où celle-ci se déroule sans problème, c-a-d sans levée d'exception." , "@AfterReturning");
        qaMap.put("Quelle annotation de Spring Boot permet d'activer le\n" +
                "SSO (Single Sign On) avec un provider OAuth2 déclaré au niveau de propriétés externes ?\n" +
                "Cette annotation a été introduite par SpringBoot 2.0.0." , "@EnableOAuth2Sso,@EnableOAuth2Client");
        qaMap.put("Quel est le nom du protocole, basé sur du texte, utilisé par Spring pour envoyer des messages par\n" +
                "Websockets ?" , "Simple Text Oriented Messaging Protocol");
        qaMap.put("Quel point de terminaison (endpoint) de Spring Boot permet l'affichage de statistiques concernant l'application actuelle," +
                " comme l'utilisation de la mémoire, le nombre de threads en cours d'exécution, et le temps de réponse de méthodes\n" +
                "REST?" , "/metrics");
        qaMap.put("n Spring Security, the Cross-Site Request Forgery (CSRF) protection is implemented using a security" +
                " token known as the CSRF token. When submitting a form or making a request that modifies the state on" +
                " the server (such as a POST, PUT, DELETE), this token should be included in the request" , "in header with _csrf");



    }
}
