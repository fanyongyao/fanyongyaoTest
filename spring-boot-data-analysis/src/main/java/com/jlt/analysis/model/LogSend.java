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
public class LogSend implements Serializable {
	private static final long serialVersionUID = 1L;

	//主键id
	private Long id;
	//登陆时间
	private Date timesTamp;
	//登录账户
	private String account;
	//经纬度
	private String gps;
	//运营商(电信，联通，移动 )
	private String mno;
	//设备操作系统及版本号
	private String deviceos;
	//设备生产厂商
	private String firm;
	//设备ID
	private String deviceId;
	//钱包编码
	private String appId;
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
	 * 设置：登陆时间
	 */
	public void setTimesTamp(Date timesTamp) {
		this.timesTamp = timesTamp;
	}
	/**
	 * 获取：登陆时间
	 */
	public Date getTimesTamp() {
		return timesTamp;
	}
	/**
	 * 设置：登录账户
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * 获取：登录账户
	 */
	public String getAccount() {
		return account;
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
	 * 设置：运营商(电信，联通，移动 )
	 */
	public void setMno(String mno) {
		this.mno = mno;
	}
	/**
	 * 获取：运营商(电信，联通，移动 )
	 */
	public String getMno() {
		return mno;
	}
	/**
	 * 设置：设备操作系统及版本号
	 */
	public void setDeviceos(String deviceos) {
		this.deviceos = deviceos;
	}
	/**
	 * 获取：设备操作系统及版本号
	 */
	public String getDeviceos() {
		return deviceos;
	}
	/**
	 * 设置：设备生产厂商
	 */
	public void setFirm(String firm) {
		this.firm = firm;
	}
	/**
	 * 获取：设备生产厂商
	 */
	public String getFirm() {
		return firm;
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
