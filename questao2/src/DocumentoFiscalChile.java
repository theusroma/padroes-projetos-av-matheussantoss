public class DocumentoFiscalChile extends DocumentoFiscal {


    @Override
    public String gerarDocumento() {
        return "Documento Fiscal: Boleta electrónica com IVA de 19%";
    }
}



// RF02 (Chile): documento fiscal boleta electrónica com IVA de 19%; pagamento via Webpay;
// comprovante de matrícula com identificação do aluno por RUT.