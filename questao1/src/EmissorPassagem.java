public abstract class EmissorPassagem {



    public void emitir(String nome, double tarifa) {

        // factory
        PassagemAbs passagem = criarPassagem(nome, tarifa);
        

        
        //classe abstrata
        passagem.resumo();
    }

    protected abstract PassagemAbs criarPassagem(String nome, double tarifa);
}
