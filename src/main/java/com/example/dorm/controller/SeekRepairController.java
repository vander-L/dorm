package com.example.dorm.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.dorm.entity.Repair;
import com.example.dorm.mapper.RepairMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
public class SeekRepairController {

    @Autowired
    RepairMapper repairMapper;

    @RequestMapping(value = "/toSeekRepair")
    public String seekRepair(String id, String name, String tel, String dormID, String type, String solveInfo, String beginTime, String endTime, Model model) throws ParseException {
        HashMap<String, Object> map = new HashMap<>();
        UpdateWrapper<Repair> wrapper = new UpdateWrapper<>();
        if (!id.equals("")) map.put("id",Long.parseLong(id));
        if (!name.equals("")) map.put("name",name);
        if (!tel.equals("")) map.put("tel",tel);
        if (!dormID.equals("")) map.put("dormID",dormID);
        if (!type.equals("")) map.put("type",type);
        if (!solveInfo.equals("")) map.put("solveInfo",solveInfo);
        if (!beginTime.equals("") && !endTime.equals("")){
            Date begin = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(beginTime);
            Date end = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(endTime);
            wrapper.between("time", begin, end);
        }
        wrapper.allEq(map);
        List<Repair> repairs = repairMapper.selectList(wrapper);
        model.addAttribute("repairs", repairs);
        return "admin/seekRepair";
    }
}
