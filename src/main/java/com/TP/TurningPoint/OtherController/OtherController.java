package com.TP.TurningPoint.OtherController;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OtherController {
	
//	@RequestMapping("/member/login")
//	public OtherController(Model model) {
//		
//	}
	//베스트리뷰
    @GetMapping("/bestReview")
	public String bestReview() {
		return "bestReview";
	}
	//인기매칭
    @GetMapping("/bestMatching")
	public String bestMatching() {
		return "bestMatching";
	}

	//인기매칭 상세페이지
    @GetMapping("/bestMatchingDetail")
	public String bestMatchingDetail() {
		return "bestMatchingDetail";
	}
    
    //베스트리뷰 상세페이지
    @GetMapping("/bestReviewDetail")
	public String bestReviewDetail() {
		return "bestReviewDetail";
	}
}
