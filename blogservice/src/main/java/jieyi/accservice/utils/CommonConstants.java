package jieyi.accservice.utils;

public class CommonConstants
{
	public static String IDENTITY_TYPE_ID = "20033"; // 联机-证件类型
	public static String ACCCONSUME_TYPE_ID = "36001"; // 联机-消费账户类型(参数下载)
	public static String ACCOUNT_TYPE_ID = "40001"; // 联机-开户账户类型
	public static String OPENTXN_STATUS_ID = "40002"; // 联机-处理状态
	public static String OPERA_STATUS_ID = "40003"; // 联机-操作状态
	public static String AGENCY_NET_LST = "40007"; // 所代理的商户列表
	public static String INTEGRAL_TYPE_ID = "40008"; // 联机-积分兑换账户类型
	public static String ACCOUNTSV_TYPE_ID = "40009"; // 联机-充值账户类型
	public static String ICEARMARK_TYPE_ID = "40010"; // 联机-圈存账户类型

	public static String DOWN_PARA_ID = "downParaId";
	public static String COMMON_OFFLINE_TRAN_RESPCODE = "000000";// 公共的脱机交易成功返回码
	public static String COMMON_ONLINE_SUCCESS_RESPCODE = "00"; // 公共的联机交易成功返回码

	public static String PARAMETER_FLAG_FIXED = "1"; // 固定参数--不可改变的自定义参数
	public static String PARAMETER_FLAG_POSP = "2"; // POS参数--通过发送报文，下载到的
	public static String PARAMETER_FLAG_MAINTAINABLE = "3"; // 可维护参数--可以进行修改的参数

	/* 批量开户/充值操作状态 */
	public static String BAT_OPRSTATUS_UNCHECK = "0"; // 未审核
	public static String BAT_OPRSTATUS_TXNCOMPLETE = "1"; // 交易完成
	public static String BAT_OPRSTATUS_TXNUNCOMPLETE = "2"; // 未全部完成
	public static String BAT_OPRSTATUS_CHECKPASS = "3"; // 已审核通过
	public static String BAT_OPRSTATUS_CHECKNOPASS = "4"; // 审核不通过

	/* 批量操作类型 */
	public static String BAT_TYPE_ACCOPEN = "10"; // 批量开户
	public static String BAT_TYPE_ACCSV = "11"; // 批量充值

	/* 批量开户的处理状态 */
	public static String BATACCOPEN_TXNSTATUS_UNTXN = "0"; // 未处理
	public static String BATACCOPEN_TXNSTATUS_TXNSUCCESS = "1"; // 处理成功
	public static String BATACCOPEN_TXNSTATUS_TXNFAILURE = "2"; // 处理失败
	public static String BATACCOPEN_TXNSTATUS_CHECKPASS = "3"; // 审核通过
	public static String BATACCOPEN_TXNSTATUS_CHECKNOPASS = "4"; // 审核不通过
	/*
	 * 批量充值的处理状态
	 */
	public static String BATACCSV_TXNSTATUS_UNTXN = "0"; // 未处理
	public static String BATACCSV_TXNSTATUS_TXNSUCCESS = "1"; // 处理成功
	public static String BATACCSV_TXNSTATUS_TXNFAILURE = "2"; // 处理失败
	public static String BATACCSV_TXNSTATUS_BCKOUTSUCCESS = "3"; // 无应答，已充正成功
	public static String BATACCSV_TXNSTATUS_UNRESP_UNBCKOUT = "4"; // 无应答，未充正
	public static String BATACCSV_TXNSTATUS_CHECKPASS = "5"; // 审核通过
	public static String BATACCSV_TXNSTATUS_CHECKNOPASS = "6"; // 审核不通过

	public static String ONLINE_COMMON_CARDTYPE = "普通卡";
	public static String ONLINE_COMMON_COSTTYPE = "交通费";

	/*
	 * 卡型
	 */
	public static String CARDMODEL_CPU = "1";
	public static String CARDMODEL_M1 = "3";

