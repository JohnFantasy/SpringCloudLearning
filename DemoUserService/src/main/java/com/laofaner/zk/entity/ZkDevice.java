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
 * 
 * </p>
 *
 * @author fanyuzhuo
 * @since 2023-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("csp_monitor_zk_device")
public class ZkDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 设备ID
     */
    @TableField("device_id")
    private String deviceId;

    /**
     * 设备名称
     */
    @TableField("device_name")
    private String deviceName;

    /**
     * 设备IP
     */
    @TableField("device_ip")
    private String deviceIp;

    /**
     * 设备类型
     */
    @TableField("device_type")
    private String deviceType;

    /**
     * 设备厂商
     */
    @TableField("device_vendor")
    private String deviceVendor;

    /**
     * 设备描述
     */
    @TableField("device_desc")
    private String deviceDesc;

    /**
     * 设备型号
     */
    @TableField("device_modele_number")
    private String deviceModeleNumber;

    /**
     * 设备软件版本
     */
    @TableField("device_software_version")
    private String deviceSoftwareVersion;

    /**
     * 入库时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 预留字段1
     */
    @TableField("reserved1")
    private String reserved1;

    /**
     * 预留字段2
     */
    @TableField("reserved2")
    private String reserved2;

    /**
     * 预留字段3
     */
    @TableField("reserved3")
    private String reserved3;


}
