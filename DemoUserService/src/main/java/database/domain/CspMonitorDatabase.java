package database.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 数据库管理表
* @TableName csp_monitor_database
*/
public class CspMonitorDatabase implements Serializable {

    /**
    * 自增主键
    */
    @NotNull(message="[自增主键]不能为空")
    @ApiModelProperty("自增主键")
    private Integer id;
    /**
    * 数据库类别（1-GP,2-Libra,3-ES,4-HIVE,5-HBase）
    */
    @NotNull(message="[数据库类别（1-GP,2-Libra,3-ES,4-HIVE,5-HBase）]不能为空")
    @ApiModelProperty("数据库类别（1-GP,2-Libra,3-ES,4-HIVE,5-HBase）")
    private Integer type;
    /**
    * 客户端所在主机IP
    */
    @NotBlank(message="[客户端所在主机IP]不能为空")
    @Size(max= 15,message="编码长度不能超过15")
    @ApiModelProperty("客户端所在主机IP")
    @Length(max= 15,message="编码长度不能超过15")
    private String clientHost;
    /**
    * 客户端所在主机端口
    */
    @NotBlank(message="[客户端所在主机端口]不能为空")
    @Size(max= 5,message="编码长度不能超过5")
    @ApiModelProperty("客户端所在主机端口")
    @Length(max= 5,message="编码长度不能超过5")
    private String clientPort;
    /**
    * 数据库名称
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("数据库名称")
    @Length(max= 100,message="编码长度不能超过100")
    private String databaseName;
    /**
    * 数据库用户名
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("数据库用户名")
    @Length(max= 100,message="编码长度不能超过100")
    private String username;
    /**
    * 数据库密码
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("数据库密码")
    @Length(max= 100,message="编码长度不能超过100")
    private String passwd;
    /**
    * 数据库版本好
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("数据库版本好")
    @Length(max= 100,message="编码长度不能超过100")
    private String version;
    /**
    * ES管理URL
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("ES管理URL")
    @Length(max= 100,message="编码长度不能超过100")
    private String esUrl;

    /**
    * 自增主键
    */
    private void setId(Integer id){
    this.id = id;
    }

    /**
    * 数据库类别（1-GP,2-Libra,3-ES,4-HIVE,5-HBase）
    */
    private void setType(Integer type){
    this.type = type;
    }

    /**
    * 客户端所在主机IP
    */
    private void setClientHost(String clientHost){
    this.clientHost = clientHost;
    }

    /**
    * 客户端所在主机端口
    */
    private void setClientPort(String clientPort){
    this.clientPort = clientPort;
    }

    /**
    * 数据库名称
    */
    private void setDatabaseName(String databaseName){
    this.databaseName = databaseName;
    }

    /**
    * 数据库用户名
    */
    private void setUsername(String username){
    this.username = username;
    }

    /**
    * 数据库密码
    */
    private void setPasswd(String passwd){
    this.passwd = passwd;
    }

    /**
    * 数据库版本好
    */
    private void setVersion(String version){
    this.version = version;
    }

    /**
    * ES管理URL
    */
    private void setEsUrl(String esUrl){
    this.esUrl = esUrl;
    }


    /**
    * 自增主键
    */
    private Integer getId(){
    return this.id;
    }

    /**
    * 数据库类别（1-GP,2-Libra,3-ES,4-HIVE,5-HBase）
    */
    private Integer getType(){
    return this.type;
    }

    /**
    * 客户端所在主机IP
    */
    private String getClientHost(){
    return this.clientHost;
    }

    /**
    * 客户端所在主机端口
    */
    private String getClientPort(){
    return this.clientPort;
    }

    /**
    * 数据库名称
    */
    private String getDatabaseName(){
    return this.databaseName;
    }

    /**
    * 数据库用户名
    */
    private String getUsername(){
    return this.username;
    }

    /**
    * 数据库密码
    */
    private String getPasswd(){
    return this.passwd;
    }

    /**
    * 数据库版本好
    */
    private String getVersion(){
    return this.version;
    }

    /**
    * ES管理URL
    */
    private String getEsUrl(){
    return this.esUrl;
    }

}
