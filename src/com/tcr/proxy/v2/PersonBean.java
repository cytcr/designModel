package com.tcr.proxy.v2;

/**
 * 描述:
 * 人物
 * @author TCR 670830864@qq.com
 * @date 2019/11/25 10:21
 */
public interface PersonBean {

    /**
     * 获取人名
     * @author TCR 670830864@qq.com
     * @date 2019/11/25 10:29
     * @return java.lang.String
    */
    String getName();

    /**
     * 获取性别
     * @author TCR 670830864@qq.com
     * @date 2019/11/25 10:29
     * @return java.lang.String
     */
    String getGender();

    /**
     * 获取兴趣爱好
     * @author TCR 670830864@qq.com
     * @date 2019/11/25 10:29
     * @return java.lang.String
     */
    String getInterests();

    /**
     * 获取评分（1-10）
     * @author TCR 670830864@qq.com
     * @date 2019/11/25 10:29
     * @return java.lang.String
     */
    int getHotOrNotRating();

    /**
     * 设置人名
     * @author TCR 670830864@qq.com
     * @date 2019/11/25 10:29
     * @return java.lang.String
     */
    void setName(String name);

    /**
     * 设置性别
     * @author TCR 670830864@qq.com
     * @date 2019/11/25 10:29
     * @return java.lang.String
     */
    void setGender(String gender);

    /**
     * 设置爱好
     * @author TCR 670830864@qq.com
     * @date 2019/11/25 10:29
     * @return java.lang.String
     */
    void setInterests(String interests);

    /**
     * 评分（1-10）
     * @author TCR 670830864@qq.com
     * @date 2019/11/25 10:29
     * @return java.lang.String
     */
    void setHotOrNotRating(int rating);

}