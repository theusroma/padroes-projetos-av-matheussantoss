public class PagamentoBrasil extends Pagamento {


    @Override
    public String processarPagamento() {
        return "Pagamento: Processado via Pix";
    }
    
}
