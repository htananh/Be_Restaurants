package com.tananh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tananh.exception.MonanException;
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
	@Override
	public MonAn getMonAnById(Integer id) throws MonanException{
		Optional<MonAn> monan = monAnRepository.findById(id);
		if(monan.isPresent()) {
			return monan.get();
		}
		throw new MonanException("Không tồn tại món ăn với ID: "+id);
	}
	@Override
	public MonAn addFood(MonAn food) {
		// TODO Auto-generated method stub

       
		return monAnRepository.save(food);
	}
	@Override
	public MonAn updateFood(Integer id, MonAn foodDetails) throws MonanException{
			MonAn food = getMonAnById(id);
			food.setTenMon(foodDetails.getTenMon());
	        food.setLoai(foodDetails.getLoai());
	        food.setDonGia(foodDetails.getDonGia());
	        food.setDescription(foodDetails.getDescription());
	        food.setImage(foodDetails.getImage());
	        return monAnRepository.save(food);
	}
	@Override
	public void deleteFood(Integer id) throws MonanException{
		// TODO Auto-generated method stub
		MonAn food = getMonAnById(id);
		monAnRepository.delete(food);
	}


}