	/* 管理类消息类型 对应于报文结构（一个报文结构一个类型） */
	public static final String TRAN_CODE_TMK_DOWNLOAD = "6285"; // 终端主密钥下载
	public static final String TRAN_CODE_CHECKIN = "6215"; // 终端签到

	/* IC卡管理类交易类型 对应于报文结构（一个报文结构一个类型） */
	public static final String TRAN_CODE_CARD_OPERATION = "1061"; // 卡操作请求
	public static final String TRAN_CODE_SALE_CHECK_TOPUP_CARD = "1062"; // 售卡,月票充值,充值撤销,月票充值撤销，年检
																			// 确认交易
	public static final String TRAN_CODE_ICEARMARK_OPERATION = "1162"; // IC卡指定账户圈存(带密码)
	public static final String TRAN_CODE_ICEARMARK_OPERATION_NOPWD = "1162A"; // IC卡指定账户圈存(不带密码)
	public static final String TRAN_CODE_ICEARMARK_CONFIRM = "5162"; // IC卡指定账户圈存结果通知
	public static final String TRAN_CODE_ECASHRECHARGE_OPERATION = "1163"; // 电子钱包充值请求
	public static final String TRAN_CODE_ECASHRECHARGE_CONFIRM = "5163"; // 充值确认
	public static final String TRAN_CODE_CARDMNGXX = "CMXX"; // 卡管理类交易：挂失 申请, 确认
																// ,结果获取, 解挂
	public static final String TRAN_CODE_MARKBLACK = "1099";// 卡片置黑
	// public static final String TRAN_CODE_LOSER_CARD = "1395"; //挂失 申请, 确认
	// ,结果获取, 解挂

	public static final String MESSAGECODE2_PERSONINFOACTIVE = "8479"; // 记名信息启用
	public static final String MESSAGECODE2_PERSONINFOUPDATE = "8480"; // 记名信息更新
	public static final String MESSAGECODE2_PERSONINFODELETE = "8481"; // 记名信息注销
	public static final String MESSAGECODE2_ELECTRONICSALE = "1064"; // 电子现金售卡
	public static final String MESSAGECODE2_YEARCHECK = "1071"; // 年检
	public static final String MESSAGECODE2_MONTH_TOPUP_CARD = "8482"; // 月票充值
	public static final String MESSAGECODE2_MONTH_MOVE_CARD = "8484"; // 月票移资
	public static final String MESSAGECODE2_DEBLOCK_CARD = "8471"; // 解锁
	public static final String MESSAGECODE2_BLOCK_CARD = "8470"; // 解锁
	public static final String MESSAGECODE2_LOSEREGISTER = "1395"; // 挂失申请
	public static final String MESSAGECODE2_LOSEUNREGISTER = "1420"; // 解挂
	public static final String MESSAGECODE2_LOSEGETCARDRESULT = "1405"; // 挂失结果获取
	public static final String MESSAGECODE2_LOSECOMPLETE = "1415"; // 挂失确认
	public static final String MESSAGECODE2_REPLACECARDREG = "1365"; // 换卡申请
	public static final String MESSAGECODE2_REPLACECARDRESULT = "1375"; // 换卡结果获取
	public static final String MESSAGECODE2_REPLACECARDCOMP = "1385"; // 换卡确认
	public static final String MESSAGECODE2_RETURNCARDREG = "1335"; // 退卡申请
	public static final String MESSAGECODE2_RETURNCARDRESULT = "1345"; // 退卡结果获取
	public static final String MESSAGECODE2_RETURNCARDCOMP = "1355"; // 退卡确认
	public static final String MESSAGECODE2_RETURNCAPITAL = "1425"; // 退资申请
	public static final String MESSAGECODE2_RETURNCAPITALRESULT = "1435"; // 退资结果获取
	public static final String MESSAGECODE2_RETURNCAPITALCOMP = "1445"; // 退资结果确认

