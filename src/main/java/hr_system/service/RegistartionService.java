package hr_system.service;

import org.springframework.stereotype.Service;

import hr_system.entity.RegistrationRequest;
@Service
public class RegistartionService {

	public String register(RegistrationRequest request) {
		return "works";
	}

}
