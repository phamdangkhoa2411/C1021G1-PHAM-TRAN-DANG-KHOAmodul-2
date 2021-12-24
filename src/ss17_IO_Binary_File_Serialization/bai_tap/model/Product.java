package ss17_IO_Binary_File_Serialization.bai_tap.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String ProductCode;
    private String ProductName;
    private String manufacturer;
    private double prices;

    public Product() {
    }

    public Product(String productCode, String productName, String manufacturer, double prices) {
        ProductCode = productCode;
        ProductName = productName;
        this.manufacturer = manufacturer;
        this.prices = prices;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String productCode) {
        ProductCode = productCode;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "ProductManagament{" +
                "ProductCode='" + ProductCode + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", prices=" + prices +
                '}';
    }
}
