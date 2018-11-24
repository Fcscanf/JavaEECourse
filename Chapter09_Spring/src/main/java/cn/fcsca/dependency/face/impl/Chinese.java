package cn.fcsca.dependency.face.impl;

import cn.fcsca.dependency.face.Human;
import cn.fcsca.dependency.face.Language;

/**
 * Chinese
 *
 * @author Fcscanf
 * @description
 * @date 下午 23:23 2018-11-24
 */
public class Chinese implements Human {

    private Language language;

    /**
     * 设置注入
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 上午 0:36 2018-11-25
     */
    public void setLanguage(Language language) {
        this.language = language;
    }

    public Chinese() {
    }

    /**
     * 构造注入的有参无参构造方法
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 上午 0:37 2018-11-25
     */
    public Chinese(Language language) {
        this.language = language;
    }

    @Override
    public void eat() {
        System.out.println("中国人会吃！");
    }

    @Override
    public void walk() {
        System.out.println("中国人会飞！");
    }

    @Override
    public void speak() {
        System.out.println(language.kind());
    }
}
