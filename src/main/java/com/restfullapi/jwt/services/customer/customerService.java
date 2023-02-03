package com.restfullapi.jwt.services.customer;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.restfullapi.jwt.models.customer.customer;
import com.restfullapi.jwt.repositories.customerRepository;

@Service
public class customerService {

    @Autowired
    private customerRepository repository;

    // @Autowired
    // customer data;

    public customer storeCustomer(String id, String firstname, String lastName,
            String occupation, Integer phone,
            MultipartFile file) throws IOException {

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        customer data = new customer();
        data.setId(id);
        data.setFirstName(firstname);
        data.setLastName(lastName);
        data.setOccupation(occupation);
        data.setPhone(phone);
        data.setType(file.getContentType());
        data.setContent(fileName);
        data.setImage(file.getBytes());
        return repository.save(data);

    }

    public Optional<customer> findById(String id) {
        return repository.findById(id);
    }

}
