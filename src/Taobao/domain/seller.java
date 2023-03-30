package Taobao.domain;

public class seller {
    private int seller_rid;
    private String seller_name;
    private float balance;

    public seller() {
    }

    public seller(int seller_rid, String seller_name, float balance) {
        this.seller_rid = seller_rid;
        this.seller_name = seller_name;
        this.balance = balance;
    }

    public int getSeller_rid() {
        return seller_rid;
    }

    public void setSeller_rid(int seller_rid) {
        this.seller_rid = seller_rid;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
