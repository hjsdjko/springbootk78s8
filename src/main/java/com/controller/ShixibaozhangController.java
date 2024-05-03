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

import com.entity.ShixibaozhangEntity;
import com.entity.view.ShixibaozhangView;

import com.service.ShixibaozhangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 实习保障
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
@RestController
@RequestMapping("/shixibaozhang")
public class ShixibaozhangController {
    @Autowired
    private ShixibaozhangService shixibaozhangService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShixibaozhangEntity shixibaozhang,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dengjiriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dengjiriqiend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			shixibaozhang.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuanxifuzeren")) {
			shixibaozhang.setYuanxizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShixibaozhangEntity> ew = new EntityWrapper<ShixibaozhangEntity>();
                if(dengjiriqistart!=null) ew.ge("dengjiriqi", dengjiriqistart);
                if(dengjiriqiend!=null) ew.le("dengjiriqi", dengjiriqiend);
		PageUtils page = shixibaozhangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shixibaozhang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShixibaozhangEntity shixibaozhang, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dengjiriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date dengjiriqiend,
		HttpServletRequest request){
        EntityWrapper<ShixibaozhangEntity> ew = new EntityWrapper<ShixibaozhangEntity>();
                if(dengjiriqistart!=null) ew.ge("dengjiriqi", dengjiriqistart);
                if(dengjiriqiend!=null) ew.le("dengjiriqi", dengjiriqiend);
		PageUtils page = shixibaozhangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shixibaozhang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShixibaozhangEntity shixibaozhang){
       	EntityWrapper<ShixibaozhangEntity> ew = new EntityWrapper<ShixibaozhangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shixibaozhang, "shixibaozhang")); 
        return R.ok().put("data", shixibaozhangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShixibaozhangEntity shixibaozhang){
        EntityWrapper< ShixibaozhangEntity> ew = new EntityWrapper< ShixibaozhangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shixibaozhang, "shixibaozhang")); 
		ShixibaozhangView shixibaozhangView =  shixibaozhangService.selectView(ew);
		return R.ok("查询实习保障成功").put("data", shixibaozhangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShixibaozhangEntity shixibaozhang = shixibaozhangService.selectById(id);
        return R.ok().put("data", shixibaozhang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShixibaozhangEntity shixibaozhang = shixibaozhangService.selectById(id);
        return R.ok().put("data", shixibaozhang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShixibaozhangEntity shixibaozhang, HttpServletRequest request){
    	shixibaozhang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shixibaozhang);
        shixibaozhangService.insert(shixibaozhang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShixibaozhangEntity shixibaozhang, HttpServletRequest request){
    	shixibaozhang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shixibaozhang);
        shixibaozhangService.insert(shixibaozhang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShixibaozhangEntity shixibaozhang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shixibaozhang);
        shixibaozhangService.updateById(shixibaozhang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shixibaozhangService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShixibaozhangEntity> wrapper = new EntityWrapper<ShixibaozhangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshigonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuanxifuzeren")) {
			wrapper.eq("yuanxizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shixibaozhangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
