
package com.pinyougou.pojo.group;

import java.io.Serializable;
import java.util.List;
import com.pinyougou.pojo.TbSpecification;
import com.pinyougou.pojo.TbSpecificationOption;
/**
 * 组合实体类
 * @author jt
 * 
 */
public class Specification implements Serializable {
  /**
   *  规格实体
   */
  private com.pinyougou.pojo.TbSpecification specification;

  /**
   *  规格选项集合
   */
  private List<com.pinyougou.pojo.TbSpecificationOption> specificationOptionList;

  public com.pinyougou.pojo.TbSpecification getSpecification() {
		return specification;
  }

  public void setSpecification(com.pinyougou.pojo.TbSpecification specification) {
		this.specification = specification;
  }

  public List<com.pinyougou.pojo.TbSpecificationOption> getSpecificationOptionList() {
		return specificationOptionList;
  }

  public void setSpecificationOptionList(List<TbSpecificationOption> specificationOptionList) {
		this.specificationOptionList = specificationOptionList;
  }

}
