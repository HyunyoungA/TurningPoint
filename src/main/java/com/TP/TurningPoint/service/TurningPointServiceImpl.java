package com.TP.TurningPoint.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.TP.TurningPoint.model.mapper.TurningPointMapper;

@Service
public class TurningPointServiceImpl implements TurningPointService{
	
	@Autowired
	TurningPointMapper turningPointMapper;
    
    @Override
    public List<Map<String, Object>> SelectAllList() throws Exception {
        return turningPointMapper.SelectAllList();
    }
}
