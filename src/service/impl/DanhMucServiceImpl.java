/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import domainmodel.DanhMuc;
import java.util.List;
import repository.DanhMucRepository;
import repository.impl.DanhMucRepositoryImpl;
import service.DanhMucService;

/**
 *
 * @author hangnt
 */
public class DanhMucServiceImpl implements DanhMucService {

    private final DanhMucRepository danhMucRepository = new DanhMucRepositoryImpl();

    @Override
    public List<DanhMuc> getAllDanhMuc() {
        return danhMucRepository.getAll();
    }

}
