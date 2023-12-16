package advanced_coding.enum_temperature;

public class ConverterF_C implements Converter{
    @Override
    public float convert(float temp) {
        return (temp - 32) * 5 / 9;
    }
}
