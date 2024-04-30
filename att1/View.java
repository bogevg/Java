public class View {

    private CalcComplex calc;
    private ComplexNumber r ;

    View(){
        calc = new CalcComplex();
    }

    public void sumButtom(ComplexNumber a, ComplexNumber b){
        r = new ComplexNumber();
        r = calc.sum(a, b);
        System.out.println(r);
    }

    public void multButton(ComplexNumber a, ComplexNumber b){
        r = new ComplexNumber();
        r = calc.mult(a, b);
        System.out.println(r);
    }

    public void diwButton(ComplexNumber a, ComplexNumber b){
        r = new ComplexNumber();
        r = calc.div(a, b);
        System.out.println(r);
    }
}
