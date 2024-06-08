package com.tananh.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tananh.modal.HoaDon;

@Repository
public interface HoaDonRespository extends JpaRepository<HoaDon, Long>{
	@Query("SELECT MAX(h.idHoaDon) FROM HoaDon h")
    Long findLastIdHoaDon();
}
