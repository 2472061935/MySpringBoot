package com.zznode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {

	public indexController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping()
	public String logininfor()
    {
        return  "/index";
    }
}
