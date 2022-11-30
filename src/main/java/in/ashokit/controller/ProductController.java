package in.ashokit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController 
{
	@GetMapping("/productload")
	public String displayProduct()
	{
		return "index";
	}
	
	@PostMapping("saveproduct")
	public String saveMyProduct(HttpServletRequest req,Model model)
	{
		String productId = req.getParameter("pid");
		String productName = req.getParameter("pname");
		String productPrize = req.getParameter("prize");
		System.out.println("Product ID:>> "+productId);
		System.out.println("Product Name:>> "+productName);
		System.out.println("Product Prize:>> "+productPrize);


		return "sucess";
	}

}
