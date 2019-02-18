package com.company.project.service.impl;

import com.company.project.dao.DecodeTestMapper;
import com.company.project.model.DecodeTest;
import com.company.project.service.DecodeTestService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/01/24.
 */
@Service
@Transactional
public class DecodeTestServiceImpl extends AbstractService<DecodeTest> implements DecodeTestService {
    @Resource
    private DecodeTestMapper decodeTestMapper;

}
