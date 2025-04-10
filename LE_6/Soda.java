class Soda extends Decorator{
    Soda(Offering offering)
    {
        this.offer = offering;
    }
    String getName(){
        return offer.getName() + "with Soda";
    }
    int getPrice(){
        return offer.getPrice() + 35;
    }
}