	/* 交易类消息类型 对应于报文结构（一个报文结构一个类型） */
	public static final String TRAN_CODE_OPENACC = "7000"; // 账户开户
	public static final String TRAN_CODE_CLOSEACC = "7020"; // 账户注销(带密码)
	public static final String TRAN_CODE_CLOSEACC_NOPWD = "7020A"; // 账户注销(不带密码)
	public static final String TRAN_CODE_ORD_CONSUMER = "1105"; // 账户普通消费(带密码)
	public static final String TRAN_CODE_ORD_CONSUMER_NOPWD = "1105A";// 账户普通消费(不带密码)
	public static final String TRAN_CODE_ACCOUNTFHREVERSE = "2105"; // 账户消费冲正
	public static final String TRAN_CODE_PWDCHANGE = "1026"; // 修改密码
	public static final String TRAN_CODE_PWDCHANGE_NOPWD = "1026A"; // 修改密码(不带密码)
	public static final String TRAN_CODE_PWDRESET = "1027"; // 密码重置
	public static final String TRAN_CODE_ACCOUNTSV_CHECK = "1028"; // 账户充值验证
	public static final String TRAN_CODE_ACCOUNTSV = "1305"; // 账户充值
	public static final String TRAN_CODE_ACCOUNTSV_CONFIRM = "1307"; // 账户充值确认
	public static final String TRAN_CODE_ACCOUNTSVCANCEL = "3305"; // 账户充值撤销
	public static final String TRAN_CODE_ACCOUNTSVCANCELREVERSE = "4305"; // 账户充值撤销冲正
	public static final String TRAN_CODE_TRANSFERMONEY = "1107"; // 账户转账(带密码)
	public static final String TRAN_CODE_TRANSFERMONEY_NOPWD = "1107A"; // 账户转账(不带密码)
	public static final String TRAN_CODE_CRDQUERY = "1025"; // 余额查询(带密码)
	public static final String TRAN_CODE_CRDQUERY_NOPWD = "1025A"; // 余额查询(不带密码)
	public static final String TRAN_CODE_ACCRETURNREQUEST = "1206"; // 账户退资

	/************* 旧的 **************/
	/* IC卡管理类交易类型 对应于报文结构（一个报文结构一个类型） */
	// public static final String TRAN_CODE_CARD_OPERATION_BACK =
	// "2305";//卡操作请求冲正
	// public static final String TRAN_CODE_SALE_TOPUP_CARD = "1405";
	// //售卡,充值,月票充值,充值撤销,月票充值撤销 确认交易
	public static final String TRAN_CODE_RETURN_CARD = "1335"; // 退卡 申请 , 确认
																// ,结果获取, 结果撤销
	public static final String TRAN_CODE_REPLACE_CARD = "1365"; // 换卡 申请, 确认
																// ,结果获取, 结果撤销
	public static final String TRAN_CODE_REGISTER_INFO = "8005"; // 记名信息
	public static final String TRAN_CODE_CARD_DEBLOCK = "1333"; // 解锁
	public static final String TRAN_CODE_CARD_ACTIVATE = "1332"; // 激活

	/* 管理类消息类型 对应于报文结构（一个报文结构一个类型） */
	public static final String TRAN_CODE_CHECKOUT = "";// 终端签退
	public static final String TRAN_CODE_BATCHSETTLE = "6305"; // 批结算
	public static final String TRAN_CODE_UPLOADTXN = "0320";// 批上送金融交易(脱机钱包消费)
	public static final String TRAN_CODE_OPERPWDCHANGE = "7505";// POS机操作员改密
	public static final String TRAN_CODE_PUBLICPARAMETER_DOWNLOAD = "6245";// POS机操作员改密

	/* 交易类消息类型 对应于报文结构（一个报文结构一个类型） */
	// public static final String TRAN_CODE_OPENACC = "7000"; //账户开户

	public static final String TRAN_CODE_OPENBANK = "8115"; // 银行签约
	public static final String TRAN_CODE_CLOSEBANK = "8125"; // 银行解约

