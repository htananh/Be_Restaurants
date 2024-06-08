package com.tananh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tananh.modal.HoaDon;
import com.tananh.respository.HoaDonRespository;
import com.tananh.service.HoaDonService;

@RestController
@RequestMapping("hoadon")
public class HoaDonController {
	@Autowired HoaDonService hoaDonService;
	@Autowired HoaDonRespository hoaDonRespository;
	@PostMapping("/new")
	public ResponseEntity<HoaDon> addFood(@RequestBody HoaDon hoadon) {
		Long lastId = hoaDonRespository.findLastIdHoaDon();
	    
	    // Nếu không có hóa đơn nào trong cơ sở dữ liệu, sử dụng ID bắt đầu từ 1
	    Long nextId = (lastId == null) ? 1L : lastId + 1;
	    
	    // Gán ID mới cho đối tượng hoadon
	    hoadon.setIdHoaDon(nextId);
		hoadon = hoaDonService.CreateHoaDon(hoadon);
        return ResponseEntity.status(201).body(hoadon);
    }
}
