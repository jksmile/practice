package com.xjk.practice.test;

/**
 * @date: 2016/08/11
 * @author: xujinkai
 */

public  enum ActionFlagEnum {

    ACTION_FLAG_NOTICE_APP(1,"Send msg to APP."),

    ACTION_FLAG_NOTICE_RISK(2,"Send msg to risk.");


    private int flagCode;

    private String flagDesc;

    ActionFlagEnum(int flagCode, String flagDesc) {

        this.flagCode = flagCode;

        this.flagDesc = flagDesc;
    }

    public int getFlagCode() {

        return flagCode;
    }

    public String getFlagDesc() {

        return flagDesc;
    }


}
