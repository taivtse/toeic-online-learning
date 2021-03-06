package vn.myclass.core.service.impl;

import vn.myclass.core.dto.RoleDTO;
import vn.myclass.core.persistence.entity.RoleEntity;
import vn.myclass.core.service.RoleService;
import vn.myclass.core.service.util.SingletonDaoUtil;
import vn.myclass.core.utils.RoleBeanUtil;

import java.util.ArrayList;
import java.util.List;

public class RoleServiceImpl implements RoleService {
    @Override
    public List<RoleDTO> findAll() {
        List<RoleEntity> entities = SingletonDaoUtil.getRoleDaoInstance().findAll();
        List<RoleDTO> dtos = new ArrayList<>();

        for (RoleEntity entity : entities) {
            RoleDTO dto = RoleBeanUtil.entity2Dto(entity);
            dtos.add(dto);
        }

        return dtos;
    }
}
