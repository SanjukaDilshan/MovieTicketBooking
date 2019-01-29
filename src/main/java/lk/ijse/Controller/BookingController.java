package lk.ijse.Controller;

import lk.ijse.DTO.BookingDTO;
import lk.ijse.DTO.FilmDTO;
import lk.ijse.Model.Booking;
import lk.ijse.Service.BookingService;
import lk.ijse.Service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "api/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveBooking(@RequestBody BookingDTO bookingDTO){
        return bookingService.saveBooking(bookingDTO);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<BookingDTO> getAllBooking(){return bookingService.getAllBooking();}


}
