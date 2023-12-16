package advanced_coding.enum_temperature;

public class Converter_F_K implements Converter{
    @Override
    public float convert(float temp) {
        return (float) ((temp + 459.67) / 1.8);
    }
}
