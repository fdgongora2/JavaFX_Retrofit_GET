package com.example.demoretrofit;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductoModelo {

    @SerializedName("productCode")
    @Expose
    private String productCode;
    @SerializedName("productName")
    @Expose
    private String productName;
    @SerializedName("productLine")
    @Expose
    private String productLine;
    @SerializedName("productScale")
    @Expose
    private String productScale;
    @SerializedName("productVendor")
    @Expose
    private String productVendor;
    @SerializedName("productDescription")
    @Expose
    private String productDescription;
    @SerializedName("quantityInStock")
    @Expose
    private Integer quantityInStock;
    @SerializedName("buyPrice")
    @Expose
    private Double buyPrice;
    @SerializedName("MSRP")
    @Expose
    private Double msrp;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getProductScale() {
        return productScale;
    }

    public void setProductScale(String productScale) {
        this.productScale = productScale;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getMsrp() {
        return msrp;
    }

    public void setMsrp(Double msrp) {
        this.msrp = msrp;
    }
}
