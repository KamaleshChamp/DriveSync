package com.project.capstone.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.capstone.entity.FeedbackEntity;
import com.project.capstone.entity.ListOfServicesEntity;
import com.project.capstone.entity.PaymentEntity;
import com.project.capstone.entity.Register;
import com.project.capstone.entity.RegistrationEntity;
import com.project.capstone.entity.RequestsEntity;
import com.project.capstone.entity.ResetPassowordEntity;
import com.project.capstone.repository.FeedbackRepository;
import com.project.capstone.repository.ListOfServicesRepository;
import com.project.capstone.repository.PaymentRepository;
import com.project.capstone.repository.RequestsRepository;
import com.project.capstone.service.FeedbackService;
import com.project.capstone.service.ListOfServicesService;
import com.project.capstone.service.LoginService;
import com.project.capstone.service.PaymentService;
import com.project.capstone.service.RegistrationService;
import com.project.capstone.service.RequestsService;
import com.project.capstone.service.ResetPasswordService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200/")
public class Controller{
	

	@Autowired
	private ListOfServicesRepository listofservicerepo;
	@Autowired
	private ListOfServicesService listofserviceservice;
	
	@Autowired
	private RequestsRepository requestrepo;
	@Autowired
	private RequestsService resquestservice;
	
	@Autowired
	private RegistrationService registrationservice;
	@Autowired
	private LoginService loginservice;
	
	@Autowired
	private FeedbackRepository feedbackrepo;
	@Autowired
	private PaymentRepository paymentrepo;
	@Autowired
	private PaymentService paymentservice;

	@Autowired
	private FeedbackService feedbackservice;

	@Autowired
	private ResetPasswordService resetpasswordservice;
	
	  
	// List of services
	@GetMapping("/getlistofservices/{id}")
	ResponseEntity<List<ListOfServicesEntity>> getListOfService(@PathVariable("id") int id) {
	    try {
	        List<ListOfServicesEntity> result = listofserviceservice.getList(id);
	        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@PostMapping("/postlistofservices")
	ResponseEntity<String> postListOfService(@RequestBody ListOfServicesEntity listofservicesentity) {
	    try {
	        listofservicerepo.save(listofservicesentity);
	        return new ResponseEntity<>(HttpStatus.ACCEPTED);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@PutMapping("/putlistofservices")
	ResponseEntity<String> putlistofservice(@RequestBody ListOfServicesEntity listofservicesentity) {
	    try {
	        listofservicerepo.save(listofservicesentity);
	        return new ResponseEntity<>(HttpStatus.ACCEPTED);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@DeleteMapping("/deletelistofservices/{id}")
	ResponseEntity<String> deleteListOfService(@PathVariable("id") int id) {
	    try {
	        listofservicerepo.deleteById(id);
	        return new ResponseEntity<>(HttpStatus.ACCEPTED);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	
	// Requests
	
	@PostMapping("/postrequest")
	ResponseEntity<List<RequestsEntity>> postRequest(@RequestBody RequestsEntity requestentity) {
	    try {
	        requestrepo.save(requestentity);
	        return new ResponseEntity<>(HttpStatus.ACCEPTED);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@GetMapping("/getrequest/{id}")
	ResponseEntity<List<RequestsEntity>> getRequest(@PathVariable("id") int id) {
	    try {
	        List<RequestsEntity> result = resquestservice.getRequests(id);
	        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@GetMapping("/getrequestreceived/{id}")
	ResponseEntity<List<RequestsEntity>> getRequestReceived(@PathVariable("id") int id) {
	    try {
	        List<RequestsEntity> result = resquestservice.getRequestReceived(id);
	        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@PutMapping("/updaterequest")
	ResponseEntity<List<RequestsEntity>> putRequest(@RequestBody RequestsEntity requestentity) {
	    try {
	        requestrepo.save(requestentity);
	        return new ResponseEntity<>(HttpStatus.ACCEPTED);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	// payment
	@PostMapping("/postpayment")
	ResponseEntity<List<PaymentEntity>> postpayment(@RequestBody PaymentEntity paymententity) {
	    try {
	        paymentrepo.save(paymententity);
	        return new ResponseEntity<>(HttpStatus.ACCEPTED);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@GetMapping("/getpayment/{id}")
	ResponseEntity<List<PaymentEntity>> getpayment(@PathVariable("id") int id) {
	    try {
	        List<PaymentEntity> result = paymentservice.getPayment(id);
	        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@PutMapping("/updatepayment")
	ResponseEntity<List<PaymentEntity>> updatepayment(@RequestBody PaymentEntity paymententity) {
	    try {
	        paymentrepo.save(paymententity);
	        return new ResponseEntity<>(HttpStatus.ACCEPTED);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	
	//feedback
	@PostMapping("/postfeedback")
	ResponseEntity<List<FeedbackEntity>> postFeedback(@RequestBody FeedbackEntity feedbackentity) {
	    try {
	        feedbackrepo.save(feedbackentity);
	        return new ResponseEntity<>(HttpStatus.ACCEPTED);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@GetMapping("/getfeedback/{id}")
	ResponseEntity<List<FeedbackEntity>> getFeedback(@PathVariable("id") int id) {
	    try {
	        List<FeedbackEntity> result = feedbackservice.getFeedback(id);
	        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	// registartion

	@PostMapping("/registration")
	ResponseEntity<List<RegistrationEntity>> getRegistration(@RequestBody RegistrationEntity registrationentity) {
	    try {
	        System.out.println(registrationentity);
	        if (registrationservice.getRegister(registrationentity)) {
	            return new ResponseEntity<>(HttpStatus.ACCEPTED);
	        } else {
	            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	        }
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	// reset password
	
	@PostMapping("/sendmail")
	ResponseEntity<List<ResetPassowordEntity>> getmail(@RequestBody ResetPassowordEntity resetpasswordentity) {
	    try {
	        if (resetpasswordservice.getMail(resetpasswordentity)) {
	            return new ResponseEntity<>(HttpStatus.ACCEPTED);
	        } else {
	            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	        }
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@PostMapping("/sendotp")
	ResponseEntity<List<ResetPassowordEntity>> getotp(@RequestBody ResetPassowordEntity resetpasswordentity) {
	    try {
	        if (resetpasswordservice.getOtp(resetpasswordentity)) {
	            return new ResponseEntity<>(HttpStatus.ACCEPTED);
	        } else {
	            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	        }
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@PostMapping("/sendpassword")
	ResponseEntity<List<ResetPassowordEntity>> getpassword(@RequestBody ResetPassowordEntity resetpasswordentity) {
	    try {
	        if (resetpasswordservice.getPassword(resetpasswordentity)) {
	            return new ResponseEntity<>(HttpStatus.ACCEPTED);
	        } else {
	            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	        }
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	// login
	
	@PostMapping("/login")
	ResponseEntity<?> getlogin(@RequestBody RegistrationEntity registrationentity, HttpSession session) {
	    try {
	        Register value = loginservice.login(registrationentity);
	        if (value.getRole().equals("user")) {
	            return new ResponseEntity<>(value, HttpStatus.ACCEPTED);
	        } else if (value.getRole().equals("serviceman")) {
	            session.setAttribute(registrationentity.getEmail(), "success");
	            return new ResponseEntity<>(value, HttpStatus.ACCEPTED);
	        } else {
	            return new ResponseEntity<>(value, HttpStatus.FORBIDDEN);
	        }
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
}
