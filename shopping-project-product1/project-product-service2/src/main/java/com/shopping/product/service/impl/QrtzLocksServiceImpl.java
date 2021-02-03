package com.shopping.product.service.impl;

import com.shopping.product.domain.QrtzLocks;
import com.shopping.product.mapper.QrtzLocksMapper;
import com.shopping.product.service.IQrtzLocksService;
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
public class QrtzLocksServiceImpl extends ServiceImpl<QrtzLocksMapper, QrtzLocks> implements IQrtzLocksService {

}
