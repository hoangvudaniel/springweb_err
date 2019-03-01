package dem.crud2.democrud2.service.mapping;

import dem.crud2.democrud2.entity.Sinhvien;
import dem.crud2.democrud2.service.SinhVienDTO;
import org.springframework.stereotype.Service;

@Service
public class SinhVienMapping implements IMapping<Sinhvien, SinhVienDTO> {

    DatetimeConverter convert = new DatetimeConverter();

    @Override
    public SinhVienDTO toDTO(Sinhvien t) {

        SinhVienDTO svdto = new SinhVienDTO();
        svdto.setMa(t.getMa());
        svdto.setTen(t.getTen());
        svdto.setNgaysinh(convert.dateToString(t.getNgaysinh()));
        return svdto;
    }

    @Override
    public Sinhvien toEntity(SinhVienDTO t) {
        if (t == null) {
            return null;
        }
        Sinhvien sv = new Sinhvien();
        sv.setMa(sv.getMa());
        sv.setTen(sv.getTen());
        sv.setNgaysinh(convert.stringToDate(t.getNgaysinh()));
        return sv;
    }
}
