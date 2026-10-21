public abstract class PassagemAbs {
    private String nome;
    private double tarifa;

    public PassagemAbs(String nome, double tarifa) {
        this.nome = nome;
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }


    public String getNome() {
        return nome;
    }


    public abstract   double taxaEmbarque();
    public abstract void documentosExigidos();

    public void resumo() {
        System.out.println("== Resumo ==");
        System.out.println("Passageiro: " + this.nome);
        System.out.printf("Taxa de Embarque: R$ %f", taxaEmbarque());
        System.out.print("Documentos Exigidos: ");
        documentosExigidos();
    }
}


// RF01 (Passagem Aérea): taxa de embarque igual a 8% do valor da tarifa. Documentos exigidos:
// documento de identidade com foto e bilhete eletrônico (e-ticket).