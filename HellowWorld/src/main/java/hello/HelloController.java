package hello;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("wx")
	public String checkSignature(HttpServletRequest req, HttpServletResponse rep) {
		
		String signature = req.getParameter("signature");
		System.out.println("signature :" + signature);
		String timestamp = req.getParameter("timestamp");
		System.out.println("timestamp :" + timestamp);
		String nonce = req.getParameter("nonce");
		System.out.println("nonce :" + nonce);
		String echostr = req.getParameter("echostr");
		System.out.println("echostr :" + echostr);
		return "Greetings from Spring Boot!";
	}

}