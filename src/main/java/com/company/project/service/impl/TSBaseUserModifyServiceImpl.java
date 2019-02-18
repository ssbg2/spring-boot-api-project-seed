package com.company.project.service.impl;

import com.company.project.dao.TSBaseUserModifyMapper;
import com.company.project.model.TSBaseUserModify;
import com.company.project.service.TSBaseUserModifyService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/01/24.
 */
@Service
@Transactional
public class TSBaseUserModifyServiceImpl extends AbstractService<TSBaseUserModify> implements TSBaseUserModifyService {
    @Resource
    private TSBaseUserModifyMapper tSBaseUserModifyMapper;

}
