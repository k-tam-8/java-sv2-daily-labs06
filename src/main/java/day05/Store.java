package day05;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public boolean containsProduct(Product actual, List<ProductWithPeace> productPeaceList) {
        for(ProductWithPeace pwp : productPeaceList)
        if (actual.getType() == pwp.getType()) {
        }
            return true;
    }

    public List<ProductWithPeace> numberOfProductsByType() {
        List<ProductWithPeace> result = new ArrayList<>();
        for (Product actual : products) {
          //  ProductWithPeace productWithPeace = new ProductWithPeace(actual, result);

            if (containsProduct(actual, result)) {

            }else {
               // result.add(new ProductWithPeace(actual.getType()));
            }
        }
        return result;
    }
}
