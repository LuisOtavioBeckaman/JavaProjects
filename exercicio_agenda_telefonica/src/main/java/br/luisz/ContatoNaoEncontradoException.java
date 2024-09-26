package br.luisz;

public class ContatoNaoEncontradoException extends Exception{
    public ContatoNaoEncontradoException (String mensagem){
        super(mensagem);
    }
}
