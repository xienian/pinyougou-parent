
package com.pinyougou.pojo.group;

import java.io.Serializable;
import java.util.List;
import com.pinyougou.pojo.TbGoods;
import com.pinyougou.pojo.TbGoodsDesc;
import com.pinyougou.pojo.TbItem;
/**
 * 商品的组合实体类
 * @author jt
 * 
 */
public class Goods implements Serializable {
  /**
   *  商品信息
   */
  private com.pinyougou.pojo.TbGoods goods;

  /**
   *  商品扩展信息
   */
  private com.pinyougou.pojo.TbGoodsDesc goodsDesc;

  /**
   *  SKU的列表信息
   */
  private List<com.pinyougou.pojo.TbItem> itemList;

  public com.pinyougou.pojo.TbGoods getGoods() {
		return goods;
  }

  public void setGoods(com.pinyougou.pojo.TbGoods goods) {
		this.goods = goods;
  }

  public com.pinyougou.pojo.TbGoodsDesc getGoodsDesc() {
		return goodsDesc;
  }

  public void setGoodsDesc(com.pinyougou.pojo.TbGoodsDesc goodsDesc) {
		this.goodsDesc = goodsDesc;
  }

  public List<com.pinyougou.pojo.TbItem> getItemList() {
		return itemList;
  }

  public void setItemList(List<TbItem> itemList) {
		this.itemList = itemList;
  }

}
