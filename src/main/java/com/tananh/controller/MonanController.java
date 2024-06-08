package com.tananh.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tananh.exception.MonanException;
import com.tananh.modal.MonAn;
import com.tananh.respository.MonAnRepository;
import com.tananh.service.MonAnService;
@RestController
@RequestMapping("/foods")
public class MonanController {
	@Autowired
    private MonAnService monAnService;
	@Autowired
	private MonAnRepository monAnRepository;
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
		food.setTrangThai("Dang kinh doanh");
		Integer lastMaMonAn = monAnRepository.findLastMaMonAn();
        
        // Nếu không có món ăn nào trong cơ sở dữ liệu, sử dụng mã bắt đầu từ 1
        Integer nextMaMonAn = (lastMaMonAn == null) ? 1 : lastMaMonAn + 1;
        
        // Gán mã món ăn mới cho đối tượng food
        food.setIdMonAn(nextMaMonAn);
		MonAn newFood = monAnService.addFood(food);
        return ResponseEntity.status(201).body(newFood);
    }

	 @PutMapping("/{id}")
	    public ResponseEntity<MonAn> updateFood(@PathVariable Integer id, @RequestBody MonAn foodDetails) throws MonanException {
	    	MonAn updatedFood = monAnService.updateFood(id, foodDetails);
	        return ResponseEntity.ok(updatedFood);
	        }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteFood(@PathVariable String id) throws MonanException {
    	int idParse = Integer.parseInt(id);
    	monAnService.deleteFood(idParse);
    	return new ResponseEntity<>("Đã xóa thành công", HttpStatus.OK);
        }
}
