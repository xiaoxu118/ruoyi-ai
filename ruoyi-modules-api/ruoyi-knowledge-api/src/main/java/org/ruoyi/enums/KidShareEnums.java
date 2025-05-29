package org.ruoyi.enums;

import lombok.Getter;

/**
 * @Description:  知识库 是否公开
 * @Date: 2025/5/28 下午4:50
 */
@Getter
public enum KidShareEnums {

  SHARE_0(0, "不公开"),
  SHARE_1(1, "公开"),
  ;

  /**
   * 类型
   */
  private final Integer type;
  /**
   * 名字
   */
  private final String name;

  KidShareEnums(Integer type, String name) {
    this.type = type;
    this.name = name;
  }
}
