package uk.co.utilita.wts.contacts;

import java.util.Date;

public class Search2 extends Search {

    //Search search = new Search();
    static int amount;
    static Date date;
    int balance;

    public static void main(String[] args) {
        main("");
    }
    public static void main(String args) {
        amount = 630;
        date = null;
        new Search2().balance = 200;
    }

    @Override
    public void getDate() {
        System.out.println(Search.SCORE);
    }


}
