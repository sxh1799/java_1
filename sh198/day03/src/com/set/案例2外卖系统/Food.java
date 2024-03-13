package com.set.案例2外卖系统;

// 实体类JavaBean，用生成存储的数据项
public class Food {
    private String name;
    private double originalPrice;
    private double specialPrice;
    private String info;

    public Food(){}

    public Food(String name, double originalPrice, double specialPrice, String info) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.specialPrice = specialPrice;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(double specialPrice) {
        this.specialPrice = specialPrice;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
