package calculator;

import fit.ColumnFixture;
import math.MyMath;

public class Main extends ColumnFixture {

    public int a;
    public int b;  

    public int sum() {
        int result;
        result = MyMath.sum(a, b);
        return result;
    }

    public int sub() {
        int result;
        result = MyMath.sub(a, b);
        return result;
    }

    public int mul() {
        int result;
        result = MyMath.mul(a, b);
        return result;
    }

    public int div() {
        int result;
        result = MyMath.div(a, b);
        return result;
    }    
}
