
package culc.model;
public class NumberMapper {
    public String map(Complex num) {
        return String.format("%f + i * %f",num.getReal(), num.getImage());
    }

    public Complex map(String line) {
        String[] lines = line.split(" + i * ");
        
        return new Complex(Double.parseDouble(lines[0]), Double.parseDouble(lines[1]));
    }
}
