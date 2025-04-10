class Rum extends Decorator{
    Rum(Offering offering)
    {
        this.offer = offering;
    }
    String getName(){
        return offer.getName() + "with Rum";
    }
    int getPrice(){
        return offer.getPrice() + 55;
    }
}