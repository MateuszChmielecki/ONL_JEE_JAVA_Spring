package pl.coderslab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.coderslab.app.Captain;
import pl.coderslab.app.ScopePrototype;
import pl.coderslab.app.ScopeSingleton;
import pl.coderslab.app.Ship;

@Configuration
@ComponentScan
//Adnotacja która będzie mi szukać beanów w projekcie - w tym pakiecie i w pakietach które są niżej w hierarchi !!!
public class AppConfig {

    /** Tutaj zostao zakomentowane, dlatego żeby spróbować zrobić za pomocą
     * tylko adnotacji bez jawnego tworzenia sobie beana
     *
     * Proszę sobie odkomentować
     @Bean("helloWorld")
     public HelloWorld helloWorld(){
     return new HelloWorld();
     }
     */
    @Bean
    public Captain jackSparrow() {
         return new Captain();
    }

     @Bean
     public Ship blackPearl() {
          return new Ship(jackSparrow());
     }

     @Bean
     @Scope("prototype")
    public ScopePrototype scopePrototype(){
        return new ScopePrototype();
     }

     @Bean
     @Scope("singleton")
    public ScopeSingleton scopeSingleton(){
        return new ScopeSingleton();
     }


}
