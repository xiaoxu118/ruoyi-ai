package org.ruoyi.enums;

import lombok.Getter;

/**
 * @Description:  知识库 权限类型
 * @Date: 2025/5/28 下午4:50
 */
@Getter
public enum KidAuthTypeEnums {

  AUTH_TYPE_10("10", "本人可见"),
  AUTH_TYPE_20("20", "角色可见"),
  ;

  /**
   * 类型
   */
  private final String code;
  /**
   * 名字
   */
  private final String name;

  KidAuthTypeEnums(String code, String name) {
    this.code = code;
    this.name = name;
  }
}
