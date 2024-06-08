package com.tananh.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tananh.modal.KhachHang;

@Repository
public interface KhachHangRespository extends JpaRepository<KhachHang, Integer>{

	@Query("SELECT k.idKh FROM KhachHang k WHERE k.idNd = :idNd")
	Integer findIdKhByIdNd(@Param("idNd") Long idNd);
}
