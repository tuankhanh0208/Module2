package Product.Manager;

import Product.Model.Customer;

import java.util.ArrayList;

public class CustomerManager implements Manager <Customer> {
    ArrayList<Customer> listCustomer = new ArrayList<>();


    @Override
    public void add(Customer customer) {
        listCustomer.add(customer);
    }

    @Override
    public void remove(int id) {
        int index =findIndexByID(id);
        listCustomer.remove(index);
    }

    @Override
    public int findIndexByID(int id) {
        for (int i = 0; i <listCustomer.size() ; i++) {
            if (listCustomer.get(i).getId() == id){
                return i;
            }
        }
        return 0;
    }

    @Override
    public void update(int id, Customer customer) {
        int index =findIndexByID(id);
        listCustomer.set(index,customer);
    }

    @Override
    public void findProductByName(String name) {
        for (Customer customer : listCustomer){
            if(customer.getName().indexOf(name) >= 0){
                System.out.println(customer);
            }
        }
    }

    @Override
    public ArrayList<Customer> findAll() {
        return null;
    }


    public ArrayList<Customer> findByName(String name) {
//        for (Customer customer : listCustomer){
//            if(customer.equalsIgnoreCase(name)){
//                System.out.println(customer);
//            }
//        }
        return null;
    }
    public ArrayList<Customer> findOverPrice(double minPrice, double maxPrice) {
        return null;
    }
}
