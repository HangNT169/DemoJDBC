/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import domainmodel.SanPham;
import java.util.List;
import repository.SanPhamRepository;
import repository.impl.SanPhamRepositoryImpl;
import service.SanPhamService;
import viewmodel.SanPhamResponse;

/**
 *
 * @author hangnt
 */
public class SanPhamServiceImpl implements SanPhamService {

    private final SanPhamRepository sanPhamRepository = new SanPhamRepositoryImpl();

    @Override
    public List<SanPhamResponse> getAllSanPham() {
        return sanPhamRepository.getAll();
    }

    @Override
    public SanPham getOneSanPham(String id) {
        return sanPhamRepository.getOne(id);
    }

    @Override
    public String addSanPham(SanPham sanPham) {
        boolean add = sanPhamRepository.add(sanPham);
        if (add) {
            return "Add thanh cong";
        }
        return "Add that bai";
    }

    @Override
    public String updateSanPham(String id, SanPham sanPham) {
        boolean update = sanPhamRepository.update(id, sanPham);
        if (update) {
            return "Update thanh cong";
        }
        return "Update that bai";
    }

    @Override
    public String deleteSanPham(String id) {
        boolean delete = sanPhamRepository.delete(id);
        if (delete) {
            return "Xoa thanh cong";
        }
        return "Xoa that bai";
    }

}
