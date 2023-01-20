package Implementacao;

class Calculadora implements OperacaoMatematica{

    @Override
    public void soma(double operando1, double operando2){
        System.out.println("Soma " + (operando1 + operando2));
    }

    @Override
    public void subtracao(double operando1, double operando2){
        System.out.println("Subtração " + (operando1 - operando2));
    }

    @Override
    public void multiplicao(double operando1, double operando2) {
        System.out.println("Multicação " + (operando1 * operando2));
    }

    @Override
    public void divisao(double operando1, double operando2) {
        System.out.println("Divisão " + (operando1 / operando2));
    }
}