	public static final String TRAN_CODE_ACCOUNTFH = "1105"; // 账户消费 有密码
	public static final String TRAN_CODE_ACCOUNTFH_NOPASSWORD = "1115"; // 账户消费
																		// 无密码
	public static final String TRAN_CODE_ACCOUNTFH_CANCEL = "3105"; // 账户消费撤销
	public static final String TRAN_CODE_ACCOUNTFH_BACK = "2105"; // 账户消费冲正
	public static final String TRAN_INN_ACCOUNTSV = "1028"; // 账户充值
	public static final String TRAN_CODE_ICEARMARK = "1205"; // 账户圈存
	public static final String TRAN_CODE_ACCOUNTBIND = "7025"; // 账户绑定
	public static final String TRAN_CODE_ACCOUNTUNBIND = "7035"; // 账户解绑
	public static final String TRAN_CODE_ACCOUNTLOSRLOCK = "7205"; // 账户挂失
	public static final String TRAN_CODE_POINTFH_CANCEL = ""; // 积分消费撤销
	public static final String TRAN_CODE_POINTFH_CONFIRM = ""; // 积分消费确认
	public static final String TRAN_CODE_MAINCARD_LOSE_CHANGE = "7045"; // 主卡挂失换卡
	public static final String TRAN_CODE_ACCOUNTSV_CARD = "1205"; // 账户圈存消费扣款
	public static final String TRAN_CODE_QUERYACCOUNTINFO = "7305"; // 获取账户信息
	public static final String TRAN_CODE_MODIFYACCOUNTINFO = "7405"; // 获取账户信息
	public static final String TRAN_CODE_FROZENACCOUNT = "7215"; // 账户冻结解冻

	/* 入库（内部）交易类型 */
	public static final String TRAN_INN_SALE_CARD = "2063"; // 卡片 售卡确认交易
	public static final String TRAN_INN_TOPUP_CARD = "2062"; // 卡片 充值确认交易
	public static final String TRAN_INN_MONTH_TOPUP_CARD = "2064"; // 月票 充值确认交易
	public static final String TRAN_INN_QUALITY_REPLACE_SALE_CARD = "2091"; // 卡片
																			// 质保期换卡售卡确认交易
																			// （质保期内卡面好换卡售卡)
	public static final String TRAN_INN_GROUP_SALE_CARD = "2093"; // 卡片
																	// 团体卡售卡确认交易
	public static final String TRAN_INN_YEAR_CHECK_CARD = "7502"; // 卡片 年检确认交易
	public static final String TRAN_INN_RETURN_CARD_REG = "3450"; // 退卡 申请
	public static final String TRAN_INN_RETURN_CARD_COMP = "3452"; // 退卡 完成
	public static final String TRAN_INN_REPLACE_CARD_REG = "3458"; // 换卡 申请
	public static final String TRAN_INN_REPLACE_CARD_COMP = "3460"; // 换卡 完成
	public static final String TRAN_INN_OPENACC = "7005"; // 账户开户
	public static final String TRAN_INN_LOSS = "7215"; // 账户挂失
	public static final String TRAN_INN_UN_LOSS = "7225"; // 账户解挂
	public static final String TRAN_INN_TOPUP_CARD_CANCEL = "3062"; // 联机充值撤销
	public static final String TRAN_INN_MONTH_TOPUP_CARD_CANCEL = "3064";// 联机月票充值撤销
	public static final String TRAN_INN_LOSSREGISTER = "3470";// 挂失请求
	public static final String TRAN_INN_PHONELOSSREGISTER = "3570";// 电话挂失请求
	public static final String TRAN_INN_LOSSUNREGISTER = "3471";// 解挂请求
	public static final String TRAN_INN_LOSSCOMPLETE = "3472";// 挂失确认
	public static final String TRAN_INN_ACCOUNT_TOPUP_CARD = "2065"; // 卡片
																		// 圈存充值确认交易
	public static final String TRAN_INN_DEBLOCK = "3473"; // 解锁
	public static final String TRAN_INN_ACTIVATE = "3474"; // 激活
	public static final String TRAN_INN_CARBALREDEMPTION = "3501";// 余额赎回申请
	public static final String TRAN_INN_FROZEN = "7315"; // 账户挂失
	public static final String TRAN_INN_UN_FROZEN = "7425"; // 账户解挂

