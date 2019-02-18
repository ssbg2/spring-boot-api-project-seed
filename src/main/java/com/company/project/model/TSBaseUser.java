package com.company.project.model;

import javax.persistence.*;

@Table(name = "t_s_base_user")
public class TSBaseUser {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "activitiSync")
    private Short activitisync;

    private String browser;

    private String password;

    private String realname;

    private String status;

    private String userkey;

    private String username;

    private String departid;

    @Column(name = "delete_flag")
    private Short deleteFlag;

    @Column(name = "safe_password")
    private String safePassword;

    @Column(name = "user_image")
    private String userImage;

    @Column(name = "validate_code")
    private String validateCode;

    @Column(name = "is_validate")
    private Integer isValidate;

    private String idcard;

    @Column(name = "register_type")
    private String registerType;

    private String pyszm;

    private String pyqp;

    private byte[] signature;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return activitiSync
     */
    public Short getActivitisync() {
        return activitisync;
    }

    /**
     * @param activitisync
     */
    public void setActivitisync(Short activitisync) {
        this.activitisync = activitisync;
    }

    /**
     * @return browser
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * @param browser
     */
    public void setBrowser(String browser) {
        this.browser = browser;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return realname
     */
    public String getRealname() {
        return realname;
    }

    /**
     * @param realname
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return userkey
     */
    public String getUserkey() {
        return userkey;
    }

    /**
     * @param userkey
     */
    public void setUserkey(String userkey) {
        this.userkey = userkey;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return departid
     */
    public String getDepartid() {
        return departid;
    }

    /**
     * @param departid
     */
    public void setDepartid(String departid) {
        this.departid = departid;
    }

    /**
     * @return delete_flag
     */
    public Short getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * @param deleteFlag
     */
    public void setDeleteFlag(Short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * @return safe_password
     */
    public String getSafePassword() {
        return safePassword;
    }

    /**
     * @param safePassword
     */
    public void setSafePassword(String safePassword) {
        this.safePassword = safePassword;
    }

    /**
     * @return user_image
     */
    public String getUserImage() {
        return userImage;
    }

    /**
     * @param userImage
     */
    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    /**
     * @return validate_code
     */
    public String getValidateCode() {
        return validateCode;
    }

    /**
     * @param validateCode
     */
    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    /**
     * @return is_validate
     */
    public Integer getIsValidate() {
        return isValidate;
    }

    /**
     * @param isValidate
     */
    public void setIsValidate(Integer isValidate) {
        this.isValidate = isValidate;
    }

    /**
     * @return idcard
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * @param idcard
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * @return register_type
     */
    public String getRegisterType() {
        return registerType;
    }

    /**
     * @param registerType
     */
    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    /**
     * @return pyszm
     */
    public String getPyszm() {
        return pyszm;
    }

    /**
     * @param pyszm
     */
    public void setPyszm(String pyszm) {
        this.pyszm = pyszm;
    }

    /**
     * @return pyqp
     */
    public String getPyqp() {
        return pyqp;
    }

    /**
     * @param pyqp
     */
    public void setPyqp(String pyqp) {
        this.pyqp = pyqp;
    }

    /**
     * @return signature
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * @param signature
     */
    public void setSignature(byte[] signature) {
        this.signature = signature;
    }
}