package Product.Manager;

import Product.Model.Product;

import java.util.ArrayList;


public class ProductManager implements Manager<Product> {
    ArrayList<Product> listProduct = new ArrayList<>();
    public ProductManager(){
    }

    @Override
    public void add(Product product) {
        listProduct.add(product);
    }

    @Override
    public void remove(int id) {
        int index = findIndexByID(id);
        listProduct.remove(index);
    }

    @Override
    public int findIndexByID(int id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if(listProduct.get(i).getId() == id){
                return i;
            }
        }return -1;
    }

    @Override
    public void update(int id, Product product) {
            int index = findIndexByID(id);
            listProduct.set(index,product);
    }

    @Override
    public void findProductByName(String name) {
        for (Product product : listProduct) {
            if(product.getName().indexOf(name) >= 0){
                System.out.println(product);
            }
        }
    }

    @Override
    public ArrayList<Product> findAll() {
        return listProduct;
    }


    public ArrayList<Product> findByName(String name) {
        ArrayList<Product> listShearch = new ArrayList<>();
        for (Product item : listProduct){
            if(item.getName().toLowerCase().contains(name.toLowerCase())){
                listShearch.add(item);
            }
        }
        return listShearch;
    }


    public void findOverPrice(double minPrice, double maxPrice) {

    }
}
