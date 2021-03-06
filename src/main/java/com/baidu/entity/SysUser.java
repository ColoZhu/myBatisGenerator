package com.baidu.entity;

import java.util.Date;

public class SysUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_id
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.dept_id
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private Integer deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.login_name
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private String loginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_name
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_type
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private String userType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.email
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.phonenumber
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private String phonenumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sex
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.avatar
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.password
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.salt
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private String salt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.status
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.del_flag
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private String delFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.login_ip
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private String loginIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.login_date
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private Date loginDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.create_by
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.create_time
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.update_by
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.update_time
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.remark
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_id
     *
     * @return the value of sys_user.user_id
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_id
     *
     * @param userId the value for sys_user.user_id
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.dept_id
     *
     * @return the value of sys_user.dept_id
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.dept_id
     *
     * @param deptId the value for sys_user.dept_id
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.login_name
     *
     * @return the value of sys_user.login_name
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.login_name
     *
     * @param loginName the value for sys_user.login_name
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_name
     *
     * @return the value of sys_user.user_name
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_name
     *
     * @param userName the value for sys_user.user_name
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_type
     *
     * @return the value of sys_user.user_type
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_type
     *
     * @param userType the value for sys_user.user_type
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.email
     *
     * @return the value of sys_user.email
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.email
     *
     * @param email the value for sys_user.email
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.phonenumber
     *
     * @return the value of sys_user.phonenumber
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.phonenumber
     *
     * @param phonenumber the value for sys_user.phonenumber
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sex
     *
     * @return the value of sys_user.sex
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sex
     *
     * @param sex the value for sys_user.sex
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.avatar
     *
     * @return the value of sys_user.avatar
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.avatar
     *
     * @param avatar the value for sys_user.avatar
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.password
     *
     * @return the value of sys_user.password
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.password
     *
     * @param password the value for sys_user.password
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.salt
     *
     * @return the value of sys_user.salt
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.salt
     *
     * @param salt the value for sys_user.salt
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.status
     *
     * @return the value of sys_user.status
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.status
     *
     * @param status the value for sys_user.status
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.del_flag
     *
     * @return the value of sys_user.del_flag
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.del_flag
     *
     * @param delFlag the value for sys_user.del_flag
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.login_ip
     *
     * @return the value of sys_user.login_ip
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.login_ip
     *
     * @param loginIp the value for sys_user.login_ip
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.login_date
     *
     * @return the value of sys_user.login_date
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.login_date
     *
     * @param loginDate the value for sys_user.login_date
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.create_by
     *
     * @return the value of sys_user.create_by
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.create_by
     *
     * @param createBy the value for sys_user.create_by
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.create_time
     *
     * @return the value of sys_user.create_time
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.create_time
     *
     * @param createTime the value for sys_user.create_time
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.update_by
     *
     * @return the value of sys_user.update_by
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.update_by
     *
     * @param updateBy the value for sys_user.update_by
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.update_time
     *
     * @return the value of sys_user.update_time
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.update_time
     *
     * @param updateTime the value for sys_user.update_time
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.remark
     *
     * @return the value of sys_user.remark
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.remark
     *
     * @param remark the value for sys_user.remark
     *
     * @mbg.generated Thu May 09 09:56:41 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}