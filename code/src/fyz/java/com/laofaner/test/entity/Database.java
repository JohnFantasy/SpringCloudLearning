package com.laofaner.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 数据库管理表
 * </p>
 *
 * @author fanyuzhuo
 * @since 2023-07-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("csp_monitor_database")
@ApiModel(value="Database对象", description="数据库管理表")
public class Database implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增主键")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "数据库类别（1-GP,2-Libra,3-ES,4-HIVE,5-HBase）")
    @TableField("type")
    private Integer type;

    @ApiModelProperty(value = "客户端所在主机IP")
    @TableField("client_host")
    private String clientHost;

    @ApiModelProperty(value = "客户端所在主机端口")
    @TableField("client_port")
    private String clientPort;

    @ApiModelProperty(value = "数据库名称")
    @TableField("database_name")
    private String databaseName;

    @ApiModelProperty(value = "数据库用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "数据库密码")
    @TableField("passwd")
    private String passwd;

    @ApiModelProperty(value = "数据库版本好")
    @TableField("version")
    private String version;

    @ApiModelProperty(value = "ES管理URL")
    @TableField("es_url")
    private String esUrl;


}
