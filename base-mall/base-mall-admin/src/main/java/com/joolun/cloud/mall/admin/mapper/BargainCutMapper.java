/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.joolun.com
 * 注意：
 * 本软件为www.joolun.com开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package com.joolun.cloud.mall.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.joolun.cloud.mall.common.entity.BargainCut;

import java.math.BigDecimal;

/**
 * 砍价帮砍记录
 *
 * @author JL
 * @date 2019-12-31 12:34:28
 */
public interface BargainCutMapper extends BaseMapper<BargainCut> {

	/**
	 * 获取砍价已砍总金额
	 * @param bargainUserId
	 * @return
	 */
	BigDecimal getTotalCutPrice(String bargainUserId);
}
