package school.sptech.atividaderelacionamento.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CampoInvalidoException extends RuntimeException {

    public CampoInvalidoException(String campo) {
        super(String.format("%s Inválido", campo));
    }
}
