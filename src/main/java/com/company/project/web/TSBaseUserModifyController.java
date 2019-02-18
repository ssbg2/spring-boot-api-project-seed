package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.TSBaseUserModify;
import com.company.project.service.TSBaseUserModifyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/01/24.
*/
@RestController
@RequestMapping("/t/s/base/user/modify")
public class TSBaseUserModifyController {
    @Resource
    private TSBaseUserModifyService tSBaseUserModifyService;

    @PostMapping("/add")
    public Result add(TSBaseUserModify tSBaseUserModify) {
        tSBaseUserModifyService.save(tSBaseUserModify);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/updateId")
    public Result updateById(@RequestParam String id){
        TSBaseUserModify tsBaseUserModify = tSBaseUserModifyService.findById(id);
        tsBaseUserModify.setStatus("2");
        tSBaseUserModifyService.update(tsBaseUserModify);
        return ResultGenerator.genSuccessResult(tsBaseUserModify);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        tSBaseUserModifyService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(TSBaseUserModify tSBaseUserModify) {
        tSBaseUserModifyService.update(tSBaseUserModify);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam String id) {
        TSBaseUserModify tSBaseUserModify = tSBaseUserModifyService.findById(id);
        return ResultGenerator.genSuccessResult(tSBaseUserModify);
    }

    @PostMapping("/base64")
    public Result status(){
        int listCount = 0;
        int listSuccessCount = 0;
        List<TSBaseUserModify> list = tSBaseUserModifyService.findAll();
        System.out.println(list.size());
        for (TSBaseUserModify ts :
             list) {
            ts.setStatusBase64(ts.getStatus());
            ts.setStatusBase64(ts.getStatus());
            tSBaseUserModifyService.update(ts);
            System.out.println("base64:"+ts.getStatus());
            System.out.println("org status:"+ts.getStatus());
            listSuccessCount ++;
        }
        return ResultGenerator.genSuccessResult(listSuccessCount);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TSBaseUserModify> list = tSBaseUserModifyService.findAll();
//        list.get(0).enCodeStatus(list.get(0).getStatus());
//        System.out.println(list.get(0).getStatus());
//        System.out.println(list.get(0).deCodeStatus());
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
