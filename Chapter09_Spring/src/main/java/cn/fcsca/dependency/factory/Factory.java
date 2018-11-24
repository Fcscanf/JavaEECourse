package cn.fcsca.dependency.factory;

import cn.fcsca.dependency.face.Human;
import cn.fcsca.dependency.face.impl.American;
import cn.fcsca.dependency.face.impl.Chinese;

/**
 * Factory
 *
 * @author Fcscanf
 * @description
 * @date 下午 23:30 2018-11-24
 */
public class Factory {
    public Human getHuman(String name) throws IllegalAccessException {
        if (name.equals("Chinese")) {
            return new Chinese();
        } else if (name.equals("American")) {
            return new American();
        } else {
            throw new IllegalAccessException("参数不正确");
        }
    }
}
