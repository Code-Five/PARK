package com.ng.edu.binghamuni.park.Controller;

import com.ng.edu.binghamuni.park.Domain.CustomerInformation;
import com.ng.edu.binghamuni.park.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerContrllerHtml {
    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public String getHomePage(Model model){
        model.addAttribute("customers", customerService.getAllCustomer());
        return "FormContent";
    }

@PostMapping("/")
    public String saveCustomer(@ModelAttribute("customer")CustomerInformation customerInformation){
        customerService.saveCustomer(customerInformation);
        return "FormContent";
}


}
