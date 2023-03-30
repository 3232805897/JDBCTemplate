package Taobao.domain;

public class goods {
    private int goods_id;
    private String goods_name;
    private double price;
    private int owner_id;

    public goods() {
    }

    public goods(int goods_id, String goods_name, double price, int owner_id) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.price = price;
        this.owner_id = owner_id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }
}
