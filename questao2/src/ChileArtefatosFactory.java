public class ChileArtefatosFactory extends ArtefatosMatriculaFactory {


    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new DocumentoFiscalChile();
    }


    @Override
    public Pagamento criarPagamento() {
        return new PagamentoChile();
    }


    @Override
    public ComprovanteMatricula criarComprovanteMatricula() {
        return new ComprovanteMatriculaChile();
        
    }
}
