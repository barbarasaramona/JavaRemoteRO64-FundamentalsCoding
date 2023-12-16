package advanced_coding.enum_temperature;

public class Converter_K_C implements Converter{
    @Override
    public float convert(float temp) {
        return (float) (temp - 273.15);
    }
}