	/* 消息处理码 第一，二位 */
	public static final String MESSAGECODE1_TYPE00 = "00";
	public static final String MESSAGECODE1_TYPE80 = "80";
	public static final String MESSAGECODE1_TYPE81 = "81";
	public static final String MESSAGECODE1_TYPE82 = "82";
	public static final String MESSAGECODE1_TYPE83 = "83";
	public static final String MESSAGECODE1_TYPE84 = "84";
	public static final String MESSAGECODE1_TYPE85 = "85";
	public static final String MESSAGECODE1_TYPE86 = "86";
	/* 消息处理码 第三到六位 */
	public static final String MESSAGECODE2_SALECARD = "1065"; // 售卡
	public static final String MESSAGECODE2_GROUPSALECARD = "1318"; // 团体卡售卡
	public static final String MESSAGECODE2_QUALITYREPLACESALECARD = "1317"; // 质保期换卡售卡
	public static final String MESSAGECODE2_TOPUPCARD = "1325"; // 充值
	public static final String MESSAGECODE2_MONTHTOPUPCARD = "1326"; // 月票充值
	public static final String MESSAGECODE2_REMOVEMONEY = "1327"; // 移资
	public static final String MESSAGECODE2_REPLACECARDSALECARD = "1067"; // 换卡售卡
	public static final String MESSAGECODE2_LOSECARDSALECARD = "1072"; // 挂失售卡
	public static final String MESSAGECODE2_RETURNCARDRESETSTATE = "1335"; // 退卡重置卡状态
	public static final String MESSAGECODE2_RETURNACCCONSUMER = "1105"; // 账户消费

	public static final String MESSAGECODE2_REPLACECARDRESULTCANCEL = "13xx"; // 退卡结果获取撤销
	public static final String MESSAGECODE2_RETURNCARDRESULTCANCEL = "13xx"; // 换卡结果获取撤销
	public static final String MESSAGECODE2_PERSONINFORESULT = "8105"; // 记名信息获取
	public static final String MESSAGECODE2_TOPUPCARDCANCEL = "2325"; // 充值撤销
	public static final String MESSAGECODE2_MONTHTOPUPCARDCANCEL = "2326"; // 月票充值撤销
	public static final String MESSAGECODE2_DEBLOCK = "1333"; // 解锁
	public static final String MESSAGECODE2_ACTIVATE = "1332"; // 激活
	public static final String MESSAGECODE2_CARBALREDEMPTIONREG = "1401"; // 余额赎回请求
	public static final String MESSAGECODE2_CARBALREDEMPTIONRESULT = "1402"; // 余额赎回结果获取
	public static final String MESSAGECODE2_CARBALREDEMPTIONCOMP = "1403"; // 余额赎回确认

	/**
	 * 交易类型
	 **/

	/* 消费 */
	public static final String TRAN_TYPE_SEND_BALQRY = "1022"; // 交易类型：账户消费
																// ，与发送账户消费报文文件名中的数字相同
	public static final String TRAN_TYPE_RESRV_BALQRY = "1122";

	/* 消费 */
	public static final String TRAN_TYPE_SEND_ACCCONSUME = "1001"; // 交易类型：账户消费
																	// ，与发送账户消费报文文件名中的数字相同
	public static final String TRAN_TYPE_RESRV_ACCCONSUME = "1101";
	/* 消费冲正 */
	public static final String TRAN_TYPE_SEND_ACCCONSUMEBCKOUT = "1002";// 交易类型：消费
																		// 冲正
																		// ，与发送账户消费报文文件名中的数字相同
	public static final String TRAN_TYPE_RESRV_ACCCONSUMEBCKOUT = "1102";

