//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]) {
        Notas notas = new Notas();
        System.out.println("calculo de média:");
        notas.setNota1(9);
        notas.setNota2(8);
        notas.setNota3(6);
        notas.setNota4(9);
        notas.imprimirMedia();
    }
}