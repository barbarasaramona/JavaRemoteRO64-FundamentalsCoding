package advancedCoding.enum_temperature;

public class Converter_K_F implements Converter{
    @Override
    public float convert(float temp) {
        return (float) (temp * 1.8 - 459.67);
    }
}
