package com.campus.myapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.campus.myapp.vo.PagingVO;
import com.campus.myapp.vo.RestaurantVO;
import com.campus.myapp.vo.memberVO;

@Mapper
@Repository
public interface RestaurantDAO {
	// 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쌉몌옙占� 占쏙옙占쏙옙
	public List<RestaurantVO> restaurantList(PagingVO vo);
		
	public int restaurantInsert(RestaurantVO vo);
	public List<RestaurantVO> restaurantMyList(String userid);
	public int restaurantDel (int resno);
	public RestaurantVO restaurantUpdateList(int resno);
	public int maxResno ();
	public String restarantImgDel(int resno);
	public int restaurantUpdateOk(RestaurantVO vo);
	
	//占쏙옙占쏙옙 클占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쌔댐옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쌉몌옙玖占� 占쏙옙占싱곤옙 占싹깍옙.
	public List<RestaurantVO> restaurantList_world(String nation);
	public List<RestaurantVO> restaurantList_restype(String resty);
	//�젅�뒪�넗�옉 �꽌移섑럹�씠吏�
	public List<RestaurantVO> resList(RestaurantVO vo);
	public RestaurantVO resSelect(int resno);
}
