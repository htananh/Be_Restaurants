package com.tananh.service;

import com.tananh.exception.UserException;

public interface KhachHangService {
	public int getIdkhFromIdnd(Long idnd) throws UserException;
}
