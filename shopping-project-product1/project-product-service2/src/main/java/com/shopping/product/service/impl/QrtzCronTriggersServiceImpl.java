package com.shopping.product.service.impl;

import com.shopping.product.domain.QrtzCronTriggers;
import com.shopping.product.mapper.QrtzCronTriggersMapper;
import com.shopping.product.service.IQrtzCronTriggersService;
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
public class QrtzCronTriggersServiceImpl extends ServiceImpl<QrtzCronTriggersMapper, QrtzCronTriggers> implements IQrtzCronTriggersService {

}
