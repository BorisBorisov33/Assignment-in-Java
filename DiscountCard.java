import java.util.ArrayList;
/*Class DiscountCard whose objects store DiscountProducts objects*/

public class DiscountCard {
    ArrayList<Card> discountCard = new ArrayList<>();

    /*A class DiscountProduct that contains the discount type,turnover for the previous month and initial discount rate*/
    public class DiscountProduct implements Card {

        private String discountType;
        private int turnover;
        private int purchaseValue;
        private double discount_rate;

        /* Constructor for the class DiscountProduct with @param discountType the type of discount,
           @param turnover the turnover of the previous month,@param purchaseValue the purchase value
           and @param dicount_rate the initial dicount_rate*/
        public DiscountProduct(String discountType, int turnover, int purchaseValue, double discount_rate) {
            this.discountType = discountType;
            this.turnover = turnover;
            this.purchaseValue = purchaseValue;
            this.discount_rate = discount_rate;
        }

        /*Accessor method @return discountType the discountType of the discount*/
        public String getDiscountType() {
            return discountType;
        }

        /*Accessor method @return turnover the turnover of the previous month*/
        public int getTurnover() {
            return turnover;
        }

        /*Accessor method @return purchaseValue the purchase Value */
        public int getPurchaseValue() {
            return purchaseValue;
        }


        /*Accessor method @return dicount_rate the dicount rate of discount type*/
        public double getDiscount() {
            return discount_rate;
        }


        // Method check that is checking whether the purchase value is negative
        public void check(int purchaseValue,int turnover) throws NegattiveAmmountException {
            if(purchaseValue < 0 || turnover<0) {
                throw new NegattiveAmmountException(purchaseValue,turnover);
            }
        }
    }

    /*Constructor for the class DiscountCard*/
    public DiscountCard() {
    }

    /*Mutator method for adding a discount card
     * @param discountCard the discount card */
    public void add(Card card) {
        discountCard.add(card);
    }

    /* Accessor method for computing the discount for a Discount product given with its String typeDiscount
     * @param typeDiscount the type of the discount
     * @return totalprice the total price of the product*/
    public double calculateDiscount(String typeDiscount) {
        double totalprice = 0;
        for (Card c : discountCard) {
            if (c.getDiscountType().equals(typeDiscount)) {
                if (c.getTurnover() > 100 && c.getTurnover() < 300 && c.getDiscount() == 0.01) {
                    totalprice = c.getPurchaseValue() - c.getPurchaseValue() * c.getDiscount();
                } else if (c.getTurnover() > 300 && c.getDiscount() == 0.025) {
                    totalprice = c.getPurchaseValue() - c.getPurchaseValue() * c.getDiscount();
                } else if (c.getTurnover() < 100 && c.getDiscount() == 0) {
                    totalprice = c.getPurchaseValue() - c.getPurchaseValue() * c.getDiscount();
                }
            }
            if (c.getDiscountType().equals(typeDiscount)) {
                if (c.getTurnover() > 300 && c.getDiscount() == 0.035) {
                    totalprice = c.getPurchaseValue() - c.getPurchaseValue() * c.getDiscount();
                } else if (c.getTurnover() < 300 && c.getDiscount() == 0.02) {
                    totalprice = c.getPurchaseValue() - c.getPurchaseValue() * c.getDiscount();
                }
            }
            if (c.getDiscountType().equals(typeDiscount)) {
                if (c.getTurnover() < 100 && c.getDiscount() == 0.02) {
                    totalprice = c.getPurchaseValue() - c.getPurchaseValue() * c.getDiscount();
                } else if (c.getTurnover() > 100 && c.getTurnover() < 200 && c.getDiscount()==0.01) {
                    totalprice = c.getPurchaseValue() - c.getPurchaseValue() * c.getDiscount();
                }else if (c.getTurnover() > 200 && c.getTurnover() < 300 && c.getDiscount()==0.02) {
                    totalprice = c.getPurchaseValue() - c.getPurchaseValue() * c.getDiscount();
                }else if (c.getTurnover() > 300 && c.getTurnover() < 400 && c.getDiscount()==0.03) {
                    totalprice = c.getPurchaseValue() - c.getPurchaseValue() * c.getDiscount();
                } else if (c.getTurnover() > 400 && c.getTurnover() < 500 && c.getDiscount()==0.04) {
                    totalprice = c.getPurchaseValue() - c.getPurchaseValue() * c.getDiscount();
                } else if (c.getTurnover() > 500 && c.getTurnover() < 600 && c.getDiscount()==0.05) {
                    totalprice = c.getPurchaseValue() - c.getPurchaseValue() * c.getDiscount();
                } else if (c.getTurnover() > 600 && c.getTurnover() < 700 && c.getDiscount()==0.06) {
                    totalprice = c.getPurchaseValue() - c.getPurchaseValue() * c.getDiscount();
                }else if (c.getTurnover() > 700 && c.getTurnover() < 800 && c.getDiscount()==0.07) {
                    totalprice = c.getPurchaseValue() - c.getPurchaseValue() * c.getDiscount();
                }else if (c.getTurnover() > 800 && c.getTurnover() < 900 && c.getDiscount()==0.08) {
                    totalprice = c.getPurchaseValue() - c.getPurchaseValue() * c.getDiscount();
                }else if (c.getTurnover() > 900 && c.getTurnover() < 1000 && c.getDiscount()==0.09) {
                    totalprice = c.getPurchaseValue() - c.getPurchaseValue() * c.getDiscount();
                }else if (c.getTurnover() >= 1000 && c.getDiscount()==0.10) {
                    totalprice = c.getPurchaseValue() - c.getPurchaseValue() * c.getDiscount();
                }
            }
        }



        return totalprice;
    }
}


