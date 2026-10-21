public class DocumentoFiscalBrasil extends DocumentoFiscal {


    @Override
    public String gerarDocumento() {
        return "Documento Fiscal: NFS-e com ISS de 5%";
    }
}


// RF01 (Brasil): documento fiscal NFS-e com ISS de 5%; pagamento via Pix; comprovante de matrícula
// com identificação do aluno por CPF