package com.exemple.model;

import com.exemple.da.ProductDataAccess;
import com.exemple.entity.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductFinderBean {

    private  String keyword;
    public void  setKeyword(String keyword){
        this.keyword = keyword;
    }

    public List<Product> getAllProduct() throws SQLException, ClassNotFoundException {
        ProductDataAccess productDataAccess =new ProductDataAccess();
       // productDataAccess.getProductByName("nokia");
        return  new ProductDataAccess().getProductsByName(keyword);
    }
}
