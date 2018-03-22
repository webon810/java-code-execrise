package test4null.javacodetest800.javacodetest200.exam1;

public class exam1q30 {

    public int amount;

    public exam1q30(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }

    public void changeAmount(int x){
        amount += x;
    }

    public static void main(String[] args){
        exam1q30 acct = new exam1q30((int)(Math.random()*1000));

        //add each of line below to have output as 0
        acct.amount = 0;
        acct.changeAmount(-acct.amount);
        acct.changeAmount(-acct.getAmount());

        System.out.println(acct.getAmount());
    }
}
