package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.Category;
import net.skhu.mapper.CategoryMapper;

@Controller
public class CategoryController {
	@Autowired CategoryMapper categoryMapper;

	@RequestMapping("/")
    public String index() {
        return "category/index";
    }

	@RequestMapping("category/list")
	public String list(Model model) {
		List<Category> categories = categoryMapper.findAll();
		model.addAttribute("categories", categories);
		return "category/list";
	}
}
