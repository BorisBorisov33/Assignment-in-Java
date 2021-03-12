public class TestDiscountCard {

    public static void main(String[] args) {

try {
    DiscountCard discountCard = new DiscountCard();

    DiscountCard.DiscountProduct card1 = discountCard.new DiscountProduct("bronze", 0, 150, 0);
    DiscountCard.DiscountProduct card2 = discountCard.new DiscountProduct("silver", 600, 850, 0.035);
    DiscountCard.DiscountProduct card3 = discountCard.new DiscountProduct("golden", 1500, 1300, 0.10);


    discountCard.add(card1);
    discountCard.add(card2);
    discountCard.add(card3);


    System.out.println("Total " + "$" + discountCard.calculateDiscount("bronze"));
    System.out.println("Total " + "$" + discountCard.calculateDiscount("silver"));
    System.out.println("Total " + "$" + discountCard.calculateDiscount("golden"));

    card1.check(card1.getPurchaseValue(),card1.getTurnover());
    card2.check(card2.getPurchaseValue(),card2.getTurnover());
    card3.check(card3.getPurchaseValue(),card3.getTurnover());
    }
    catch(NegattiveAmmountException e1){
    System.out.println("Try again! The purchase value or the turnover is negative, please check and enter positive value!");
    }

    }

}
