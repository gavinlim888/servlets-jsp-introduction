/*
 * Copyright ActiveLearning, Inc.
 * http://www.activelearning.ph
 * @author Gavin C. Lim
 */
package ph.grocerific.estore.web;

import java.util.ArrayList;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import ph.grocerific.estore.domain.Product;

/**
 * Web application lifecycle listener.
 *
 * @author Gavin Lim
 */
public class GrocerificContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product();
        product1.setId(1);
        product1.setDescription("Milk");
        product1.setSize("1 liter");
        product1.setPrice(75f);
        products.add(product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setDescription("Butter");
        product2.setSize("100g");
        product2.setPrice(56f);
        products.add(product2);

        Product product3 = new Product();
        product3.setId(3);
        product3.setDescription("Chocolate Ice Cream");
        product3.setSize("1 pint");
        product3.setPrice(67f);
        products.add(product3);

        sce.getServletContext().setAttribute("products", products);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
