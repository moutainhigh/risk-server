package com.graduation.project.risk.project.web.form.rule;

import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PackageOfflineForm {

    @NotNull
    @ApiModelProperty(value = "规则包id",example = "1")
    private Long packageId;

}
