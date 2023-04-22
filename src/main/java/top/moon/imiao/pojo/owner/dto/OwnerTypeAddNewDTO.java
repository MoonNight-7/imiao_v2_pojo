package top.moon.imiao.pojo.owner.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
* 
* @TableName imiao_owner_type
*/
@Data
public class OwnerTypeAddNewDTO implements Serializable {

    /**
    * 拥有者类型名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty(value = "拥有者类型名称",example = "流浪猫")
    @Length(max= 50,message="编码长度不能超过50")
    private String ownerTypeName;
    /**
    * 拥有着类型描述
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty(value = "拥有着类型描述",example = "流浪的猫咪")
    @Length(max= 200,message="编码长度不能超过200")
    private String ownerTypeDescription;

}
