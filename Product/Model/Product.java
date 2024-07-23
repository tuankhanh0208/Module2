package Product.Model;

import java.util.Arrays;

public class Product {
    private String name;
    private double price;
    private int id;
//    private double [] report;
    public Product(){
    }
    public Product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
//        this.report=report;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public double[] getReport() {
//        return report;
//    }
//
//    public void setReport(double[] report) {
//        this.report = report;
//    }
    @Override
    public String toString(){
        return "ID: " + getId() + " Name: " + getName() + " Price: " + getPrice();
    }
//    public double averger(){
//        int sum=0;
//        for (int i = 0; i <report.length ; i++) {
//            sum+=report[i];
//        }int avg = sum/report.length;
//        return avg;
//    }
}
