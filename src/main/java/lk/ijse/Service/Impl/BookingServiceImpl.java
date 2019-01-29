package lk.ijse.Service.Impl;

import lk.ijse.DTO.BookingDTO;
import lk.ijse.DTO.FilmDTO;
import lk.ijse.Model.Booking;
import lk.ijse.Model.Customer;
import lk.ijse.Model.Film;
import lk.ijse.Repo.BookingRepo;
import lk.ijse.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepo bookingRepo;

    @Override
    public boolean saveBooking(BookingDTO bookingDTO) {


//        double f=bookingDTO.getSeat()*bookingDTO.getTotal();
//        double h=bookingDTO.getHalf()*bookingDTO.getTotal()/2;
//        double tnew=0;
//
//        tnew= f+h;
        Booking booking=new Booking(bookingDTO.getCustomer(),bookingDTO.getFilm(),bookingDTO.getTime(),bookingDTO.getDate(),bookingDTO.getSeat(),bookingDTO.getHalf(),bookingDTO.getTotal());



//        Film film=new Film();
//        Customer customer=new Customer(booking.getCustomer().getName(),booking.getCustomer().getNic(),booking.getCustomer().getAddress(),booking.getCustomer().getTp());
//        double fTot=film.getAmount()*booking.getFullseats();
//        double hTot=film.getAmount()*booking.getHalfseats();
//        double newTot=fTot+hTot;
//        Booking bookings=new Booking(booking.getFilm(),booking.getTime(),booking.getDate(),booking.getFullseats(),booking.getHalfseats(),newTot,customer);
        bookingRepo.save(booking);
        return true;
    }

    @Override
    public ArrayList<BookingDTO> getAllBooking() {
        List<Booking> bookings=bookingRepo.findAll();

        ArrayList<BookingDTO> bookingDTOS=new ArrayList<>();

        for(Booking booking: bookings){
            BookingDTO bookingDTO=new BookingDTO(booking.getBid(),booking.getCustomer(),booking.getFilm(),booking.getTime(),booking.getDate(),booking.getSeat(),booking.getHalf(),booking.getTotal());
            bookingDTOS.add(bookingDTO);
        }
        return bookingDTOS;
    }

}
