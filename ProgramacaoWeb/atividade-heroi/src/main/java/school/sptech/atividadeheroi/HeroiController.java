package school.sptech.atividadeheroi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.sptech.atividadeheroi.Heroi;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("herois")

public class HeroiController {

    List<Heroi> herois = new ArrayList<>();

    @GetMapping
    public List<Heroi> listagem(){
        return herois;
    }

    @GetMapping("/{indice}")
    public Heroi seuHeroi(@PathVariable int indice){
        return herois.get(indice);
    }

    @GetMapping("/cadastrar/{nome}/{forca}/{habilidade}/{idade}/{vivo}")
    public List<Heroi> cadastarHeroi(@PathVariable String nome,
                                     @PathVariable int forca,
                                     @PathVariable String habilidade,
                                     @PathVariable int idade,
                                     @PathVariable boolean vivo)
    {
        Heroi heroi = new Heroi(nome,forca,habilidade, idade,vivo);
        herois.add(heroi);
        return herois;
    }

    @GetMapping("/atualizar/{indice}/{nome}/{forca}/{habilidade}/{idade}/{vivo}")
    public String atualizarHeroi(@PathVariable int indice,
                                 @PathVariable String nome,
                                 @PathVariable int forca,
                                 @PathVariable String habilidade,
                                 @PathVariable int idade,
                                 @PathVariable boolean vivo)
    {
        if (existeHeroi(indice)){
            Heroi heroi = new Heroi(nome,forca,habilidade, idade,vivo);
            herois.set(indice, heroi);
            return "Heroi atualizado!";
        } else {
            return "Heroi não encontrado";
        }
    }

    @GetMapping("remover/{indice}")
    public String remover(@PathVariable int indice){
        if (existeHeroi(indice)){
            herois.remove(indice);
            return "Heroi removido";
        }else{
            return "Heroi não encontrado";
        }
    }

    public boolean existeHeroi(int indice){
        if (indice < herois.size() && indice >= 0){
            return true;
        } else {
            return false;
        }
    }
}
