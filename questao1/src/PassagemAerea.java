public class PassagemAerea extends PassagemAbs {


    public PassagemAerea(String nome, double tarifa) {
        super(nome, tarifa);
    }


    @Override
    public double taxaEmbarque() {
        return getTarifa() * 0.08;
    }




    @Override
    public void documentosExigidos() {
        System.out.println("Documento de identidade com foto e bilhete eletrônico (e-ticket)");
    }
}

// RF01 (Passagem Aérea): taxa de embarque igual a 8% do valor da tarifa. Documentos exigidos:
// documento de identidade com foto e bilhete eletrônico (e-ticket