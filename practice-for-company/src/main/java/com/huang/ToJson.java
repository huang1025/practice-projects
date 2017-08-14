package com.huang;

import com.huang.base.util.StringToType;
import com.huang.base.util.StringUtil;

import java.math.BigDecimal;

/**
 * Created by huang_jiangling on 2017/8/11.
 */
public class ToJson {

    public static void main(String[] args) {
        String key = "cons_tot_m12_num\n" +
                "als_m3_id_tot_mons\n" +
                "als_m12_cell_max_monnum\n" +
                "als_m6_id_nbank_p2p_allnum\n" +
                "als_d15_cell_nbank_orgnum\n" +
                "L36M_UP_BASE_MAX\n" +
                "L12M_GJJ_GET_AMOUNT\n" +
                "L12M_BASE_ALTER_RATE\n" +
                "M24_MONTH\n" +
                "l6m_dn_clt_mean\n" +
                "l3m_nig_clmn\n" +
                "L2M_K2_NGT_TMS_RATE\n" +
                "l3m_mbl_ib_cnt\n" +
                "sl_id_court_executed\n" +
                "sl_id_court_bad\n" +
                "sl_id_abnormal\n" +
                "sl_cell_abnormal\n" +
                "sl_lm_cell_abnormal\n" +
                "flag_consumption_c\n" +
                "ir_cell_x_id_cnt\n" +
                "ir_id_x_cell_cnt\n" +
                "ir_id_x_cell_lastchg_days\n" +
                "ir_m6_id_x_cell_cnt\n" +
                "ir_m3_id_x_cell_cnt\n" +
                "ir_m1_id_x_cell_cnt\n" +
                "cons_tot_m12_num\n" +
                "als_m3_id_tot_mons\n" +
                "als_m12_cell_max_monnum\n" +
                "als_m6_id_nbank_p2p_allnum\n" +
                "als_d15_cell_nbank_orgnum\n" +
                "L36M_UP_BASE_MAX\n" +
                "L12M_GJJ_GET_AMOUNT\n" +
                "L12M_BASE_ALTER_RATE\n" +
                "M24_MONTH\n" +
                "l6m_dn_clt_mean\n" +
                "l3m_nig_clmn\n" +
                "L2M_K2_NGT_TMS_RATE\n" +
                "l3m_mbl_ib_cnt\n" +
                "sl_id_court_executed\n" +
                "sl_id_court_bad\n" +
                "sl_id_abnormal\n" +
                "sl_cell_abnormal\n" +
                "sl_lm_cell_abnormal\n" +
                "flag_consumption_c\n" +
                "ir_cell_x_id_cnt\n" +
                "ir_id_x_cell_cnt\n" +
                "ir_id_x_cell_lastchg_days\n" +
                "ir_m6_id_x_cell_cnt\n" +
                "ir_m3_id_x_cell_cnt\n" +
                "ir_m1_id_x_cell_cnt";
        String value = "近12个月消费次数总和\n" +
                "按身份证号查询，近3个月有申请记录月份数\n" +
                "按手机号查询，近12个月最大月申请次数\n" +
                "按身份证号查询，近6个月在非银机构-p2p申请次数\n" +
                "按手机号查询，近15天在非银机构申请机构数\n" +
                "最近3年缴交额上升最大值\n" +
                "近1年公积金累计提取金额\n" +
                "近1年缴交额变更比率\n" +
                "近2年连续缴交月数\n" +
                "最近6个月凌晨通话时长均值\n" +
                "最近第3个月深夜通话手机数量\n" +
                "最近2个月K2联系人晚上的通话次数占比\n" +
                "最近3个月被叫手机数\n" +
                "通过身份证号查询法院被执行人\n" +
                "通过身份证号查询法院失信人\n" +
                "通过身份证号查询高危行为\n" +
                "通过手机号查询高危行为\n" +
                "通过联系人手机查询高危行为\n" +
                "商品消费评估产品输出标识\n" +
                "手机号关联身份证个数\n" +
                "身份证关联手机号个数\n" +
                "手机号变化距今天数\n" +
                "近6个月关联手机号码数\n" +
                "近3个月关联手机号码数\n" +
                "近1个月关联手机号码数\n" +
                "近12个月消费次数总和\n" +
                "按身份证号查询，近3个月有申请记录月份数\n" +
                "按手机号查询，近12个月最大月申请次数\n" +
                "按身份证号查询，近6个月在非银机构-p2p申请次数\n" +
                "按手机号查询，近15天在非银机构申请机构数\n" +
                "最近3年缴交额上升最大值\n" +
                "近1年公积金累计提取金额\n" +
                "近1年缴交额变更比率\n" +
                "近2年连续缴交月数\n" +
                "最近6个月凌晨通话时长均值\n" +
                "最近第3个月深夜通话手机数量\n" +
                "最近2个月K2联系人晚上的通话次数占比\n" +
                "最近3个月被叫手机数\n" +
                "通过身份证号查询法院被执行人\n" +
                "通过身份证号查询法院失信人\n" +
                "通过身份证号查询高危行为\n" +
                "通过手机号查询高危行为\n" +
                "通过联系人手机查询高危行为\n" +
                "商品消费评估产品输出标识\n" +
                "手机号关联身份证个数\n" +
                "身份证关联手机号个数\n" +
                "手机号变化距今天数\n" +
                "近6个月关联手机号码数\n" +
                "近3个月关联手机号码数\n" +
                "近1个月关联手机号码数";
        String type = "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "字符\n" +
                "字符\n" +
                "字符\n" +
                "字符\n" +
                "字符\n" +
                "字符\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "字符\n" +
                "字符\n" +
                "字符\n" +
                "字符\n" +
                "字符\n" +
                "字符\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值\n" +
                "数值";

        String[] keys = key.split("\n");
        String[] values = value.split("\n");
        String[] types = type.split("\n");

        System.out.println(StringUtil.toFields(keys, values, types, new StringToType() {
            @Override
            public Class getType(String type) {
                if ("字符".equals(type)) {
                    return String.class;
                } else if ("数值".equals(type)) {
                    return BigDecimal.class;
                }
                return null;
            }
        }, true));
    }
}
