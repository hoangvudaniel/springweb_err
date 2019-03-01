package dem.crud2.democrud2.service.mapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatetimeConverter {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
    public String dateToString(Date d){
        return  simpleDateFormat.format(d);
    }
    public Date stringToDate(String s){
        try {
            return simpleDateFormat.parse(s);
        }catch (ParseException pe){
        }catch(Exception ex){
            
        }
        return null;

    }
}
