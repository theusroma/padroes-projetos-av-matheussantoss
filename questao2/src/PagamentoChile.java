public class PagamentoChile extends Pagamento {


    @Override
    public String processarPagamento() {
        return "Pagamento: Processado via Webpay";
    }
    
}
