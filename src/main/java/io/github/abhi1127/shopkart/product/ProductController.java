package io.github.abhi1127.shopkart.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//  Rest = representational state transfer
// JSON = javascript object notation

@RestController
public class ProductController {
    private ProductService productservice;

    @Autowired
    public ProductController(ProductService productservice) {
        this.productservice = productservice;
    }

    // CREATE - post
    @PostMapping("/products/add")
    public Product addProduct(@RequestBody Product product){
        productservice.addProduct(product);
        return product;
    }
    // READ - get
    // UPDATE -put
    // DELETE -delete
    // REQUEST - HTTP METHOD & URL
    // RESPONSE - HTTP STATUS & RESPONSES BODY
}
