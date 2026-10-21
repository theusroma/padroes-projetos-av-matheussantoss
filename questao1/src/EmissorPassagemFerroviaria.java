public class EmissorPassagemFerroviaria extends EmissorPassagem {
    
    
    
    @Override
    protected PassagemAbs criarPassagem(String nome, double tarifa) {
        
        return new PassagemFerroviaria(nome, tarifa);
    }
}