	/* 消费撤销 */
	public static final String TRAN_TYPE_SEND_CONSUMECANCEL = "1003";// 交易类型：消费撤销
																		// ，与发送消费撤销报文文件名中的数字相同
	public static final String TRAN_TYPE_RESRV_CONSUMECANCEL = "1103";
	/* 充值 */
	public static final String TRAN_TYPE_SEND_ACCSV = "1005"; // 交易类型：账户充值
																// ，与发送账户充值报文文件名中的数字相同
	public static final String TRAN_TYPE_RESRV_ACCSV = "1105";
	/* 充值冲正 */
	public static final String TRAN_TYPE_SEND_ACCSVBCKOUT = "1006";// 交易类型：充值 冲正
																	// ，与发送账户充值报文文件名中的数字相同
	public static final String TRAN_TYPE_RESRV_ACCSVBCKOUT = "1106";

	/* 积分充值 */
	public static final String TRAN_TYPE_SEND_INTEGRALSV = "1023"; // 交易类型：积分充值
																	// ，与发送账户积分充值报文文件名中的数字相同
	public static final String TRAN_TYPE_RESRV_INTEGRALSV = "1123";
	/* 积分充值冲正 */
	public static final String TRAN_TYPE_SEND_INTEGRALSVBCKOUT = "1024";// 交易类型：积分充值
																		// 冲正
																		// ，与发送账户积分充值报文文件名中的数字相同
	public static final String TRAN_TYPE_RESRV_INTEGRALSVBCKOUT = "1124";

	/* 开户 */
	public static final String TRAN_TYPE_SEND_OPENACC = "7005";// 交易类型：开户

	/* 销户 */
	public static final String TRAN_TYPE_SEND_CLOSEUSER = "7015";// 交易类型：销户
	public static final String TRAN_TYPE_RESRV_CLOSEUSER = "7016";

	/* 账户绑定 */
	public static final String TRAN_TYPE_SEND_ACCBIND = "1010";// 交易类型：账户绑定
	public static final String TRAN_TYPE_RESRV_ACCBIND = "1110";

	/* 账户解绑定 */
	public static final String TRAN_TYPE_SEND_ACCUNBIND = "1011";// 交易类型：账户解绑定
	public static final String TRAN_TYPE_RESRV_ACCUNBIND = "1111";

	/* 消费撤销冲正 */
	public static final String TRAN_TYPE_SEND_CONSUMECANCELBCKOUT = "1012";// 交易类型：消费撤销冲正
																			// ，与发送消费撤销冲正报文文件名中的数字相同
	public static final String TRAN_TYPE_RESRV_CONSUMECANCELBCKOUT = "1112";
	/* 公共参数下载 */
	public static final String TRAN_TYPE_SEND_PUBLICPARAMETER_DOWNLOAD = "1013";// 交易类型：公共参数下载
																				// ，与发送公共参数下载报文文件名中的数字相同
	public static final String TRAN_TYPE_RESRV_PUBLICPARAMETER_DOWNLOAD = "1113";
	/* 卡号变更 */
	public static final String TRAN_TYPE_SEND_CARD_CHANGE = "1014";// 交易类型：卡号变更
																	// ，与发送卡号变更报文文件名中的数字相同
	public static final String TRAN_TYPE_RESRV_CARD_CHANGE = "1114";
	/* IC圈存 */
	public static final String TRAN_TYPE_SEND_EARMARK = "1015";// 交易类型：IC圈存
																// ，与发送IC圈存报文文件名中的数字相同
	public static final String TRAN_TYPE_RESRV_EARMARK = "1115";
	/* IC圈存冲正 */
	public static final String TRAN_TYPE_SEND_EARMARKBCKOUT = "1016";// 交易类型：IC圈存冲正
																		// ，与发送IC圈存冲正报文文件名中的数字相同
	public static final String TRAN_TYPE_RESRV_EARMARKBCKOUT = "1116";

