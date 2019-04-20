package com.laofaner.springboot.util;

/**
 *
 */
public enum ResultCode implements IResultCode {
    Success(0, "操作成功"),
    Failed(1, "操作失败"),
    Empty(2, "没有更多了"),
    UnknownExcetion(3, "系统异常,请稍后再试。"),
    ImageVerificationCodeError(4, "图片验证码错误"),
    NeedLogin(5, "用户没有登录"),
    CheckLoginFailure(6, "用户不存在或者密码错误"),
    ParamsIsNull(7, "参数为空,操作失败"),
    ALiYunOSSUploadError(8, "阿里云OSS图片上传失败"),
    LoginNameIsExist(16, "登录名在系统中已存在"),
    CorpNameIsExist(18, "企业名称已存在"),
    OrgIdNotExist(17, "企业ID不存在"),
    OrgIdIsExist(19, "企业名称已存在"),
    CorpIsOffline(21, "商户已下线"),
    Timeout(8, "操作超时"),
    NameExists(11, "名称已存在"),
    DepartmentIsExist(12, "该部门已经存在"),
    RoleIsInUse(20, "角色已被用户关联，不能操作"),
    DepartIsParent(23, "有下级部门，不能删除"),
    DepartIsUseByUser(24, "部门已被人员绑定，不能删除"),
    RoleIsExist(13, "该角色已经存在"),
    UserNotExist(33, "用户不存在"),
    OldPwdNotRight(34, "原密码不正确"),
    NewPwdCantEqualOldPwd(35, "新密码与原密码不能相同"),
    LoginNameExist(42, "登录名已存在"),
    MobileIsExist(43, "手机号重复注册"),
    MobileOrNameIsNotExist(44, "用户名或手机号不存在"),
    ScoreTypeEntityIsNotExist(45, "不存在此类型积分"),
    MobileNotMatches(46, "手机号码格式不正确"),
    VerificationIsError(47, "验证码错误或已失效"),
    AbnormalSmsService(48,"短信服务异常"),

    ProjectIsNotExist(50, "不存在名为物业费的缴费项目，请手动新增"),
    CardIdOrAccount94IsNull(53, "缺少对公账号或94账号"),
    BillIsInOrder(56, "账单已在用户未完成订单中，不能操作"),
    EndCannotBigger(51, "结束月份不能小于开始月份"),
    ScoreOverAvailable(60, "积分余额不足"),
    PersonnelIsExist(77, "人员已存在"),
    OwnerIsNotExist(78, "该房屋与业主信息不匹配"),
    HouseIsNotExist(108, "房屋不存在"),
    BillIsExist(110, "账单已存在"),
    BillIsFinished(111, "账单已完结，不能操作"),
    BillIsNotExist(112, "账单不存在"),
    BillIsPaid(113, "账单已经支付"),
    BillIsDeleted(114, "账单已经被删除，不能支付"),
    PayTermIsNotTrue(115, "请先完成更早的账单"),
    OrderIsNotExist(116, "订单不存在"),
    OrderIsPaid(117, "订单已经支付，不能操作"),
    OrderIsInPay(118, "订单支付中，不能操作"),

    RepeatedFlow(200, "重复流水"),
    BillAlreadyPaid(201, "该账单已经被支付，本次只记录流水"),
    BillNotPaidYet(202, "该账单未被支付或已经冲正，本次只记录流水"),

    OrderIsError(300, "订单异常"),
    HaveOrderToPay(301,"您有未完成缴费单，请到未完成缴费单中进行支付"),
    PayWayEntityIsNotExist(302, "不存在此类支付方式"),
    IntegralStatusHasChanged(303, "积分无法进行该操作，请确认状态是否最新"),
    PersonnelIsNotExist(304, "人员不存在"),
    IntegralUserIdHasNotFound(305,"积分用户不存在"),

    DliverError(399,"发货失败，订单未成团"),
    FaceImageCannotBeRecognized(401,"人脸图片无法识别，请重新上传"),
    CouponIdIsEmpty(402,"卡券Id为空"),
    CouponNameExist(403,"卡券名称已存在"),
    CouponRemove(405,"活动正在开启,删除卡券失败"),
    IsNotWhiteUser(502,"功能暂未开通，请前往就近网点购买，敬请谅解"),
    OutCardTypeError(503,"转出卡应为借记卡"),
    InCardTypeError(504,"转入卡应为借记卡"),
    IsNotBus(505,"请到网点进行签约"),
    MessageIsNotNull(506,"该用户已签约"),
    ActivityNull(406,"没有活动"),
	ThisBillIsPaiedAlready(407,"当前帐期已缴费"),
    BillPeriodHasNoBill(408,"当前账期无欠费"),
    BillNotExists(409,"账单不存在"),
    UnNeedOffLinePay(410,"账户余额充足,无需线下缴费"),
    SignExist(508,"该客户已签到!"),
    PayAmountIsWrong(408,"支付金额有误"),
	BindFaceOutOfLimit(420,"绑定人脸超过限制数"),
	EpayNumRegError(601,"商e付商户号注册失败！"),
	UserNotPayAttention(701,"用户未关注"),
    PaymentSignError(10001,"签名认证失败！"),
    OrderIsNotExsit(10002,"订单不存在！"),
    OrderHasRepeat(10003,"订单重复通知！"),
    QrCodeNotSupported(421,"当前小区不支持开门二维码"),
    DeviceNotExist(422,"当前小区未配置设备"),
    CommunityEntranceDefined(423,"当前小区已配置门禁"),
    OrderEpayIdIsNull(10004,"e付订单不存在"),
    OrderResultFindError(10005,"查询订单支付结果异常"),
    FeeIsNull(10006,"费率为空"),
    StatusInUse(10007,"状态在使用中"),
    ActivityDateHasExist(10008,"活动时间冲突！"),
    HouseStatusNameIsExist(10009,"状态名称已存在"),
    GateWayException(1080,"社区物业网关调用超时"),

    RedRecordsOutLimit(900001,"你已获得抽奖资格"),
    RedCodeHasExist(900002,"你已经抽过该业务了"),
    RedActivityNotBegin(900003,"活动未开始"),
    RedActivityNameHasExist(900004,"活动已存在"),
    LottryTransactioTypeNameHasExist(900005,"交易类型已存在"),
    RedActivityIsBegin(900006,"活动进行中，不可操作"),
    RedActivityIsNoPause(900007,"请先暂停活动再操作！"),
    RedActivityNameExists(900008,"活动名称已存在"),
    TranscationTypeNameExists(900009,"交易类型已存在"),
    NoActivityFound(900010,"活动不存在"),
    NoTransacioType(900011,"交易类型不存在"),
    ActivityIsEffective(900012,"活动已生效，不能进行此操作！"),
    ActivityTimeError(900013,"活动时间配置错误！"),
	ActivityAmountError(900013, "红包金额配置错误！"),
	DUPLICATE_FREEZE(900014, "重复冻结！"),
    ;

    private String desc;
    private int code;

    private ResultCode(int code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public int getCode() {
        return code;
    }
}
