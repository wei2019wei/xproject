package fun.chouniu.xprojectweb.sys.controller;

import fun.chouniu.xprojectservice.sys.service.SysUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author chouniu
 * @version 1.0
 * @date 2020/2/22 16:42
 */
@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping(value = "/findAll")
    public Object findAll(){
        return sysUserService.findAll();
    }
}
