package itouchtv.commons;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhouliangchou on 2016/8/8.
 */
public class ErrorCodeToMessageMapping {

    private static Map<Integer, String> mapping = new HashMap<Integer, String>();

    static {
        mapping.put(ErrorConstants.ERROR_CODE_ACCOUNT_NOT_EXIST, ErrorConstants.ERROR_MSG_ACCOUNT_NOT_EXIST);
        mapping.put(ErrorConstants.ERROR_CODE_MGRSYSTEMSETTING_INVALID,
                ErrorConstants.ERROR_MSG_MGRSYSTEMSETTING_INVALID);
        mapping.put(ErrorConstants.ERROR_CODE_COMPLAINTCATEGORY_INVALID,
                ErrorConstants.ERROR_MSG_COMPLAINTCATEGORY_INVALID);
        mapping.put(ErrorConstants.ERROR_CODE_ACCOUNT_OR_PASSWORD_MISMATCH,
                ErrorConstants.ERROR_MSG_ACCOUNT_OR_PASSWORD_MISMATCH);
        mapping.put(ErrorConstants.ERROR_CODE_NEW_PASSWORD_SAME_AS_OLD_PASSWORD,
                ErrorConstants.ERROR_MSG_NEW_PASSWORD_SAME_AS_OLD_PASSWORD);
        mapping.put(ErrorConstants.ERROR_CODE_LOGIN_FAILURE_EXCEEDS_THRESHOLD,
                ErrorConstants.ERROR_MSG_LOGIN_FAILURE_EXCEEDS_THRESHOLD);
        mapping.put(ErrorConstants.ERROR_CODE_DUPLICATE_ROLENAME, ErrorConstants.ERROR_MSG_DUPLICATE_ROLENAME);
        mapping.put(ErrorConstants.ERROR_CODE_MEDIA_LIVE_NOT_EXIST, ErrorConstants.ERROR_MSG_MEDIA_LIVE_NOT_EXIST);
        mapping.put(ErrorConstants.ERROR_CODE_STREAM_HANDLE_ERROR, ErrorConstants.ERROR_MSG_STREAM_HANDLE_ERROR);
        mapping.put(ErrorConstants.ERROR_CODE_ACCOUNT_NOT_STATUS, ErrorConstants.ERROR_MSG_ACCOUNT_NOT_STATUS);
        mapping.put(ErrorConstants.ERROR_CODE_DUPLICATE_ACOUNT, ErrorConstants.ERROR_MSG_DUPLICATE_ACOUNT);
        mapping.put(ErrorConstants.ERROR_CODE_ENTITY_NOT_EXIST, ErrorConstants.ERROR_MSG_ENTITY_NOT_EXIST);
        mapping.put(ErrorConstants.ERROR_CODE_STREAM_STATUS, ErrorConstants.ERROR_MSG_STREAM_STATUS);
        mapping.put(ErrorConstants.ERROR_CODE_TAG_NOT_EXIST, ErrorConstants.ERROR_MSG_TAG_NOT_EXIST);
        mapping.put(ErrorConstants.ERROR_CODE_JWT_INVALIDATE, ErrorConstants.ERROR_MSG_JWT_INVALIDATE);
        mapping.put(ErrorConstants.ERROR_CODE_ALBUM_CHANGE, ErrorConstants.ERROR_MSG_ALBUM_CHANGE);
        mapping.put(ErrorConstants.ERROR_CODE_ALBUM_NOT_EXIST, ErrorConstants.ERROR_MSG_ALBUM_NOT_EXIST);
        mapping.put(ErrorConstants.ERROR_CODE_ALBUMNEWS_IS_EXIST, ErrorConstants.ERROR_MSG_ALBUMNEWS_IS_EXIST);
        mapping.put(ErrorConstants.ERROR_CODE_NEWS_IS_TOP_EXIST_ONE, ErrorConstants.ERROR_MSG_NEWS_IS_TOP_EXIST_ONE);
        mapping.put(ErrorConstants.ERROR_CODE_INVALID_PUSH_MSG, ErrorConstants.ERROR_MSG_INVALID_PUSH_MSG);
        mapping.put(ErrorConstants.ERROR_CODE_INVALID_PUSH_CONTENT_TYPE,
                ErrorConstants.ERROR_MSG_INVALID_PUSH_CONTENT_TYPE);
        mapping.put(ErrorConstants.ERROR_CODE_INVALID_PUSH_TYPE, ErrorConstants.ERROR_MSG_INVALID_PUSH_TYPE);
        mapping.put(ErrorConstants.ERROR_CODE_INVALID_PUSH_MSG_STATUS, ErrorConstants.ERROR_MSG_INVALID_PUSH_MSG_STATUS);
        mapping.put(ErrorConstants.ERROR_CODE_INVALID_PUSH_DATE, ErrorConstants.ERROR_MSG_INVALID_PUSH_DATE);
        mapping.put(ErrorConstants.ERROR_CODE_REPUSH_FAILED, ErrorConstants.ERROR_MSG_REPUSH_FAILED);
        mapping.put(ErrorConstants.ERROR_CODE_PUSHTYPE_NOTSUPPORTED, ErrorConstants.ERROR_MSG_PUSHTYPE_NOTSUPPORTED);
        mapping.put(ErrorConstants.ERROR_CODE_PUSHSTATUS_NOTSUPPORTED, ErrorConstants.ERROR_MSG_PUSHSTATUS_NOTSUPPORTED);
        mapping.put(ErrorConstants.ERROR_CODE_INVALID_COMMENT_WONDERFUL,
                ErrorConstants.ERROR_MSG_INVALID_COMMENT_WONDERFUL);
        mapping.put(ErrorConstants.ERROR_CODE_INVALID_COMMENT_STATUS, ErrorConstants.ERROR_MSG_INVALID_COMMENT_STATUS);
        mapping.put(ErrorConstants.ERROR_CODE_CHANNEL_IS_EXSIT_NAME, ErrorConstants.ERROR_MSG_CHANNEL_IS_EXSIT_NAME);
        mapping.put(ErrorConstants.ERROR_CODE_TAG_IS_EXSIT_NAME, ErrorConstants.ERROR_MSG_TAG_IS_EXSIT_NAME);
        mapping.put(ErrorConstants.ERROR_CODE_JPUSH_MEDIALIVE_BEFOR_lIVEBEGINTIME, ErrorConstants.ERROR_MSG_JPUSH_MEDIALIVE_BEFOR_lIVEBEGINTIME);
        mapping.put(ErrorConstants.ERROR_CODE_NEWS_RELEASESTATUS_INVALID, ErrorConstants.ERROR_MSG_NEWS_RELEASESTATUS_INVALID);
        mapping.put(ErrorConstants.ERROR_CODE_PUSH_MSG_FORBIDDEN, ErrorConstants.ERROR_MSG_PUSH_MSG_FORBIDDEN);
        mapping.put(ErrorConstants.ERROR_CODE_MEDIA_STATUS_INVALID, ErrorConstants.ERROR_MSG_MEDIA_STATUS_INVALID);
        mapping.put(ErrorConstants.ERROR_CODE_INVALID_NEWS_STATUS, ErrorConstants.ERROR_MSG_INVALID_NEWS_STATUS);
        mapping.put(ErrorConstants.ERROR_CODE_MEDIA_LIVE_OPSTATUS_CHANGE, ErrorConstants.ERROR_MSG_MEDIA_LIVE_OPSTATUS_CHANGE);
        mapping.put(ErrorConstants.ERROR_CODE_MEDIA_LIVE_STREAM_NOT_EXIST, ErrorConstants.ERROR_MSG_MEDIA_LIVE_STREAM_NOT_EXIST);
        mapping.put(ErrorConstants.ERROR_CODE_API_ACCESS_DENIED, ErrorConstants.ERROR_MSG_API_ACCESS_DENIED);
        mapping.put(ErrorConstants.ERROR_CODE_INVALID_MEDIALIVE_CHATSTATUS, ErrorConstants.ERROR_MSG_INVALID_MEDIALIVE_CHATSTATUS);
        mapping.put(ErrorConstants.ERROR_CODE_INVALID_SHARE_DATA_TYPE, ErrorConstants.ERROR_MSG_INVALID_SHARE_DATA_TYPE);
        mapping.put(ErrorConstants.ERROR_CODE_INVALID_MEDIA_HOME_SHOW, ErrorConstants.ERROR_MSG_INVALID_MEDIA_HOME_SHOW);
        mapping.put(ErrorConstants.ERROR_CODE_ACTIVITY_EXISTED, ErrorConstants.ERROR_MSG_ACTIVITY_EXISTED);
        mapping.put(ErrorConstants.ERROR_CODE_SPIDER_TAG_PARAMETER_ILLEGAL, ErrorConstants.ERROR_MSG_PARAMETER_ILLEGAL);
    }

    public static String mapErrorCodeToMessage(int errorCode) {
        return mapping.get(errorCode);
    }

    private ErrorCodeToMessageMapping() {
    }
}
