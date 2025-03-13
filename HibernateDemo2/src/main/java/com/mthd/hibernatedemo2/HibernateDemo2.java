/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mthd.hibernatedemo2;

import com.mthd.repositoties.impl.CategoryRepositoryImpl;
import com.mthd.repositoties.impl.ProductRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemo2 {

    public static void main(String[] args) {
        CategoryRepositoryImpl s = new CategoryRepositoryImpl();
        s.getCates().forEach(c -> System.out.println(c.getName()));

        ProductRepositoryImpl prod = new ProductRepositoryImpl();
        Map<String, String> params = new HashMap<>();
        params.put("kw", "galaxy");
        params.put("fromPrice", "18600000");
        prod.getProducts(params).forEach(p -> System.out.printf("%d - %s: %.1f\n", p.getId(), p.getName(), p.getPrice()));
    }
}
