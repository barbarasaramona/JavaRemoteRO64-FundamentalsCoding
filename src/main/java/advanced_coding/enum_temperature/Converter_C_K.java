package advanced_coding.enum_temperature;

public class Converter_C_K implements Converter{
    @Override
    public float convert(float tempIn) {
        return (float) (tempIn + 273.15);
    }
}
