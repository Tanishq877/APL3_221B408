class Gin extends Decorator{
    Gin(Offering offering)
    {
        this.offer = offering;
    }
    String getName(){
        return offer.getName() +"with Gin";
    }
    int getPrice(){
        return offer.getPrice() + 45;
    }
}