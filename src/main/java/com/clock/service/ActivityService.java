package com.clock.service;

import com.clock.entity.Activity;
import com.clock.mapper.ActivityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {
    @Autowired private ActivityMapper activityMapper;
    public int insertActivityInfo(Activity activity){
        return activityMapper.insertActivityInfo(activity);
    }

    public List<Activity> getActivityListByWx_open_id(String wx_open_id, int start,
                                                      int page_size){
        return activityMapper.getActivityListByWx_open_id(wx_open_id,start,page_size);
    }
}