	/* 修改密码 */
	public static final String TRAN_TYPE_SEND_PWDCHANGE = "0200";// 交易类型：修改密码
	public static final String TRAN_TYPE_RESRV_PWDCHANGE = "0210";// 交易类型：修改密码

	/* 批结算 */
	public static final String TRAN_TYPE_SEND_BATCHSETTLE = "0500";// 交易类型：批结算
	/* 联机账户签到 */
	public static final String TRAN_TYPE_SEND_ONLINECHECKIN = "0800";// 交易类型：联机账户签到
	/* 联机账户签退 */
	public static final String TRAN_TYPE_SEND_ONLINECHECKOUT = "0820";// 交易类型：联机账户签退
	/* TMK下载 */
	public static final String TRAN_TYPE_SEND_TMKDOWN = "0840";// 交易类型：TMK下载

	/**
	 * 处理码
	 **/
	/* 余额查询 */
	public static final String TRAN_PROCODE_SEND_BALQRY = "0200"; // 交易处理码
																	// ，余额查询值请求码：0200
	public static final String TRAN_PROCODE_RESRV_BALQRY = "0210"; // 交易处理码
																	// ，余额查询响应码：0210
	/* 账户充值 */
	public static final String TRAN_PROCODE_SEND_ACCSV = "0200"; // 交易处理码
																	// ，账户充值请求码：0200
	public static final String TRAN_PROCODE_RESRV_ACCSV = "0210"; // 交易处理码
																	// ，账户充值响应码：0210
	/* 充值冲正 */
	public static final String TRAN_PROCODE_SEND_ACCSVBCKOUT = "0400"; // 交易处理码
																		// ，账户充值冲正请求码：0400
	public static final String TRAN_PROCODE_RESRV_ACCSVBCKOUT = "0410"; // 交易处理码
																		// ，账户充值冲正响应码：0410

	/* 积分充值 */
	public static final String TRAN_PROCODE_SEND_INTEGRALSV = "0200"; // 交易处理码
																		// ，积分充值请求码：0200
	public static final String TRAN_PROCODE_RESRV_INTEGRALSV = "0210"; // 交易处理码
																		// ，积分充值响应码：0210
	/* 积分充值冲正 */
	public static final String TRAN_PROCODE_SEND_INTEGRALSVBCKOUT = "0400"; // 交易处理码
																			// ，积分充值冲正请求码：0400
	public static final String TRAN_PROCODE_RESRV_INTEGRALSVBCKOUT = "0410"; // 交易处理码
																				// ，积分充值冲正响应码：0410

