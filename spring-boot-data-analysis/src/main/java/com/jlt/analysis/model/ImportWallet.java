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
public class ImportWallet implements Serializable {
	private static final long serialVersionUID = 1L;

	//主键id
	private String id;
	//创建导入时间
	private Date timesStamp;
	//用户名
	private String account;
	//新建类型(0新建/1导入)
	private String createType;
	//隶属链
	private String chainId;
	//钱包地址
	private String address;
	//经纬度
	private String gps;
	//设备ID
	private String deviceId;
	//钱包编码
	private String appId;
	//创建时间
	private Date createTime;

	/**
	 * 设置：主键id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：主键id
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：创建导入时间
	 */
	public void setTimesStamp(Date timesStamp) {
		this.timesStamp = timesStamp;
	}
	/**
	 * 获取：创建导入时间
	 */
	public Date getTimesStamp() {
		return timesStamp;
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
	 * 设置：新建类型(0新建/1导入)
	 */
	public void setCreateType(String createType) {
		this.createType = createType;
	}
	/**
	 * 获取：新建类型(0新建/1导入)
	 */
	public String getCreateType() {
		return createType;
	}
	/**
	 * 设置：隶属链
	 */
	public void setChainId(String chainId) {
		this.chainId = chainId;
	}
	/**
	 * 获取：隶属链
	 */
	public String getChainId() {
		return chainId;
	}
	/**
	 * 设置：钱包地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：钱包地址
	 */
	public String getAddress() {
		return address;
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
	 * 设置：设备ID
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	/**
	 * 获取：设备ID
	 */
	public String getDeviceId() {
		return deviceId;
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
