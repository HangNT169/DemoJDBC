/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.SanPham;
import java.util.List;
import viewmodel.SanPhamResponse;

/**
 *
 * @author hangnt
 */
public interface SanPhamRepository {

    List<SanPhamResponse> getAll();

    SanPham getOne(String id);

    boolean add(SanPham sanPham);

    boolean delete(String id);

    boolean update(String id, SanPham sanPham);

}
