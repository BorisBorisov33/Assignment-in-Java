public class NegattiveAmmountException extends Exception{

    private int purchasevalue;
    private int turnover;

    public  NegattiveAmmountException(int purchasevalue,int turnover){
        this.purchasevalue=purchasevalue;
        this.turnover=turnover;

    }

}
