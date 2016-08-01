package com.xjk.practice.test;

/**
 * @date: 2016/04/26
 * @author: xujinkai
 */

public enum EnumTest {

        INTEREST                (1, "利息"),
        CHARGES                 (2, "费用"),
        PENALTY                 (3, "罚息"),
        OVERDUE                 (4, "逾期费(滞纳金)"),
        VIOLATE_PREPAY          (5, "提前还款违约金"),
        VIOLATE_REFUND          (6, "退款违约金"),
        SERVICE_CHANGE_OF_PLAN  (7, "分期计划变更服务费");

        private Integer type;
        private String desc;

        EnumTest(Integer type, String desc) {
            this.type = type;
            this.desc = desc;
        }


        public Integer getType() {
            return type;
        }

        public String getDesc() {
            return desc;
        }

    public static void main(String[] args) {

        System.out.println(EnumTest.INTEREST.getType());
    }

}
