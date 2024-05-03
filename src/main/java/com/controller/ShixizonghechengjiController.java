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

import com.entity.ShixizonghechengjiEntity;
import com.entity.view.ShixizonghechengjiView;

import com.service.ShixizonghechengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 实习综合成绩
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
@RestController
@RequestMapping("/shixizonghechengji")
public class ShixizonghechengjiController {
    @Autowired
    private ShixizonghechengjiService shixizonghechengjiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShixizonghechengjiEntity shixizonghechengji,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date tianjiariqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date tianjiariqiend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			shixizonghechengji.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			shixizonghechengji.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuanxifuzeren")) {
			shixizonghechengji.setYuanxizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShixizonghechengjiEntity> ew = new EntityWrapper<ShixizonghechengjiEntity>();
                if(tianjiariqistart!=null) ew.ge("tianjiariqi", tianjiariqistart);
                if(tianjiariqiend!=null) ew.le("tianjiariqi", tianjiariqiend);
		PageUtils page = shixizonghechengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shixizonghechengji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShixizonghechengjiEntity shixizonghechengji, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date tianjiariqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date tianjiariqiend,
		HttpServletRequest request){
        EntityWrapper<ShixizonghechengjiEntity> ew = new EntityWrapper<ShixizonghechengjiEntity>();
                if(tianjiariqistart!=null) ew.ge("tianjiariqi", tianjiariqistart);
                if(tianjiariqiend!=null) ew.le("tianjiariqi", tianjiariqiend);
		PageUtils page = shixizonghechengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shixizonghechengji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShixizonghechengjiEntity shixizonghechengji){
       	EntityWrapper<ShixizonghechengjiEntity> ew = new EntityWrapper<ShixizonghechengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shixizonghechengji, "shixizonghechengji")); 
        return R.ok().put("data", shixizonghechengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShixizonghechengjiEntity shixizonghechengji){
        EntityWrapper< ShixizonghechengjiEntity> ew = new EntityWrapper< ShixizonghechengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shixizonghechengji, "shixizonghechengji")); 
		ShixizonghechengjiView shixizonghechengjiView =  shixizonghechengjiService.selectView(ew);
		return R.ok("查询实习综合成绩成功").put("data", shixizonghechengjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShixizonghechengjiEntity shixizonghechengji = shixizonghechengjiService.selectById(id);
        return R.ok().put("data", shixizonghechengji);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShixizonghechengjiEntity shixizonghechengji = shixizonghechengjiService.selectById(id);
        return R.ok().put("data", shixizonghechengji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShixizonghechengjiEntity shixizonghechengji, HttpServletRequest request){
    	shixizonghechengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shixizonghechengji);
        shixizonghechengjiService.insert(shixizonghechengji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShixizonghechengjiEntity shixizonghechengji, HttpServletRequest request){
    	shixizonghechengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shixizonghechengji);
        shixizonghechengjiService.insert(shixizonghechengji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShixizonghechengjiEntity shixizonghechengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shixizonghechengji);
        shixizonghechengjiService.updateById(shixizonghechengji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shixizonghechengjiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShixizonghechengjiEntity> wrapper = new EntityWrapper<ShixizonghechengjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshigonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuanxifuzeren")) {
			wrapper.eq("yuanxizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shixizonghechengjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
