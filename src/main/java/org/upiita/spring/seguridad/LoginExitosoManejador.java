package org.upiita.spring.seguridad;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

public class LoginExitosoManejador extends SavedRequestAwareAuthenticationSuccessHandler {
	
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("LOGIN EXITOSO");
		
		request.getSession().setAttribute("loginFallidos", 0);
		System.out.println("REINICIO DE CONTADOR DE LOGINS FALLIDOS");
		
		super.onAuthenticationSuccess(request, response, authentication);
	}

}
