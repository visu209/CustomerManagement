package com.shop.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.shop.site.model.Address;
import com.shop.site.model.Customer;
import com.shop.site.service.CustomerService;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public String getCustomer(ModelMap model) {
        return "CustomerIndex";
    }

    @RequestMapping(value = "/customer/save", method = RequestMethod.POST)
    public View CreateCustomer(@ModelAttribute
    Customer customer, @ModelAttribute
    Address address, ModelMap model) {
        customerService.addCustomer(customer, address);
        return new RedirectView("/CustomerManagement/customer");
    }

    @RequestMapping(value = "/customer/list", method = RequestMethod.GET)
    public String getCustomerList(ModelMap model) {
        model.addAttribute("customerList", customerService.listCustomer());
        return "CustomerDetails";
    }

    @RequestMapping(value = "/customer/search", method = RequestMethod.GET)
    public String redirectToCustomerSearch(ModelMap model) {
        return "CustomerSearch";
    }

    @RequestMapping(value = "/customer/findByName", method = RequestMethod.POST)
    public String customerSearchByName(@RequestParam("name")
    String customerName, ModelMap model) {
        List<Customer> customers = customerService.searchCustomerByName(customerName);
        if (null != customers || !customers.isEmpty()) {
            model.addAttribute("customerList", customers);
        }
        return "CustomerSearch";
    }

    @RequestMapping(value = "/customer/findByPhoneNumber", method = RequestMethod.POST)
    public String customerSearchByPhone(@RequestParam("phone")
    String customerPhone, ModelMap model) {
        List<Customer> customers = customerService.searchCustomerByPhone(customerPhone);
        if (null != customers || !customers.isEmpty()) {
            model.addAttribute("customerList", customers);
        }
        return "CustomerSearch";
    }

    @RequestMapping(value = "/customer/redirectToHome", method = RequestMethod.GET)
    public View redirectToHome(ModelMap model) {
        return new RedirectView("/CustomerManagement/customer");
    }
    
    @RequestMapping(value = "/customer/delete", method = RequestMethod.GET)
    public View deleteCustomer(@ModelAttribute Customer customer, ModelMap model) {
        customerService.deleteCustomer(customer);
        return new RedirectView("/CustomerManagement/customer/list");
    }

}
