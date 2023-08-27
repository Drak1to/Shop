package Shop;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    public ProductManager() {

    }

    public void productsAdd(Product product) {
        products.add(product);

    }

    public void getProductById(int id){
        for(Product produ: products){
            if( id == produ.getId()){
                System.out.println(produ);
            }
        }
    }
        public void getAllProducts(){
        for (Product p : products)
            System.out.println(p);

        }
}

