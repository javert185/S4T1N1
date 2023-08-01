package cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s04.t01.n01.S04T01N01CarapuigMasnouSergi.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldControllers {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom) {
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }

    @GetMapping("/HelloWorld2/{nom}")
    public String saluda2(@PathVariable(value = "nom") String nom) {
       if (nom == null) {
            return "Hola, estàs executant un projecte Maven";
        } else {
        	  return "Hola, " + nom + ". Estàs executant un projecte Maven";
        }
    }
}
