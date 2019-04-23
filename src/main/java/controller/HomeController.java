package controller;

import com.alibaba.fastjson.JSON;


import dao.LocationDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;


/**
 * Created by ttc on 2018/8/7.
 */
@Controller
public class HomeController {


    @RequestMapping("/")
    public ModelAndView home()
    {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("index");
        return modelAndView;
    }
    @RequestMapping("/get_map")
    public void getMap(HttpServletResponse response) throws Exception{
        LocationDao locationDao = new LocationDao();
        String json = JSON.toJSONString(locationDao.map());
        response.getWriter().print(json);
    }
}

