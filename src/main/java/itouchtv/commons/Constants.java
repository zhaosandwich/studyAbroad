package itouchtv.commons;

/**
 * Created by zhouliangchou on 2016/8/8.
 */
public interface Constants {

   //认证文件头
   static final String AUTHORIZATION_HEADER = "Authorization";

   // JWT
   long PERIOD_3_HOURS = 3 * 60 * 60L;

   // Redis
//   String REDIS_SMS_VERIFICATION_CODE_PREFIX = "userService:sms:verificationCode:";
//   String REDIS_SMS_60_SECONDS_PREFIX = "userService:sms:60s:";
//   String REDIS_SMS_1_HOUR_PREFIX = "userService:sms:1hr:";
   String REDIS_LOGIN_FAILURE_COUNT_IN_1_HOUR_PREFIX = "operationService:login:failure:count:1hr:";
   String REDIS_NEWS_STATUS_PEREFIX = "operationService:news:";

   String REDIS_NEWS_ISTOP_PEREFIX = "operationService:news:istop:";
   String REDIS_APPNOTIFICATION_TIMING_TASK = "operationService:appnotification:timing:task:";

   // SMS
   String CLIENT_ITOUCHTV_APP = "ITOUCHTV_APP";
   String CLIENT_MEDIA_MANAGEMENT_SYSTEM = "MEDIA_MANAGEMENT_SYSTEM";

   String PURPOSE_REGISTRATION = "registration";
   String PURPOSE_RESET_PASSWORD = "resetPassword";

   // Third party account
   String THIRD_PARTY_TYPE_WEIBO = "weibo";
   String THIRD_PARTY_TYPE_WEIXIN = "weixin";
   String THIRD_PARTY_TYPE_QQ = "qq";

   // Domain
   int MAX_LENGTH_DOMAIN_USER_ID = 64;
   int MAX_LENGTH_DOMAIN_USER_LOGINACOUNT = 64;
   int MAX_LENGTH_DOMAIN_USER_PASSWORD = 64;
   int MAX_LENGTH_DOMAIN_USER_USER_NAME = 32;
   int MAX_LENGTH_DOMAIN_USER_NICK_NAME = 64;
   int MAX_LENGTH_DOMAIN_USER_AVATAR_URL = 256;
   int MAX_LENGTH_DOMAIN_USER_SIGNATURE = 256;
   int MAX_LENGTH_DOMAIN_MOBILE_NUMBER = 16;
   int MAX_LENGTH_DOMAIN_EMAIL = 64;

   int MAX_LENGTH_DOMAIN_ROLE_NAME = 45;

   int MAX_LENGTH_DOMAIN_MGR_MSG_PUSH_TITLE = 30;
   int MAX_LENGTH_DOMAIN_MGR_MSG_PUSH_DESCRIPTION = 50;

   int MAX_LENGTH_DOMAIN_STREAM_TITLE = 60;
   int MAX_LENGTH_DOMAIN_STREAM_DESC = 500;

   int MAX_LENGTH_DOMAIN_THIRD_PARY_ACCOUNT = 128;
   int MAX_LENGTH_DOMAIN_THIRD_PARY_PROPERTY_KEY = 128;
   int MAX_LENGTH_DOMAIN_THIRD_PARY_PROPERTY_VALUE = 1024;

   int MAX_LENGTH_DOMAIN_APP_VERSION = 64;
   int MAX_LENGTH_DOMAIN_INSTALL_CHANNEL = 64;
   int MAX_LENGTH_DOMAIN_OS = 16;
   int MAX_LENGTH_DOMAIN_OS_VERSION = 32;
   int MAX_LENGTH_DOMAIN_DEVICE_MODEL = 32;
   int MAX_LENGTH_DOMAIN_DEVICE_BRAND = 64;
   int MAX_LENGTH_DOMAIN_DEVICE_MANU = 64;
   int MAX_LENGTH_DOMAIN_DEVICE_INSTALL_APP_LIST = 7;//4016;
   int MAX_LENGTH_DOMAIN_DEVICE_INTEREST_LIST = 7;//1024;

