package com.company.project.service.impl;

import com.company.project.dao.TSBaseUserMapper;
import com.company.project.model.TSBaseUser;
import com.company.project.service.TSBaseUserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/01/29.
 */
@Service
@Transactional
public class TSBaseUserServiceImpl extends AbstractService<TSBaseUser> implements TSBaseUserService {
    @Resource
    private TSBaseUserMapper tSBaseUserMapper;

}
