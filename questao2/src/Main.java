public class Main {


    public static void main(String[] args) {


        System.out.println("Matrícula no Brasil:");
        Matricula matriculaBrasil = new Matricula(new BrasilArtefatosFactory());
        matriculaBrasil.confirmarMatricula();

        
        System.out.println("\nMatrícula no Chile:");
        Matricula matriculaChile = new Matricula(new ChileArtefatosFactory());
        matriculaChile.confirmarMatricula();
    }
}
