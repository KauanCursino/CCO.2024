package school.sptech.projetointroducao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/frases")

public class FraseController {

        // http://localhost:8080/frases
        @GetMapping
        public String olaMundo(){
            return "Olá Mundo";
        }

        // http://localhost:8080/frases/tudo-bem
        @GetMapping("/tudo-bem")
        public String tudoBem(){
            return "Tudo Bem?";
        }

        @GetMapping("/personalizada/{nome}/{sobrenome}")
        public String personalizadaNomeSobrenome(@PathVariable String nome, @PathVariable String sobrenome){
            return "Olá " + nome + " " + sobrenome + "! Tudo bem?";
        }
}
