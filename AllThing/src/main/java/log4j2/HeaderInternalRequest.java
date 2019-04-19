package log4j2;

/**
 * Copyright by Intelin.
 * Creator: Nguyen Huy Doan
 * Date: 02/04/2019
 * Time: 2:31 PM
 */
public class HeaderInternalRequest {

    private String socketID;
    private String token;
    private String cif;
    private String phone;
    private String email;
    private String deviceID;
    private String pushKey;
    private String accountType;
    private String deviceType;
    private String deviceProducer;
    private String deviceModel;
    private String deviceName;
    private String deviceIPAddress;
    private String collationId;
    private String language;
    private String customerName;
    private String username;
    private Integer sex;
    private String feKey;
    private String idRequest;

    public String getSocketID() {
        return socketID;
    }

    public HeaderInternalRequest setSocketID(String socketID) {
        this.socketID = socketID;
        return this;
    }

    public String getToken() {
        return token;
    }

    public HeaderInternalRequest setToken(String token) {
        this.token = token;
        return this;
    }

    public String getCif() {
        return cif;
    }

    public HeaderInternalRequest setCif(String cif) {
        this.cif = cif;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public HeaderInternalRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public HeaderInternalRequest setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public HeaderInternalRequest setDeviceID(String deviceID) {
        this.deviceID = deviceID;
        return this;
    }

    public String getPushKey() {
        return pushKey;
    }

    public HeaderInternalRequest setPushKey(String pushKey) {
        this.pushKey = pushKey;
        return this;
    }

    public String getAccountType() {
        return accountType;
    }

    public HeaderInternalRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public HeaderInternalRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    public String getDeviceProducer() {
        return deviceProducer;
    }

    public HeaderInternalRequest setDeviceProducer(String deviceProducer) {
        this.deviceProducer = deviceProducer;
        return this;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public HeaderInternalRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public HeaderInternalRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    public String getDeviceIPAddress() {
        return deviceIPAddress;
    }

    public HeaderInternalRequest setDeviceIPAddress(String deviceIPAddress) {
        this.deviceIPAddress = deviceIPAddress;
        return this;
    }

    public String getCollationId() {
        return collationId;
    }

    public HeaderInternalRequest setCollationId(String collationId) {
        this.collationId = collationId;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public HeaderInternalRequest setLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public HeaderInternalRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public HeaderInternalRequest setUsername(String username) {
        this.username = username;
        return this;
    }

    public Integer getSex() {
        return sex;
    }

    public HeaderInternalRequest setSex(Integer sex) {
        this.sex = sex;
        return this;
    }

    public String getFeKey() {
        return feKey;
    }

    public HeaderInternalRequest setFeKey(String feKey) {
        this.feKey = feKey;
        return this;
    }

    public String getIdRequest() {
        return idRequest;
    }

    public HeaderInternalRequest setIdRequest(String idRequest) {
        if (this.idRequest == null || this.idRequest.isEmpty()) {
            this.idRequest = idRequest;
        }
        return this;
    }
}

