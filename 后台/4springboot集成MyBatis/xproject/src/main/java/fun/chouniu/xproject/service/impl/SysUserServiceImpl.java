package fun.chouniu.xproject.service.impl;

import fun.chouniu.xproject.dao.SysUserDao;
import fun.chouniu.xproject.entity.SysUserEntity;
import fun.chouniu.xproject.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chouniu
 * @version 1.0
 * @date 2020/2/22 16:38
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public List<SysUserEntity> findAll(){
        return sysUserDao.findAll();
    }
}
