package com.tcr.proxy.v2;

/**
 * 描述:
 *
 * @author TCR 670830864@qq.com
 * @date 2019/11/25 10:32
 */
public class PersonBeanImpl implements PersonBean {

    /** 名称*/
    String name;
    /** 名称*/
    String gender;
    /** 名称*/
    String inerests;
    /** 评分*/
    int rating;
    /** 评分次数*/
    int ratingCount;


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public String getInterests() {
        return this.inerests;
    }

    @Override
    public int getHotOrNotRating() {
        if(ratingCount == 0){
            return 0;
        }
        return rating/ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.inerests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        this.ratingCount++;
    }
}
