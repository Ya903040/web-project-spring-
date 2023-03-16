package kg.edu.alatoo.demo.controller;

import kg.edu.alatoo.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }

}
//studentRepository.findByNameLike("%Sul%")