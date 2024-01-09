package com.TP.TurningPoint.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.TP.TurningPoint.service.TurningPointService;

@RestController
public class TurningPointController {
	
	@Resource
    private TurningPointService turningPointService;
    
    @RequestMapping(value="main")
    public ModelAndView AllListView(Map<String, Object> map) throws Exception{
        ModelAndView mav = new ModelAndView();
        
        List<Map<String, Object>> AllList = turningPointService.SelectAllList();
        
        mav.addObject("Alllist", AllList);
        mav.setViewName("main");
        return mav;
    }
  
}
