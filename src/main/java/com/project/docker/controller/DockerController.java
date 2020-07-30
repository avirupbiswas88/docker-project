package com.project.docker.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.docker.domain.Product;
import com.project.docker.domain.ProductRepository;

@CrossOrigin
@RestController
@RequestMapping(value = "/docker")
public class DockerController {
	
	@Autowired
	ProductRepository productRepository;

	@GetMapping("/myapp")
	public String getMessages() {
		return "My First Docker Application";
	}

	@GetMapping("/products")
	public List<Product> getproducts(){
		List<Product> products = new ArrayList<>();
		Iterator<Product> prodIterate = productRepository.findAll().iterator();
		while(prodIterate.hasNext()) {
			products.add(prodIterate.next());
		}
		
		return products;
	}
	
	@GetMapping("/product/{id}")
	public Product getproducts(@PathVariable("id") String id){
		return productRepository.findById(Integer.valueOf(id)).get();
	}
	
	@PostMapping("/save")
	public void save() {
		
		productRepository.save(new Product("Leaf Rake","GDN-0011","March 19, 2019","Leaf rake with 48-inch wooden handle.",19.95f,3.2f,"assets/images/leaf_rake.png",null));
		productRepository.save(new Product("Garden Cart","GDN-0023","March 18, 2019","15 gallon capacity rolling garden cart",32.99f,4.2f,"assets/images/garden_cart.png",null));
		productRepository.save(new Product("Hammer","TBX-0048","May 21, 2019","Curved claw steel hammer",8.9f,4.8f,"assets/images/hammer.png",null));
		productRepository.save(new Product("Saw","TBX-0022","May 15, 2019","15-inch steel blade hand saw",11.55f,3.7f,"assets/images/saw.png",null));
		productRepository.save(new Product("Video Game Controller","GMG-0042","October 15, 2018","Standard two-button video game controller",35.95f,4.6f,"assets/images/xbox-controller.png",null));
		
	}
	
	@PostMapping("/saveproduct")
	public void saveProduct(@RequestBody Product product) {
		
		productRepository.save(product);
		
	}
	
	@PutMapping("/update/{id}")
	public void update(@RequestBody Product product,@PathVariable("id") String id) {
		
	//	productRepository.findById(Integer.valueOf(id)).get();
		productRepository.save(product);
		
	}

}
