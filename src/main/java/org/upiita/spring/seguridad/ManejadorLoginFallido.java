package org.upiita.spring.seguridad;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

public class ManejadorLoginFallido extends SimpleUrlAuthenticationFailureHandler{
	
	
	
	
	
	@Override
	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException exception)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("INICIANDO AUTOENTICACION LOGIN");
		Integer loginFallidos = (Integer)request.getSession().getAttribute("loginFallidos");
		
		//Si es la primera vez que se equivoco el usuario
		if(loginFallidos == null){
			System.out.println("LOGIN INTENTO :"+loginFallidos );
			loginFallidos=1;
		}else{
			//Si ya existe la variable en la session
			System.out.println("LOGIN INTENTO FALLIDO :"+loginFallidos );
			loginFallidos++;
		}
		request.getSession().setAttribute("loginFallidos", loginFallidos);
		super.onAuthenticationFailure(request, response, exception);
	}

}
