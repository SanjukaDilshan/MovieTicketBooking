package lk.ijse.Service;

import lk.ijse.DTO.BookingDTO;
import java.util.ArrayList;

public interface BookingService {


    public boolean saveBooking(BookingDTO bookingDTO);

    public ArrayList<BookingDTO> getAllBooking();
}
