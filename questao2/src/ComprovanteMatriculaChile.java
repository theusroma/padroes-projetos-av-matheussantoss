public class ComprovanteMatriculaChile extends ComprovanteMatricula {


    @Override
    public String gerarComprovante() {
        return "Comprovante: Identificação do aluno por RUT";
    }

}


// RF02 (Chile): documento fiscal boleta electrónica com IVA de 19%; pagamento via Webpay;
// comprovante de matrícula com identificação do aluno por RUT.