package cn.java.controller;/*
 * @Author:叶婉婷
 * @DATE:2020/12/14
 *
 */
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@Controller
@ControllerAdvice
public class ExceptionController {
    private static Logger logger = Logger.getLogger(ExceptionController.class);


    //将异常记入日志文件
    @ExceptionHandler(Exception.class)
    public void handException(Exception ex) {
        String errorMessage = ex.getMessage();
        logger.debug(errorMessage);
    }

    // 将异常计入日志文件
    @ExceptionHandler(ArithmeticException.class)
    public void arithexceptHand(Exception ex) {
        String errorMessage = ex.getMessage();
        logger.debug(errorMessage);

    }
}
