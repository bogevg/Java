public class CalcComplex{
    public ComplexNumber sum(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(a.res + b.res, a.im + b.im);
    }

    public ComplexNumber mult(ComplexNumber a, ComplexNumber b){
        ComplexNumber resalt = new ComplexNumber((a.res*b.res - a.im*b.im), (a.res*b.im + a.res * b.im));
        return resalt;
    }

    public ComplexNumber div(ComplexNumber a, ComplexNumber b){
        float del = b.res * b.res + b.im*b.im;
        if (del == 0){
            System.out.println("Error div by 0");
            System.exit(0);
        }
        float res = (a.res*b.res + a.im *b.im)/del;
        float im = (a.res*b.res + a.im *b.im)/del;
        ComplexNumber resalt = new ComplexNumber(res, im);
        return resalt;
    }
}