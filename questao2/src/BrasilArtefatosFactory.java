public class BrasilArtefatosFactory extends ArtefatosMatriculaFactory {


    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new DocumentoFiscalBrasil();
    }


    @Override
    public Pagamento criarPagamento() {
        return new PagamentoBrasil();
    }


    @Override
    public ComprovanteMatricula criarComprovanteMatricula() {
        return new ComprovanteMatriculaBrasil();
    }

    
}
