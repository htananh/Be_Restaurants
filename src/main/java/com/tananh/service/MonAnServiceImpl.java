package com.tananh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tananh.modal.MonAn;
import com.tananh.respository.MonAnRepository;
@Service
public class MonAnServiceImpl implements MonAnService{
	 @Autowired
	  private MonAnRepository monAnRepository;
	@Override
	public List<MonAn> getAllMonAn() {
		 return monAnRepository.findAll();
	}

}
