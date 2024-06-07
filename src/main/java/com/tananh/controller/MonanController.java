package com.tananh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
