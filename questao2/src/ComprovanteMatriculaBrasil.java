public class ComprovanteMatriculaBrasil extends ComprovanteMatricula {


    @Override
    public String gerarComprovante() {
        return "Comprovante: Identificação do aluno por CPF";
    }

}

//// RF01 (Brasil): documento fiscal NFS-e com ISS de 5%; pagamento via Pix; comprovante de matrícula
// com identificação do aluno por CPF