package advanced_coding.enum_temperature;

public enum TemperatureConvert {
    C_F('C', 'F', new Converter_C_F()),
    C_K('C', 'K', new Converter_C_K()),
    K_C('K', 'C', new Converter_K_C()),
    F_C('F', 'C', new ConverterF_C()),
    F_K('F', 'K', new Converter_F_K()),
    K_F('K', 'F', new Converter_K_F());

    final char inputTemperatureUnit;
    final char outputTemperatureUnit;
    final Converter converter;

    TemperatureConvert(char inputTemperatureUnit, char outputTemperatureUnit, Converter converter) {
        this.inputTemperatureUnit = Character.toUpperCase(inputTemperatureUnit);
        this.outputTemperatureUnit = Character.toUpperCase(outputTemperatureUnit);
        this.converter = converter;
    }
    static float convertTemperature(char inputTemperatureUnit, char outputTemperatureUnit, float temperature) {
        for (TemperatureConvert conversionType : TemperatureConvert.values()) {
            if (conversionType.inputTemperatureUnit == Character.toUpperCase(inputTemperatureUnit)
                    && conversionType.outputTemperatureUnit == Character.toUpperCase(outputTemperatureUnit)) {
                return conversionType.converter.convert(temperature);
            }
        }
        return 0;
    }
}

