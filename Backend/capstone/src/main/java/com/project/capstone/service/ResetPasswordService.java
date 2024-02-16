package com.project.capstone.service;


import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.project.capstone.entity.RegistrationEntity;
import com.project.capstone.entity.ResetPassowordEntity;
import com.project.capstone.repository.RegistrationRepository;

@Service
public class ResetPasswordService {

    @Autowired
    private JavaMailSender mailSender;
    @Autowired
    RegistrationRepository registrationrepo;

	
	Random random = new Random();
    int min = 1000;
    int max = 9999; 
    int number;
    public boolean getMail(ResetPassowordEntity resetpasswordentity) {
    	String mail= resetpasswordentity.getEmail();
    	System.out.println(mail);
    	SimpleMailMessage message = new SimpleMailMessage();
    	message.setFrom("mskumar102001@gmail.com");
    	message.setTo(mail);
    	number= random.nextInt(max - min + 1) + min;
    	message.setText("This is the one time otp generated to reset your passoword \n"+ number);
    	message.setSubject("OTP to reset password");
    	mailSender.send(message);
    	return true;
    }
    public boolean getOtp(ResetPassowordEntity resetpasswordentity) {
    	int otp = resetpasswordentity.getOtp();
    	System.out.println(resetpasswordentity);
    	System.out.println(otp+"   "+ number);
    	if(otp==number) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public boolean getPassword(ResetPassowordEntity resetpasswordentity) {
    	System.out.println(resetpasswordentity);
    	RegistrationEntity registration = registrationrepo.findByEmail(resetpasswordentity.getEmail());
    	registration.setPassword(resetpasswordentity.getPassword());
    	registrationrepo.save(registration);
		return true;
    }
}