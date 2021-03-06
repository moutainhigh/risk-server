package com.graduation.project.risk.project.web.vo.system;

import com.alibaba.fastjson.annotation.JSONField;
import com.graduation.project.risk.project.convert.ListToNullSerializer;
import lombok.Data;

import java.util.List;

@Data
public class SysRolePermissionForSecondVO extends SysRolePermissionVO{

    @JSONField(serializeUsing = ListToNullSerializer.class)
    private List<SysRolePermissionVO> children; //字段名称不要改，vue语法
}
