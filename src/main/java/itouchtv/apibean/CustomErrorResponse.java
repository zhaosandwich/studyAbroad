package itouchtv.apibean;

/**
 * Created by zhouliangchou on 2016/8/8.
 */
public class CustomErrorResponse {
    private int errorCode;
    private String errorMessage;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public CustomErrorResponse() {
    }
}
