public class Polynomial {
    double[] coefficients = {0};

    public Polynomial() {
    }

    public Polynomial(double[] coefficients) {
        this.coefficients = coefficients;
    }

    public Polynomial add(Polynomial arg) {
        int arrlength = arg.coefficients.length > this.coefficients.length ? arg.coefficients.length : this.coefficients.length;
        double[] arr = new double[arrlength];
        for (int i = 0; i < arrlength; i++) {
            arr[i] = 0;
            if (i < arg.coefficients.length) {
                arr[i] += arg.coefficients[i];
            }
            if (i < this.coefficients.length) {
                arr[i] += this.coefficients[i];
            }
        }
        Polynomial ret = new Polynomial(arr);
        return ret;
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < this.coefficients.length; i++) {
            result += this.coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

    public boolean hasRoot(double x) {
        return evaluate(x) == 0;
    }
}