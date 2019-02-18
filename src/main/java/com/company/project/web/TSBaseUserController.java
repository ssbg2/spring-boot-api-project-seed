package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.TSBaseUser;
import com.company.project.model.TSBaseUserModify;
import com.company.project.service.TSBaseUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.Base64;
import java.util.List;

/**
* Created by CodeGenerator on 2019/01/29.
*/
@RestController
@RequestMapping("/t/s/base/user")
public class TSBaseUserController {
    @Resource
    private TSBaseUserService tSBaseUserService;

    @PostMapping("/add")
    public Result add(TSBaseUser tSBaseUser) {
        tSBaseUserService.save(tSBaseUser);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        tSBaseUserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/base64")
    public Result statusU(){

        int listCount = 0;
        int listSuccessCount = 0;

        Condition condition = new Condition(TSBaseUser.class);
        condition.createCriteria().andCondition("status = '1' or status = '0' ");

        List<TSBaseUser> list = tSBaseUserService.findByCondition(condition);
        System.out.println(list.size());
        for (TSBaseUser ts :
                list) {
            System.out.println("base64:"+ts.getStatus());
            if(ts.getStatus().length()==1){

                ts.setStatus(Base64.getEncoder().encodeToString((ts.getStatus()+""+ts.getId()).getBytes()));
                tSBaseUserService.update(ts);
            }
            System.out.println("org status:"+ts.getStatus());
            listSuccessCount ++;
        }
        return ResultGenerator.genSuccessResult(listSuccessCount);

    }

    @PostMapping("/update")
    public Result update(TSBaseUser tSBaseUser) {
        tSBaseUserService.update(tSBaseUser);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        TSBaseUser tSBaseUser = tSBaseUserService.findById(id);
        return ResultGenerator.genSuccessResult(tSBaseUser);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TSBaseUser> list = tSBaseUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
