package fun.chouniu.xprojectservice.sys.service.impl;


import fun.chouniu.xprojectbase.sys.entity.SysUserEntity;
import fun.chouniu.xprojectdao.sys.dao.SysUserDao;
import fun.chouniu.xprojectservice.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * @author chouniu
 * @version 1.0
 * @date 2020/2/22 16:38
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserDao sysUserDao;

    @Override
    public List<SysUserEntity> findAll(){
        return sysUserDao.findAll();
    }
}
