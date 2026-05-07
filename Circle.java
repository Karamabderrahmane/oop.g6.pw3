import javax.crypto.CipherSpi;

public class Circle extends Shape{

    private double radios ;

    Circle(double radios){
        this.radios = radios ;
    }


    @Override
    double getArea() {
        return radios * radios * Math.PI;
    }

    @Override
    double getPermiter() {
        return radios * Math.PI * 2 ;
    }

}
