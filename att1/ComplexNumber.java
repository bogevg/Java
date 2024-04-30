public class ComplexNumber {
    protected float res;
    protected float im;

    ComplexNumber(float res, float im){
        this.im = im;
        this.res = res;
    }
    ComplexNumber(){
        this(0, 0);
    }
    @Override
    public String toString() {
        return  "\nres: " + Float.toString(res)+
                "\nim: "+ Float.toString(im);
    }

    public void setIm(float im) {
        this.im = im;
    }
    public void setRes(float res) {
        this.res = res;
    }
}
