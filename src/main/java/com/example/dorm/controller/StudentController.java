package com.example.dorm.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.dorm.entity.Student;
import com.example.dorm.mapper.BuildingMapper;
import com.example.dorm.mapper.ReplaceMapper;
import com.example.dorm.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Wrapper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/toSeekStudent")
    public String seekStudent(String id, String name, String pro, String cla, String sex, String building, String dorm, String beginTime, String endTime, Model model) throws ParseException {
        HashMap<String, Object> map = new HashMap<>();
        UpdateWrapper<Student> wrapper = new UpdateWrapper<>();
        if (!id.equals("")) map.put("id", Long.parseLong(id));
        if (!name.equals("")) map.put("name", name);
        if (!pro.equals("")) map.put("pro", pro);
        if (!cla.equals("")) map.put("cla", cla);
        if (!sex.equals("")) map.put("sex", sex.equals("男")?1:0);
        if (!building.equals("")) map.put("building", building);
        if (!dorm.equals("")) map.put("dorm", dorm);
        if (!beginTime.equals("") && !endTime.equals("")){
            Date begin = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(beginTime);
            Date end = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(endTime);
            wrapper.between("time", begin, end);
        }
        wrapper.allEq(map);
        List<Student> students = studentMapper.selectList(wrapper);
        model.addAttribute("students", students);
        return "admin/seekStudent";
    }

}
