package advanceCoding.Tasks;

public enum TemperatureConvert {
    C_F('C', 'F', new Converter_C_F()),
    C_K('C', 'K', new Converter_C_K()),
    K_C('K', 'C', new Converter(){
        @Override
        public float convert(float tempIn) {
            return (float) (tempIn - 273.15);
        }
    }),
    F_C('F', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32) * 5 / 9;
        }
    });
//    F_K,
//    K_F;

    private char inputTempUnit;
    private char outputTempUnit;

    private Converter converter;


    TemperatureConvert(char inputTempUnit, char outputTempUnit, Converter converter) {
        this.inputTempUnit = inputTempUnit;
        this.outputTempUnit = outputTempUnit;
        this.converter = converter;
    }

    public static float convertTemperature(char inputTempUnit, char outputTempUnit, float valueOfTemp){
        for (TemperatureConvert temperatureConvert: values()){
            if (temperatureConvert.inputTempUnit == inputTempUnit && temperatureConvert.outputTempUnit == outputTempUnit){
                return temperatureConvert.converter.convert(valueOfTemp);
            }
        }
        return 0f;
    }
}

