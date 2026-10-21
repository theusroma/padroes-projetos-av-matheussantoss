public class EmissorPassagemRodoviaria extends EmissorPassagem {

    @Override
    protected PassagemAbs criarPassagem(String nome, double tarifa) {

        
        return new PassagemRodoviaria(nome, tarifa);

    }
}
