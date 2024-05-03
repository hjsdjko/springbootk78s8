package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DanweifankuiEntity;
import com.entity.view.DanweifankuiView;

import com.service.DanweifankuiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 单位反馈
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
@RestController
@RequestMapping("/danweifankui")
public class DanweifankuiController {
    @Autowired
    private DanweifankuiService danweifankuiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DanweifankuiEntity danweifankui,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fankuiriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fankuiriqiend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shixidanwei")) {
			danweifankui.setDanweimingcheng((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			danweifankui.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			danweifankui.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DanweifankuiEntity> ew = new EntityWrapper<DanweifankuiEntity>();
                if(fankuiriqistart!=null) ew.ge("fankuiriqi", fankuiriqistart);
                if(fankuiriqiend!=null) ew.le("fankuiriqi", fankuiriqiend);
		PageUtils page = danweifankuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, danweifankui), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DanweifankuiEntity danweifankui, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fankuiriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fankuiriqiend,
		HttpServletRequest request){
        EntityWrapper<DanweifankuiEntity> ew = new EntityWrapper<DanweifankuiEntity>();
                if(fankuiriqistart!=null) ew.ge("fankuiriqi", fankuiriqistart);
                if(fankuiriqiend!=null) ew.le("fankuiriqi", fankuiriqiend);
		PageUtils page = danweifankuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, danweifankui), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DanweifankuiEntity danweifankui){
       	EntityWrapper<DanweifankuiEntity> ew = new EntityWrapper<DanweifankuiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( danweifankui, "danweifankui")); 
        return R.ok().put("data", danweifankuiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DanweifankuiEntity danweifankui){
        EntityWrapper< DanweifankuiEntity> ew = new EntityWrapper< DanweifankuiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( danweifankui, "danweifankui")); 
		DanweifankuiView danweifankuiView =  danweifankuiService.selectView(ew);
		return R.ok("查询单位反馈成功").put("data", danweifankuiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DanweifankuiEntity danweifankui = danweifankuiService.selectById(id);
        return R.ok().put("data", danweifankui);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DanweifankuiEntity danweifankui = danweifankuiService.selectById(id);
        return R.ok().put("data", danweifankui);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DanweifankuiEntity danweifankui, HttpServletRequest request){
    	danweifankui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(danweifankui);
        danweifankuiService.insert(danweifankui);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DanweifankuiEntity danweifankui, HttpServletRequest request){
    	danweifankui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(danweifankui);
        danweifankuiService.insert(danweifankui);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DanweifankuiEntity danweifankui, HttpServletRequest request){
        //ValidatorUtils.validateEntity(danweifankui);
        danweifankuiService.updateById(danweifankui);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        danweifankuiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DanweifankuiEntity> wrapper = new EntityWrapper<DanweifankuiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shixidanwei")) {
			wrapper.eq("danweimingcheng", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshigonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = danweifankuiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
