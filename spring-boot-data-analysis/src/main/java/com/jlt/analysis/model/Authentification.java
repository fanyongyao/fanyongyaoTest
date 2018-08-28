package com.jlt.analysis.model;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author czx
 * @email object_czx@163.com
 * @date 2018-06-20 18:44:04
 */
public class Authentification implements Serializable {
	private static final long serialVersionUID = 1L;

	//主键id
	private Long id;
	//户认证时创建时间
	private Date timesTamp;
	//用户名
	private String account;
	//钱包编码
	private String appId;
	//证件类型\r\n00:身份证\r\n01:护照\r\n02:军官证\r\n03:港澳通行证\r\n04:台胞证
	private String identityType;
	//证件号码
	private String identityNo;
	//省ID
	private String provinceId;
	//城市ID
	private String cityId;
	//经纬度
	private String gps;
	//设备id
	private String deviceId;
	//创建时间
	private Date createTime;

	/**
	 * 设置：主键id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：户认证时创建时间
	 */
	public void setTimesTamp(Date timesTamp) {
		this.timesTamp = timesTamp;
	}
	/**
	 * 获取：户认证时创建时间
	 */
	public Date getTimesTamp() {
		return timesTamp;
	}
	/**
	 * 设置：用户名
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * 获取：用户名
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * 设置：钱包编码
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}
	/**
	 * 获取：钱包编码
	 */
	public String getAppId() {
		return appId;
	}
	/**
	 * 设置：证件类型\r\n00:身份证\r\n01:护照\r\n02:军官证\r\n03:港澳通行证\r\n04:台胞证
	 */
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}
	/**
	 * 获取：证件类型\r\n00:身份证\r\n01:护照\r\n02:军官证\r\n03:港澳通行证\r\n04:台胞证
	 */
	public String getIdentityType() {
		return identityType;
	}
	/**
	 * 设置：证件号码
	 */
	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}
	/**
	 * 获取：证件号码
	 */
	public String getIdentityNo() {
		return identityNo;
	}
	/**
	 * 设置：省ID
	 */
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	/**
	 * 获取：省ID
	 */
	public String getProvinceId() {
		return provinceId;
	}
	/**
	 * 设置：城市ID
	 */
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	/**
	 * 获取：城市ID
	 */
	public String getCityId() {
		return cityId;
	}
	/**
	 * 设置：经纬度
	 */
	public void setGps(String gps) {
		this.gps = gps;
	}
	/**
	 * 获取：经纬度
	 */
	public String getGps() {
		return gps;
	}
	/**
	 * 设置：设备id
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	/**
	 * 获取：设备id
	 */
	public String getDeviceId() {
		return deviceId;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}


}
