public class PassagemRodoviaria extends PassagemAbs {

    public PassagemRodoviaria(String nome, double tarifa) {
        super(nome, tarifa);
    }



    @Override
    public double taxaEmbarque() {
        return getTarifa() * 0.03;
    }


    @Override
    public void documentosExigidos() {
        System.out.println("Documento de identidade com foto");
    }
}





// RF02 (Passagem Rodoviária): taxa de embarque igual a 3% do valor da tarifa. Documentos exigidos:
// documento de identidade com fot