public class PassagemFerroviaria extends PassagemAbs {


    public PassagemFerroviaria(String nome, double tarifa) {
        super(nome, tarifa);
    }



    @Override
    public double taxaEmbarque() {
        return getTarifa() * 0.05;
    }



    @Override
    public void documentosExigidos() {
        System.out.println("Documento de identidade com foto e comprovante de reserva");
    }
}

// RF03 (Passagem Ferroviária): taxa de embarque igual a 5% do valor da tarifa. Documentos exigidos:
// documento de identidade com foto e comprovante de reserva
