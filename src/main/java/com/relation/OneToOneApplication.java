package com.relation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.relation.model.Belongings;
import com.relation.model.Customer;
import com.relation.repo.BelongingsRepo;
import com.relation.repo.CustomerRepo;

@SpringBootApplication
@RestController
public class OneToOneApplication {

	@Autowired
	private CustomerRepo cusRepo;

	@Autowired
	private BelongingsRepo bRepo;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@PostMapping("/addcust")
	public Customer addCust(@RequestBody Customer customer) {
		Customer save = cusRepo.save(customer);
		return save;
	}

	@PostMapping("/addbel")
	public Belongings addBelonging(@RequestBody Belongings belongings) {
		Belongings save = bRepo.save(belongings);
		return save;
	}

	@GetMapping("/get")
	public List<Belongings> getAllBelongings() {
		List<Belongings> findAll = bRepo.findAll();
		return findAll;
	}

	@GetMapping("/get/{id}")
	public Belongings findByBelongings(@PathVariable("id") Integer id) {
		Belongings belongings = bRepo.findById(id).get();
		return belongings;
	}
}
