package com.tananh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tananh.exception.UserException;
import com.tananh.respository.KhachHangRespository;

@Service
public class KhachHangServiceImpl implements KhachHangService{
	@Autowired private KhachHangRespository khachHangRespository;

	@Override
	public int getIdkhFromIdnd(Long idnd) throws UserException {
		Integer idKh = khachHangRespository.findIdKhByIdNd(idnd);
		 if (idKh != null) {
	            return idKh;
	     }
		throw new UserException("không tìm thấy id khách hàng");
	}
}
