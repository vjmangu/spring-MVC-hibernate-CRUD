package com.application.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.application.entity.Customer;
import com.application.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;	


	@RequestMapping(value="/list",method = RequestMethod.GET)
	public String showCustomers(Model model) throws Exception {
		System.out.println("in controller");
		List<Customer> customers = customerService.getCustomers();		
		//ModelAndView mv = new ModelAndView("customer-home");
		model.addAttribute("customers",customers);
		//mv.addObject("customers",customers);
		return "customer-home";
	}

	@RequestMapping(value="/customerForm",method = RequestMethod.GET)
	public String showCustomerForm(Model model) {
		model.addAttribute("subHeaderMessage", "New Customer Details");
		model.addAttribute(new Customer());
		return "customer-add-form";
	}
	@RequestMapping(value="/addCustomer", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer") Customer customer) {

		try {
			customerService.saveCustomer(customer);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/customer/list";
	}

	@RequestMapping(value="/updateCustomer", method = RequestMethod.GET)
	public ModelAndView updateCustomer(@RequestParam("customerId") int id) {
		Customer customer = null;
		ModelAndView mv = null;
		try {
			customer = customerService.getCustomerById(id);
			mv = new ModelAndView("customer-add-form");
			mv.addObject("subHeaderMessage", "Edit Customer Details");
			mv.addObject("customer",customer);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mv;
	}
	@RequestMapping(value="/deleteCustomer", method = RequestMethod.GET)
	public String deleteCustomer(@RequestParam("customerId") int id) throws Exception {

		customerService.deleteCustomerById(id);	

		return "redirect:/customer/list";
	}
}
