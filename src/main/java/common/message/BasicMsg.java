package common.message;


/**
 * 消息体
 */
public class BasicMsg implements IMessage {

    private String transferType;

    /**
     * 版本信息
     */
    private String version;

    /**
     * md5消息
     */
    private String md5Info;

    /**
     * 整体信息包大小
     */
    private Long allContentLen;

    /**
     * 消息包大小
     */
    private Long contentLen;

    /**
     * 序列号
     */
    private Long orderNumber;

    /**
     * 该信息传输中每个包大小
     */
    private Long pkgSize;

    /**
     * 消息发送时间戳
     */
    private Long unixTimeStamp;

    /**
     * 消息体
     */
    private byte[] msg;


    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMd5Info() {
        return md5Info;
    }

    public void setMd5Info(String md5Info) {
        this.md5Info = md5Info;
    }

    public Long getAllContentLen() {
        return allContentLen;
    }

    public void setAllContentLen(Long allContentLen) {
        this.allContentLen = allContentLen;
    }

    public Long getContentLen() {
        return contentLen;
    }

    public void setContentLen(Long contentLen) {
        this.contentLen = contentLen;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getPkgSize() {
        return pkgSize;
    }

    public void setPkgSize(Long pkgSize) {
        this.pkgSize = pkgSize;
    }

    public Long getUnixTimeStamp() {
        return unixTimeStamp;
    }

    public void setUnixTimeStamp(Long unixTimeStamp) {
        this.unixTimeStamp = unixTimeStamp;
    }

    public byte[] getMsg() {
        return msg;
    }

    public void setMsg(byte[] msg) {
        this.msg = msg;
    }
}
