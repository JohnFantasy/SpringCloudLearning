package com.laofaner.zk.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 配置管理表
 * </p>
 *
 * @author fanyuzhuo
 * @since 2023-08-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("csp_monitor_zk_config")
public class ZkConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 设备ID(原始ID)
     */
    @TableField("device_id")
    private String deviceId;

    /**
     * 配置文件存储路径
     */
    @TableField("config_file_path")
    private String configFilePath;

    /**
     * 配置文件名
     */
    @TableField("config_name")
    private String configName;

    /**
     * 上传时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;


}
