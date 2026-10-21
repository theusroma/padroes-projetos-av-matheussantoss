public class Matricula {
    
    private ArtefatosMatriculaFactory factory;

    public Matricula(ArtefatosMatriculaFactory factory) {
        this.factory = factory;
    }

    public void confirmarMatricula() {


        DocumentoFiscal documento = factory.criarDocumentoFiscal();
        Pagamento pagamento = factory.criarPagamento();
        ComprovanteMatricula comprovante = factory.criarComprovanteMatricula();

        System.out.println("==Relatório de Matrícula==");
        System.out.println(documento.gerarDocumento());
        System.out.println(pagamento.processarPagamento());
        System.out.println(comprovante.gerarComprovante());
    }
}
