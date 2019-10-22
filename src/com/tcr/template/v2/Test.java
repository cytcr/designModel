package com.tcr.template.v2;

import com.tcr.template.v1.Coffee;

/**
 * 描述:
 *
 * @author TCR
 * @email 670830864@qq.com
 * @date 2019/10/22 9:34
 */
public class Test {
    public static void main(String[] args) {

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("-----------------------");
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
