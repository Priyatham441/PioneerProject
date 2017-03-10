package com.shoppingcart.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingcart.models.Customer;
import com.shoppingcart.service.dao.CustomerService;
import com.shoppingcart.service.dao.LoginService;

@Controller
public class LoginAndRegisterController {
	@Autowired
	private LoginService loginService;

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@Autowired
	private CustomerService customerService;

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@RequestMapping("/")
	public String indexForm() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, ModelAndView mv) {
		String username = request.getParameter("userName");
		String password = request.getParameter("password");

		boolean userFound = loginService.getLoginDetails(username, password);

		if(userFound){
			 mv = new ModelAndView("viewemp", "msg", "Welcome " + username);
		}else{
			mv = new ModelAndView("index","msg","Login Failed. Please check your Credentails..");
		}
		return mv;
		
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register1() {
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView registerCustomer(HttpServletRequest request, Customer customer) {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String phoneNo = request.getParameter("phoneNo");

		customer.setFirstname(firstName);
		customer.setLastname(lastName);
		customer.setMailid(email);
		customer.setPassword(password);
		customer.setPhoneNo(phoneNo);
		// to register employee object in database
		customerService.save(customer);

		return new ModelAndView("regsuccess", "msg", "Your Registration is Successfully done..!");

	}

	/*
	 * @RequestMapping("/Registration") public ModelAndView showform(){
	 * 
	 * 
	 * return new ModelAndView("index","command",new Employee()); }
	 */

	/*
	 * @RequestMapping(value="/login",method = RequestMethod.GET) public
	 * ModelAndView loginform(){ // to load login from return new
	 * ModelAndView("login");
	 * 
	 * }
	 * 
	 * 
	 * @RequestMapping(value="/login",method = RequestMethod.POST) public
	 * ModelAndView login(){ // to load login from return new
	 * ModelAndView("login");
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @RequestMapping(value="/logincontroller",method = RequestMethod.POST)
	 * public ModelAndView getEmployee(@ModelAttribute("Employee")Employee emp){
	 * //System.out.println("controller:"+emp.getId()); Employee
	 * emp1=dao.getEmployeeById(emp.getId()); //System.out.println(new
	 * ModelAndView("viewemp","emp",emp1));
	 * 
	 * return new ModelAndView("viewemp","emp",emp1); }
	 * 
	 * 
	 * @RequestMapping(value="/emplist",method=RequestMethod.GET) public
	 * ModelAndView listform(){ // to load login from return new
	 * ModelAndView("emplist");
	 * 
	 * }
	 * 
	 * 
	 * @RequestMapping(value="/emplistcontroller",method = RequestMethod.POST)
	 * public ModelAndView getAllEmployees(@ModelAttribute("Employee")Employee
	 * emp){
	 * 
	 * List<Employee> list=dao.getEmployees();
	 * 
	 * 
	 * return new ModelAndView("viewemps","list",list); }
	 */
	/*
	 * @RequestMapping(value="/logincontroller",method = RequestMethod.POST)
	 * public ModelAndView loginController(@ModelAttribute("emp") Employee emp)
	 * { dao.save(emp); return new ModelAndView("/login");
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public ModelAndView executeLogin(HttpServletRequest request,
	 * HttpServletResponse response, @ModelAttribute("loginBean")LoginBean
	 * loginBean) 33 { 34 ModelAndView model= null; 35 try 36 { 37 boolean
	 * isValidUser = loginDelegate.isValidUser(loginBean.getUsername(),
	 * loginBean.getPassword()); 38 if(isValidUser) 39 { 40
	 * System.out.println("User Login Successful"); 41
	 * request.setAttribute("loggedInUser", loginBean.getUsername()); 42 model =
	 * new ModelAndView("welcome"); 43 } 44 else 45 { 46 model = new
	 * ModelAndView("login"); 47 model.addObject("loginBean", loginBean); 48
	 * request.setAttribute("message", "Invalid credentials!!"); 49 } 50
	 * 
	 * 51 } 52 catch(Exception e) 53 { 54 e.printStackTrace(); 55 } 56
	 * 
	 * 57 return model; 58 }
	 * 
	 */

	/*
	 * ***************
	 * 
	 * @RequestMapping(value={"/register"}) public ModelAndView register(){
	 * System.out.println("hello"); ModelAndView m=new ModelAndView("index");
	 * m.addObject("msg", "hii");
	 * 
	 * return m; }
	 */

}