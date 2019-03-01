/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dem.crud2.democrud2.repository;

import dem.crud2.democrud2.entity.Sinhvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public interface SinhVienRepository extends JpaRepository<Sinhvien, Integer>{
    
}
