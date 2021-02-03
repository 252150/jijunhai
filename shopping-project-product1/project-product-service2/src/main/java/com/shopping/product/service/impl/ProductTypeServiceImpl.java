package com.shopping.product.service.impl;

import com.shopping.product.domain.TProductType;
import com.shopping.product.mapper.ProductTypeMapper;
import com.shopping.product.service.ProductTypeService;
import com.shopping.redis.interfase.RedisInterfase;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * <p>
 * 商品目录 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-12-24
 */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, TProductType> implements ProductTypeService {
	@Autowired
	private RedisInterfase redisInterfase;
	
	private ObjectMapper objectMapper=new ObjectMapper();
	@Override
	public List<TProductType> findTree() {
//		List<TProductType> pts=this.list(new QueryWrapper<TProductType>().eq("pid", -1));
//		for(TProductType pt:pts) {
//			System.out.print(pt.getId());
//			pt.setProductType(childList(pt.getId()));
//		}
//		return pts;
		
	return	 selectTreeBydis();
	}
	private List<TProductType> selectTreeDb(){
		List<TProductType> pts=this.list();
		List<TProductType> ps=new ArrayList<TProductType>();
		Map<Long,TProductType> maps=new HashMap<Long,TProductType>();
		for(TProductType pt :pts) {
			maps.put(pt.getId(), pt);
		}
		for(TProductType pt:maps.values()) {
			if(pt.getPid()==null||pt.getPid()<=0)ps.add(pt);
			TProductType parent=maps.get(pt.getPid());
			if(parent !=null) {
				if(parent.getProductType()==null)parent.setProductType(new ArrayList<>());
				parent.getProductType().add(pt);
			}
		}
		return ps;
//		for(TProductType pt:pts) {
////			System.out.print(pt.getId());
//			pt.setProductType(childList(pt.getId()));
//		}
//		for(TProductType pt:pts) {
//			if(pt.getId()==null||pt.getPid()<=0)ps.add(pt);
//			List<TProductType> cs=new ArrayList<>();
//			for(TProductType p:pts) {
//				if(pt.getId().toString().equals(p.getPid().toString())) {
//					cs.add(p);
//				}else {
//					cs.add(null);
//				}
//
//			}
//			pt.setProductType(cs);
//		}
	
	}
    
    @SuppressWarnings("unchecked")
	private  List<TProductType> selectTreeBydis(){
    	String ts=redisInterfase.getValue("types");
    	List<TProductType> pts=new ArrayList<TProductType>();
    	if(ts==null||ts.trim().equals("")) {
    		 pts=selectTreeDb();
    		String value;
			try {
				value = objectMapper.writeValueAsString(pts);
				redisInterfase.setValue("types",value );
			} catch (JsonProcessingException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
    		
    	}else {
    		try {
				pts=objectMapper.readValue(ts, pts.getClass());
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
    	}
    	return pts;
    }
	@Override
	public List<TProductType> childList(Long id) {
		List<TProductType> pts=	this.list(new QueryWrapper<TProductType>().eq("pid",id));
		if(pts==null ||pts.size()<=0)return null;
		for(TProductType pt:pts) {
			List<TProductType> ps=childList(pt.getId());
			pt.setProductType(ps);
		}
		return pts;
	}
	@Override
	public List<TProductType> child() {
		List<TProductType> pts=this.list();
		List<TProductType> ps=new ArrayList<TProductType>();
		Map<Long,TProductType> maps=new HashMap<Long,TProductType>();
		for(TProductType pt :pts) {
			maps.put(pt.getId(), pt);
		}
		for(TProductType pt:maps.values()) {
			if(pt.getPid()==null||pt.getPid()<=0)ps.add(pt);
			TProductType parent=maps.get(pt.getPid());
			if(parent !=null) {
				if(parent.getProductType()==null)parent.setProductType(new ArrayList<>());
				parent.getProductType().add(pt);
			}
		}
		return ps;
		
	}

}
