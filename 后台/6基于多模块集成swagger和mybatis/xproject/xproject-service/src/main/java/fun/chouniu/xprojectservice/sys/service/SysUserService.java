package fun.chouniu.xprojectservice.sys.service;



import fun.chouniu.xprojectbase.sys.entity.SysUserEntity;

import java.util.List;

/**
 * @author chouniu
 * @version 1.0
 * @date 2020/2/22 16:37
 */
public interface SysUserService {
    /**
     * 查找所有用户
     * @return
     */
    List<SysUserEntity> findAll();
}
