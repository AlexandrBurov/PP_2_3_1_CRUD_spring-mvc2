package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.UserDAO;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

	private final UserDAO userDAO;
    @Autowired
	public UserController(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
//================================================

	@GetMapping()
	public String index(Model model) {
		model.addAttribute("users", userDAO.index());

		return "index";
	}
	@GetMapping("/{id}")
	public String show(@PathVariable("id") int id, Model model){
		model.addAttribute("user", userDAO.show(id));

		return "show";
	}


//================================================
	
}