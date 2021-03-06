package com.bmassioui.springbootappmusql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/api") // This means URL's start with /api (after Application path)
public class ProductController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private ProductRepository productRepository;

    /**
     * Post Product
     * @param productName
     * @param price
     * @return
     */
    @PostMapping(path = "/add") // Map ONLY POST Requests
    public @ResponseBody String addProduct(@RequestParam String productName, @RequestParam double price) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Product product = new Product();
        product.setProductName(productName);
        product.setPrice(price);
        productRepository.save(product);

        return "Saved";
    }

    /**
     * Get Products
     * @return
     */
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Product> getProducts() {
        // This returns a JSON or XML with the users
        return productRepository.findAll();
    }
}
