package com.clock.mapper;

import com.clock.entity.Activity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ActivityMapper {
    int insertActivityInfo(Activity activity);
    List<Activity> getActivityListByWx_open_id(@Param("wx.open_id") String wx_open_id,
                                               @Param("start") int start,
                                               @Param("page_size") int page_size);
}
