package com.restfullapi.jwt.controllers.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.restfullapi.jwt.models.customer.customer;
import com.restfullapi.jwt.models.uploads.responseMsg;
import com.restfullapi.jwt.services.customer.customerService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/customers")
public class customerController {

    @Autowired
    private customerService service;

    private Logger log = LoggerFactory.getLogger(customerController.class);

    // public customerController(customerService service) {
    // this.service = service;
    // }

    @RequestMapping(value = "/create-customer", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    ResponseEntity<responseMsg> save(@RequestParam("id") String id, @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("occupation") String occupation,
            @RequestParam("phone") Integer phone,
            @RequestParam("file") MultipartFile file) {
        String msg = "";
        try {
            service.storeCustomer(id, firstName, lastName, occupation, phone, file);
            msg = "create user successfully" + file.getOriginalFilename() + "\n" + file.getContentType() + "\n"
                    + file.getSize();

            return ResponseEntity.status(HttpStatus.OK).body(new responseMsg(msg));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new responseMsg(e));
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity<responseMsg> getCustomerId(@PathVariable("id") String id) {

        try {
            if (id == null || id.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new responseMsg(id));
            }

            return ResponseEntity.status(HttpStatus.OK).body(new responseMsg(service.findById(id)));

        } catch (Exception e) {
            log.info(id, new responseMsg(e.getMessage()));
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new responseMsg(e));
        }

    }

}
