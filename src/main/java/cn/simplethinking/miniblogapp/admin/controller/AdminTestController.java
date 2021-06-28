package cn.simplethinking.miniblogapp.admin.controller;

import cn.simplethinking.miniblogapp.system.response.Result;
import cn.simplethinking.miniblogapp.system.response.ResultEnum;
import cn.simplethinking.miniblogapp.system.response.ResultUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @description
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @see
 * @since
 */
@RestController
@RequestMapping("/test")
public class AdminTestController implements AdminCommonController {
    @RequestMapping("/test1")
    @ResponseBody
    public Result test() {
//        System.out.println(FileUploadUtil.giteeUpload());
        return ResultUtil.success(ResultEnum.GLOBAL_SUCCESS.getCode(), ResultEnum.GLOBAL_SUCCESS.getMessage());
    }
}
