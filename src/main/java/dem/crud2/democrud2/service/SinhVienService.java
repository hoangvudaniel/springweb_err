/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dem.crud2.democrud2.service;

import dem.crud2.democrud2.repository.SinhVienRepository;
import dem.crud2.democrud2.service.mapping.SinhVienMapping;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Admin
 */
public class SinhVienService {
    @Autowired
    SinhVienRepository repository;
    @Autowired
    SinhVienMapping mapper;
    public List<SinhVienDTO> getAll(){
        return repository.findAll().stream().map(mapper::toDTO).collect(Collectors.toList());
        
    }
    
}
