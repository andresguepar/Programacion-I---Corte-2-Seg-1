package Ejercicio7.Controller;

import Ejercicio7.Modelo.Client;
import Ejercicio7.Modelo.Product;
import Ejercicio7.View.ProductView;

public class ProductController {
    private Product modelP;
    private ProductView viewP;

    public ProductController(Product modelP,ProductView viewP) {
        this.modelP = modelP;
        this.viewP = viewP;
    }

    public String getProductId() {
        return modelP.getProductId();
    }

    public void setProductId(String productId) {
        modelP.setProductId(productId);
    }

    public String getProductName() {
        return modelP.getProductName();
    }

    public void setProductName(String productName) {
        modelP.setProductName(productName);
    }

    public int getProductPrice() {
        return modelP.getProductPrice();
    }

    public void setProductPrice(int productPrice) {
        modelP.setProductPrice(productPrice);
    }

    public ProductView getViewP() {
        return viewP;
    }

    public void setViewP(ProductView viewP) {
        this.viewP = viewP;
    }

    public void updateViewP() {
        viewP.printProductDetails(modelP.getProductName(),modelP.getProductId(),modelP.getProductPrice());
    }
}
