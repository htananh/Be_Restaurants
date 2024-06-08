package com.tananh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tananh.modal.HoaDon;
import com.tananh.respository.HoaDonRespository;

@Service
public class HoaDonServiceImpl implements HoaDonService{

	@Autowired HoaDonRespository hoaDonRespository;

	@Override
	public HoaDon CreateHoaDon(HoaDon hoadon) {
		
		return hoaDonRespository.save(hoadon);
	}
}
