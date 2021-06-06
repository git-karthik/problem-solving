package com.rk.designpatterns.prototype;

public abstract class BaseProduct implements Cloneable {

    private String productName;
    private String productCode;
    private double productPrice;
    private String currency;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }   

}
