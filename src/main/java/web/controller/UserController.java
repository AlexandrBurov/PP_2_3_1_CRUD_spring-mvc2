package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.dao.UserDAO;
import web.model.User;

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
//=====================@GetMapping===========================
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
	@GetMapping("/new")
    public String newUser(Model model){
		model.addAttribute("user", new User());

		return "new";
}
//====================@PostMapping============================
    @PostMapping()
	public String create(@ModelAttribute("user") User user){
		userDAO.save(user);
		return "redirect:/users";         // REDIRECT переводит на нужную страницу


	}
//================================================
}