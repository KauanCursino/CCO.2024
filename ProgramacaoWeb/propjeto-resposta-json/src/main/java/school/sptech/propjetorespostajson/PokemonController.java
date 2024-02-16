package school.sptech.propjetorespostajson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

    @RestController
    @RequestMapping("/pokemon")

public class PokemonController {

        private int pokemonCadastrados;
        List pokemon = new ArrayList<>();


        @GetMapping
        public String pokemonCadastrados(){
            return "Total de Pokemon cadastrados: " + pokemonCadastrados;
        };

        @GetMapping("/cadastrar/{nome}")
        public List cadastrarPokemons(@PathVariable String nome){
            pokemon.add(nome);
            pokemonCadastrados++;
            return pokemon;
        };

        @GetMapping("recuperar/{indice}")
        public String recuperarPokemon(@PathVariable int indice){
            if (indice < pokemon.size() && indice >= 0) {
                return "Seu pokemon é " + pokemon.get(indice);
            }else {
                return "Pokemon não encontrado";
            }
        };

        @GetMapping("/excluir/{indice}")
        public String excluirPokemon(@PathVariable int indice){
        if (indice < pokemon.size() && indice >= 0){
            pokemon.remove(indice);
            pokemonCadastrados--;
            return "Pokemon removido";
        } else {
            return "Pokemon não encontrado";
            }
        };

        @GetMapping("/atualizar/{indice}/{novoNome}")
        public String atualizarPokemon(@PathVariable int indice, @PathVariable String novoNome){
            if (indice < pokemon.size() && indice >= 0){
                pokemon.set(indice, novoNome);
                return "Pokemon atualizado";
            }else{
                return "Pokemon não encontrado";
            }
        }

        public boolean existePokemon(int indice){
            return indice <= pokemon.size() && indice >= 0;
        }

}
