package lk.ijse.Service.Impl;

import lk.ijse.DTO.CustomerDTO;
import lk.ijse.DTO.FilmDTO;
import lk.ijse.Model.Customer;
import lk.ijse.Model.Film;
import lk.ijse.Repo.CustomerRepo;
import lk.ijse.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) {
        Customer customer=new Customer(customerDTO.getName(),customerDTO.getNic(),customerDTO.getAddress(),customerDTO.getTp());
        customerRepo.save(customer);
        return true;
    }

    @Override
    public ArrayList<CustomerDTO> getAllFilms() {
        List<Customer> customers=customerRepo.findAll();

        ArrayList<CustomerDTO> customerDTOS=new ArrayList<>();

        for(Customer customer : customers){
            CustomerDTO customerDTO=new CustomerDTO(customer.getCid(),customer.getName(),customer.getNic(),customer.getAddress(),customer.getTp());

            customerDTOS.add(customerDTO);
        }
        return customerDTOS;
    }
}
