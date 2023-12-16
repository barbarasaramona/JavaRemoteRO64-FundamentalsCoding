package design_patterns.creational.builder;

public class Coffe {
    private String type;
    private boolean withSuggar;
    private boolean withMilk;
    private String size;

    private Coffe(String type, boolean withSuggar, boolean withMilk, String size) {
        this.type = type;
        this.withSuggar = withSuggar;
        this.withMilk = withMilk;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Coffe{" +
                "type='" + type + '\'' +
                ", withSuggar=" + withSuggar +
                ", withMilk=" + withMilk +
                ", size='" + size + '\'' +
                '}';
    }

    public static class CoffeBuilder{
        private String type;
        private boolean withSuggar;
        private boolean withMilk;
        private String size;
        public CoffeBuilder(String type){
            this.type = type;
        }
        public CoffeBuilder withSuggar(boolean withSuggar){
            this.withSuggar = withSuggar;
            return this;
        }
        public CoffeBuilder withMilk(boolean withMilk) {
            this.withMilk = withMilk;
            return this;
        }
        public CoffeBuilder size(String size) {
            this.size = size;
            return this;
        }
        public Coffe build(){
            return new Coffe(this.type,this.withSuggar,this.withMilk,this.size);
        }
    }
}
