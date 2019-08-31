package com.jang.sell.util;

import com.jang.sell.vo.ResultVO;

/**
 * title ResultVOUtil
 * projectName sell
 * desc 工具类
 *
 * @author Jang
 * @date 2019/8/31 18:04
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String message) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(message);
        return resultVO;
    }

}