   int MAX_LENGTH_DOMAIN_IDENTITY_TYPE = 64;
   int MAX_LENGTH_DOMAIN_IDENTITY_NUMBER = 64;
   int MAX_LENGTH_DOMAIN_REVIEW_ID = 64;
   int MAX_LENGTH_DOMAIN_COMPLAINTCATEGORY_CREATER_ID = 64;
   int MAX_LENGTH_DOMAIN_COMPLAINTCATEGORY_REMOVER_ID = 64;
   int MAX_LENGTH_DOMAIN_CHANNEL_PRARENTID = 64;
   int STATUSONE = 1;
   String SEPARATOR_DEVICE_INSTALL_APP_LIST = ",";
   String SEPARATOR_DEVICE_INTEREST_LIST = ",";
   String CHINESENOT = "无";
   int MEDIA_LIVE_STATUS_PREPARE = 0;
   int MEDIA_LIVE_STATUS_STARTED = 1;
   int MEDIA_LIVE_STATUS_FINISHED = 2;

   int MEDIA_LIVE_OPSTATUS_NORMAL = 0; //正常
   int MEDIA_LIVE_OPSTATUS_FORBIDDEN = 1; //禁播

   //默认的在媒体平台的密码（当管理平台人员需要调用发布文章和视频时需要在媒体平台上注册相同帐号时用到）
   static final String MEDIA_PLATFORM_DEFAULT_PWD = "TouchTV201600001";
   String RABBIT_MQ_QUEUE_RECEIVE_EMAIL_ALBUM = "ha.album";  //专辑，rabbitMq
   String RABBIT_MQ_QUEUE_HEADLINE = "ha.headline";
   String RABBIT_MQ_QUEUE_APPNOTIFICATION = "ha.appnotification";
   String RABBIT_MQ_QUEUE_COMMENTS_OPERATION = "ha.comments.operation";
   String RABBIT_MQ_QUEUE_OPERATION_NEWS = "ha.operation.news"; //运营位推荐新闻
   String RABBIT_MQ_QUEUE_NEWS_UPDATE = "ha.newsService.newsUpdate"; //新闻上架下架
   String RABBIT_MQ_QUEUE_MULTI_NEWS_UPDATE = "ha.newsService.multiNewsUpdate"; //十天内的新闻id用，隔开拼接推送

   String RABBIT_MQ_QUEUE_NEWS_CHANNEL_UPDATE = "ha.newsService.channelUpdate"; //新闻频道更新
   String RABBIT_MQ_QUEUE_LIVE_CHANNEL_UPDATE = "ha.liveService.channelUpdate"; //直播频道更新

   String RABBIT_MQ_QUEUE_MEDIA_LIVE = "ha.mediaLive"; //节目更新
   String RABBIT_MQ_QUEUE_BEAUTIFY_NEWS_DATA = "ha.newsService.beautifyNewsData";

   String RABBIT_MQ_QUEUE_ASYN_PUSH_MSG = "ha.asyn.pushMsg"; //异步推送消息
   String RABBIT_MQ_QUEUE_ASYN_PUSH_MSG_RESULT = "ha.asyn.pushMsg.result"; //推送消息异步返回结果

   //新闻专题增删改查通知app后台
   String RABBIT_MQ_QUEUE_NEWTOPIC_UPDATE = "ha.newsService.newsTopic.update";

   //推荐媒体号增删改查通知app后台
   String RABBIT_MQ_QUEUE_MEDIARECHANNEL_UPDATE = "ha.newsService.recommendMedia";

   //直播专题增删改查通知app后台
   String RABBIT_MQ_QUEUE_MEDIALIVETOPIC_UPDATE = "ha.liveService.medialiveTopic.update";

