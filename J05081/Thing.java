class Thing implements Comparable<Thing> {
    private String code, name, unit;
    private int buy, sell;
    Thing(){}
    public void set_thing(String code, String name, String unit, int buy, int sell){
        this.code = code;
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
    }
    @Override
    public int compareTo(Thing thing){
        return this.sell - this.buy;
    }
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.unit + " " + this.buy + " " + this.sell + " " + (this.sell-this.buy);
    }

}

