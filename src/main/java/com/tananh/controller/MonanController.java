package com.tananh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tananh.exception.MonanException;
import com.tananh.modal.MonAn;
import com.tananh.service.MonAnService;
@RestController
@RequestMapping("/foods")
public class MonanController {
	@Autowired
    private MonAnService monAnService;

	@GetMapping
    public ResponseEntity<List<MonAn>> getAllFoods() {
        List<MonAn> foods = monAnService.getAllMonAn();
        return ResponseEntity.ok(foods);
    }
	
	@GetMapping("/{id}")
    public ResponseEntity<MonAn> getFoodById(@PathVariable Integer id) throws MonanException {
		MonAn monan = monAnService.getMonAnById(id);
		return ResponseEntity.ok(monan);
	}
	@PostMapping("/new")
    public ResponseEntity<MonAn> addFood(@RequestBody MonAn food) {
		MonAn newFood = monAnService.addFood(food);
        return ResponseEntity.status(201).body(newFood);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MonAn> updateFood(@PathVariable Integer id, @RequestBody MonAn foodDetails) throws MonanException {
    	MonAn updatedFood = monAnService.updateFood(id, foodDetails);
        return ResponseEntity.ok(updatedFood);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFood(@PathVariable Integer id) throws MonanException {
    	monAnService.deleteFood(id);
        return ResponseEntity.ok().build();
    }
}
