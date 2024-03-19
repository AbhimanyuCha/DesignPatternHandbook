package com.practice;
import java.util.*;

public class App {
    private static List<Map<String, String>> coupons = new ArrayList<>();
    private static List<Map<String, String>> categories = new ArrayList<>();
    private static List<Map<String, String>> products = new ArrayList<>();


    static {
        coupons.add(Map.of("categoryName", "Comforter Sets", "CouponName", "Comforters Sale", "DateModified", "2020-01-01", "Discount", "10%"));
        coupons.add(Map.of("categoryName", "Comforter Sets", "CouponName", "Cozy Comforter Coupon", "DateModified", "2020-01-01", "Discount", "15%"));
        coupons.add(Map.of("categoryName", "Bedding", "CouponName", "Best Bedding Bargains", "DateModified", "2019-01-01", "Discount", "35%"));
        coupons.add(Map.of("categoryName", "Bedding", "CouponName", "Savings on Bedding", "DateModified", "2019-01-01", "Discount", "25%"));
        coupons.add(Map.of("categoryName", "Bed & Bath", "CouponName", "Low price for Bed & Bath", "DateModified", "2018-01-01", "Discount", "50%"));
        coupons.add(Map.of("categoryName", "Bed & Bath", "CouponName", "Bed & Bath extravaganza", "DateModified", "2019-01-01", "Discount", "75%"));

        categories.add(Map.of("CategoryName", "Comforter Sets", "CategoryParentName", "Bedding"));
        categories.add(Map.of("CategoryName", "Bedding", "CategoryParentName", "Bed & Bath"));
        categories.add(Map.of("CategoryName", "Bed & Bath", "CategoryParentName", "null"));
        categories.add(Map.of("CategoryName", "Soap Dispensers", "CategoryParentName", "Bathroom Accessories"));
        categories.add(Map.of("CategoryName", "Bathroom Accessories", "CategoryParentName", "Bed & Bath"));
        categories.add(Map.of("CategoryName", "Toy Organizers", "CategoryParentName", "Baby And Kids"));
        categories.add(Map.of("CategoryName", "Baby And Kids", "CategoryParentName", "null"));

        products.add(Map.of("ProductName", "Cozy Comforter", "Price", "100.00", "CategoryName", "Comforter Sets"));
        products.add(Map.of("ProductName", "All-in-one Bedding Set", "Price", "50.00", "CategoryName", "Bedding"));
        products.add(Map.of("ProductName", "Infinite Soap Dispenser", "Price", "500.00", "CategoryName", "Bathroom Accessories"));
        products.add(Map.of("ProductName", "Rainbow Toy Box", "Price", "257.00", "CategoryName", "Baby And Kids"));
    }

    public static void main(String[] args) {
        String[] sampleProducts = {"Bed & Bath", "Bedding", "Bathroom Accessories", "Comforter Sets"};

        //preprocess data
        //making categories to parentCategories mapping
        Map<String, String> parentMapping = new HashMap<>();
        Map<String, String> categoryToCouponMapping = new HashMap<>();

        for(var coupon : coupons){
            categoryToCouponMapping.put(coupon.get("categoryName") , coupon.get("CouponName"));
        }

        for(var categoryPair : categories){
            var categoryName = categoryPair.get("CategoryName");
            var categoryParentName = categoryPair.get("CategoryParentName");
            parentMapping.put(categoryName , categoryParentName);
        }

        //Part 1 :
        for(var productCategory : sampleProducts){
            var result = getCouponNameForProduct(productCategory, parentMapping, categoryToCouponMapping);
            System.out.println(result);
        }
    }

    public static String getCouponNameForProduct(String productCategory, Map<String, String> parentMapping, Map<String, String> categoryToCouponMapping) {
        while(parentMapping.containsKey(productCategory)){
            if(categoryToCouponMapping.containsKey(productCategory))
                return categoryToCouponMapping.get(productCategory);
            productCategory = parentMapping.get(productCategory);
        }
        return categoryToCouponMapping.get(productCategory);
    }


}