	/* 账户消费 */
	public static final String TRAN_PROCODE_SEND_ACCCONSUME = "0200"; // 交易处理码
																		// ，账户消费请求码：0200
	public static final String TRAN_PROCODE_RESRV_ACCCONSUME = "0210"; // 交易处理码
																		// ，账户消费响应码：0210
	/* 消费冲正 */
	public static final String TRAN_PROCODE_SEND_ACCCONSUMEBCKOUT = "0400"; // 交易处理码
																			// ，账户消费冲正请求码：0400
	public static final String TRAN_PROCODE_RESRV_ACCCONSUMEBCKOUT = "0410"; // 交易处理码
																				// ，账户消费冲正响应码：0410
	/* 消费撤销 */
	public static final String TRAN_PROCODE_SEND_CONSUMECANCEL = "0200"; // 交易处理码
																			// ，账户消费撤销请求码：0200
	public static final String TRAN_PROCODE_RESRV_CONSUMECANCEL = "0210"; // 交易处理码
																			// ，账户消费撤销响应码：0210
	/* 消费撤销 */
	public static final String TRAN_PROCODE_SEND_CONSUMECANCELBCKOUT = "0400"; // 交易处理码
																				// ，账户消费撤销冲正请求码：0200
	public static final String TRAN_PROCODE_RESRV_CONSUMECANCELBCKOUT = "0410"; // 交易处理码
																				// ，账户消费撤销冲正响应码：0210
	/* 公共参数下载 */
	public static final String TRAN_PROCODE_SEND_PUBLICPARAMETER_DOWNLOAD = "0800";// 交易处理码：公共参数下载请求码：0800
	public static final String TRAN_PROCODE_RESRV_PUBLICPARAMETER_DOWNLOAD = "0810";// 交易处理码：公共参数下载响应码：0810
	/* 卡号变更 */
	public static final String TRAN_PROCODE_SEND_CARD_CHANGE = "7045";// 交易处理码：卡号变更请求码：7045
	public static final String TRAN_PROCODE_RESRV_CARD_CHANGE = "7046";// 交易处理码：卡号变更响应码：7046
	/* IC圈存 */
	public static final String TRAN_PROCODE_SEND_EARMARK = "0200";// 交易处理码：IC圈存请求码：0200
	public static final String TRAN_PROCODE_RESRV_EARMARK = "0210";// 交易处理码：IC圈存响应码：0210
	/* IC圈存冲正 */
	public static final String TRAN_PROCODE_SEND_EARMARKBCKOUT = "0400";// 交易处理码：IC圈存冲正请求码：0400
	public static final String TRAN_PROCODE_RESRV_EARMARKBCKOUT = "0410";// 交易处理码：IC圈存冲正响应码：0410
	/* 积分消费 */
	public static final String TRAN_PROCODE_SEND_POINTCONSUME = "0200"; // 交易处理码
																		// ，积分消费请求码：0200
	public static final String TRAN_PROCODE_RESRV_POINTCONSUME = "0210"; // 交易处理码
																			// ，积分消费响应码：0210
	/* 积分消费冲正 */
	public static final String TRAN_PROCODE_SEND_POINTCONSUMEBCKOUT = "0400"; // 交易处理码
																				// ，积分消费冲正请求码：0400
	public static final String TRAN_PROCODE_RESRV_POINTCONSUMEBCKOUT = "0410"; // 交易处理码
																				// ，积分消费冲正响应码：0410

	/* 积分消费撤销 */
	public static final String TRAN_PROCODE_SEND_POINTCONSUMECANCEL = "0200"; // 交易处理码，积分消费撤销请求码：0200
	public static final String TRAN_PROCODE_RESRV_POINTCONSUMECANCEL = "0210"; // 交易处理码，积分消费撤销响应码：0210

	/* 主卡挂失换卡 */
	public static final String TRAN_PROCODE_SEND_MAINCARDLOSECHANGE = "7045"; // 交易处理码，主卡挂失换卡请求码：7045
	public static final String TRAN_PROCODE_RESRV_MAINCARDLOSECHANGE = "7046"; // 交易处理码，主卡挂失换卡响应吗：7046
	/*调用客管接口，获取客户号 */
	public static final String TRAN_PROCODE_SEND_QUERY_CUSTOM_NO = "info/queryCustListByPhone"; //根据手机号查询客户信息列表
	public static final String TRAN_PROCODE_SEND_REGISTER_CUSTOMINFO ="info/register"; //客户信息注册
	public static final String TRAN_PROCODE_SEND_QUERY_CUSTINFO = "info/queryCustInfo"; //客户信息查询
	/*调用卡系统接口，获取卡信息 */
	public static final String JtbQueryForCust = "/Jtbcardservice/account/cardQueryByHold";  //调用交通部卡系统查询
	public static final String ZjbQueryForCust = "/Zjbcardservice/account/cardQueryByHold";  //调用交通部卡系统查询
	public static final String PbocQueryForCust = "/Pboccardservice/account/cardQueryByHold";  //调用交通部卡系统查询
	public static final String binQuery = "51002";  //调用62bin卡系统查询接口
	public static final String termInfoQuery = "/Jtbcardservice/account/keyInfoQuery";  //交通部
	public static final String JtbCardQuery = "/Jtbcardservice/account/cardQuery";//交通部圈存

}
