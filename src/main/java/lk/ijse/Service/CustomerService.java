package lk.ijse.Service;

import lk.ijse.DTO.CustomerDTO;
import lk.ijse.DTO.FilmDTO;

import java.util.ArrayList;

public interface CustomerService {

    public boolean saveCustomer(CustomerDTO customerDTO);

    public ArrayList<CustomerDTO> getAllFilms();
}
