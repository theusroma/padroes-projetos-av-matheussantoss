public class EmissorPassagemAerea extends EmissorPassagem {

    
    @Override
    protected PassagemAbs criarPassagem(String nome, double tarifa) {

        return new PassagemAerea(nome, tarifa);
    }

}

