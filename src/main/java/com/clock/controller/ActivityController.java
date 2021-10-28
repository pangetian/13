package com.clock.controller;

import com.clock.entity.Activity;
import com.clock.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ActivityController {
    @Autowired private ActivityService activityService;
    @RequestMapping("insert_activity_info_auto_bind")
    public int insertActivityInfo(Activity activity){
        int retValue = 0;
        retValue = activityService.insertActivityInfo(activity);
        return retValue;


    }
}
