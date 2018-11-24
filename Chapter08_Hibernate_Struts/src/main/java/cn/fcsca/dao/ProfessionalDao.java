package cn.fcsca.dao;

import cn.fcsca.model.Professional;

import java.util.List;

/**
 * ProfessionalDao
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:26 2018-11-19
 */
public interface ProfessionalDao {

    /**
     * 根据专业ID查询专业信息
     *
     * @param professionalId
     * @return Professional
     * @author Fcscanf
     * @date 下午 13:31 2018-11-19
     */
    public Professional getProfessionalById(Integer professionalId);

    /**
     * 查询所有专业信息
     *
     * @param
     * @return list
     * @author Fcscanf
     * @date 下午 13:31 2018-11-19
     */
    public List getAllProfessional();
}
