package com.TP.TurningPoint.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TP.TurningPoint.model.mapper.TurningPointMapper;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	TurningPointMapper turningPointMapper;
    
//    @Override
//    public List<Map<String, Object>> SelectAllList() throws Exception {
//        return turningPointMapper.SelectAllList();
//    }
}
