/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pdh.hibernate;

import com.pdh.pojo.Product;
import com.pdh.repositories.impl.CategoryRepositoryImpl;
import com.pdh.repositories.impl.ProductRepositoryImpl;
import com.pdh.repositories.impl.StatsRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
        CategoryRepositoryImpl s1 = new CategoryRepositoryImpl();
        s1.getCates().forEach(c -> System.out.print(c.getName() + "\n"));
        ProductRepositoryImpl s = new ProductRepositoryImpl();
//        Map<String,String> params = new HashMap();
//        
////        params.put("kw", "");
//        params.put("orderBy", "price");
//        params.put("page", "1");
//        s.getProducts(params).forEach(p -> System.out.printf("%s \t %.1f\n",p.getName(), p.getPrice()));

//            Product p = new Product();
//            p.setName("asdf");
//            p.setPrice(3232l);
//            p.setCategoryId(s1.getCateById(1));
//            
//            s.addOrUpdate(p);

        StatsRepositoryImpl s3 = new StatsRepositoryImpl();
        s3.getRevenueByProduct().forEach(o -> System.out.printf("%d - %s: %d\n", o[0], o[1], o[2]));
    }
}
