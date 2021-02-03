package com.shopping.product.service.impl;

import com.shopping.product.domain.QrtzFiredTriggers;
import com.shopping.product.mapper.QrtzFiredTriggersMapper;
import com.shopping.product.service.IQrtzFiredTriggersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-03-04
 */
@Service
public class QrtzFiredTriggersServiceImpl extends ServiceImpl<QrtzFiredTriggersMapper, QrtzFiredTriggers> implements IQrtzFiredTriggersService {

}
