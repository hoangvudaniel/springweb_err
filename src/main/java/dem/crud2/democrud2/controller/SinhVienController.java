/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dem.crud2.democrud2.controller;

import dem.crud2.democrud2.service.SinhVienDTO;
import dem.crud2.democrud2.service.SinhVienService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */
@RestController
@RequestMapping("/sinhvien")
public class SinhVienController {

    @Autowired
    SinhVienService service;

    @GetMapping
    public List<SinhVienDTO> getAll() {
        return service.getAll();
    }
}
