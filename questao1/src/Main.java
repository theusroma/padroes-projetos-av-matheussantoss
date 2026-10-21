public class Main {

    public static void main(String[] args) {


        EmissorPassagem emissorAereo = new EmissorPassagemAerea();
        emissorAereo.emitir("paulo freire", 1300);

        EmissorPassagem emissorRodoviario = new EmissorPassagemRodoviaria();
        emissorRodoviario.emitir("frida khalo", 130);

        EmissorPassagem emissorFerroviario = new EmissorPassagemFerroviaria();
        emissorFerroviario.emitir("simone beauvior", 13);
    }
}