   //活动mq
   String RABBIT_MQ_QUEUE_ACTIVITY = "ha.activity";
   //用户 封停解封
   String RABBIT_MQ_QUEUE_USER_STATUS_UPDATE = "ha.userService.status.update";

    //PUSH
   String PUSH_CONTENT_KEY = "content";
   String PUSH_TYPE_EXTRA_KEY = "type";
   String PUSH_TARGET_EXTRA_KEY = "target";
   String PUSH_QUERY_PARAMETERS_EXTRA_KEY = "queryParms";
   String JPUSH_MSG = "pushmsg";

   String PUSH_QUERY_PARAMETERS_FROM_SOURCE = "appnotification";
   String PUSH_TARGET = "tag";
   String PUSH_TAG_V1 = "v1"; //v1支持图文,视频
   String PUSH_TAG_V2 = "v2"; //v2支持直播
   String PUSH_TAG_V4 = "v4"; //v3支持评论回复，v4支持新闻专题
   String PUSH_TAG_V5 = "v5"; //v5支持直播专题推送

   int ONLINE_MEDIA_LIVE_STATUS = 1; //状态直播中
   String MEDIALIVE_PUSHDATE_ISBEFORE_LIVEBEGINTIME = "mediaLivePushIsBeforePushDate";
   String HAS_MEDIA_LIVE = "hasMediaLive";
   String NO_MEDIA_LIVE = "noMediaLive";

   String RABBIT_MQ_QUEUE_STARTUPAD = "ha.startupAd";          //开屏广告rabbitmq
   String RABBIT_MQ_QUEUE_NEWSTOPICMEMBER = "ha.newsService.newsTopicMember";           //新闻专题成员操作mq
   String RABBIT_MQ_QUEUE_MEDIALIVETOPICMEMBER = "ha.liveService.mediaLiveTopicMember";           //直播专题成员操作mq

   String EXCHANGE_NAME = "pushExchange";
   String PUSH_JOB_DELETE = "delete";
   String PUSH_JOB_EDIT = "edit";

   String MQ_NEWS_REMOVE = "remove"; //下架
   String MQ_NEWS_PUBLISH = "publish";//上架

   int CHANNEL_TYPE_VERTICAL = 0;//垂直频道
   int CHANNEL_TYPE_REGION = 1;//地域频道

    //大数据推荐新闻日志埋点
    String BIGDATA_LOG_FORMAT = "%s$%s$%s$%s";   //算法平台$算法API$位置ID$类型
    //平台
    String PUSH_PLATFORM = "002";    //推送平台

    //API
    String NEWS_FROM_APP_API = "1109";                          //推送_人工推送API

    //位置
    String PUSH_NEWS_LOCATION_INFO = "3";    //推送位置

    //类型
    int CONTENT_TYPE_NEWS = 0;  //新闻
    int CONTENT_TYPE_TV = 1;  //电视直播
    int CONTENT_TYPE_LIVE = 2;  //现场直播
    int CONTENT_TYPE_MEDIALIVETOPIC = 4;  //现场直播专题
    int CONTENT_TYPE_NEWSTOPIC = 5;  //新闻专题

   int NEWS_CHECK_STATUS = 0;//文章审核状态
   int NEWS_REALEASE_STATUS = 0;//文章发布状态

    long CHANNEL_PK_POLITICS = 527L;//时政频道pk，搜索置顶新闻用

   long RECOMMEND_CHANNEL_PK=534L;//推荐频道PK，管理推荐使用
   
   int TAG_STATUS_AVAIABLE = 0;      //标签状态 0-可用
   int TAG_STATUS_UNAVAIABLE = 1;   //标签状态 1-停用
   int TAG_TYPE_LEAF = 1;            //类型1-叶子
   int TAG_TYPE_TRUNK = 0;           //类型0-非叶子(主干)
   int TAG_INPUT_MANUAL = 0;         //入库类型 0-手工
   int TAG_ROOT_INDEX = 0;           //根节点、标签分类起点
   int TAG_DEFAULT_LEVEL = 1;        //默认层级从1开始
}
